package com.example.MatchBooking.service.player;

import com.example.MatchBooking.command.PlayerCommand;
import com.example.MatchBooking.command.PlayerLoginCommand;
import com.example.MatchBooking.domain.Player;
import com.example.MatchBooking.dto.PlayerDTO;
import com.example.MatchBooking.dto.mapper.PlayerMapper;
import com.example.MatchBooking.exception.BusinessException;
import com.example.MatchBooking.exception.ExceptionPayloadFactory;
import com.example.MatchBooking.repositories.PlayerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PlayerServiceImpl implements PlayerService{

    private final PlayerRepository playerRepository;
    private final PlayerMapper playerMapper;
    @Override
    public Player createPlayer(PlayerCommand playerCommand) {
        playerCommand.validate();
        if(playerRepository.emailAlreadyExist(playerCommand.getEmail()))
            throw new BusinessException(ExceptionPayloadFactory.EMAIL_ALREADY_EXIST.get());
        Player player = new Player(playerCommand);
        return playerRepository.save(player);
    }

    @Override
    public Player getPlayerById(String id) {
        return playerRepository.findById(id).orElseThrow(
                ()-> new BusinessException(ExceptionPayloadFactory.PLAYER_NOT_FOUND.get())
        );
    }

    @Override
    public PlayerDTO authenticate(PlayerLoginCommand playerLoginCommand) {
        playerLoginCommand.validate();
        if(!playerRepository.credentialsTrue(playerLoginCommand.getEmail(), playerLoginCommand.getPassword()))
            throw  new BusinessException(ExceptionPayloadFactory.PLAYER_NOT_FOUND.get());
        else
            return playerMapper.toPlayerDTO(
                    playerRepository.findIdByEmailAndPassword(playerLoginCommand.getEmail(), playerLoginCommand.getPassword())
            ) ;
    }
}
