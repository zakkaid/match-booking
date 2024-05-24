package com.example.MatchBooking.service.player;

import com.example.MatchBooking.command.PlayerCommand;
import com.example.MatchBooking.domain.Player;
import com.example.MatchBooking.exception.BusinessException;
import com.example.MatchBooking.exception.ExceptionPayload;
import com.example.MatchBooking.exception.ExceptionPayloadFactory;
import com.example.MatchBooking.repositories.PlayerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PlayerServiceImpl implements PlayerService{

    private final PlayerRepository playerRepository;
    @Override
    public Player createPlayer(PlayerCommand playerCommand) {
        playerCommand.validate();
        Player player = new Player(playerCommand);
        return playerRepository.save(player);
    }

    @Override
    public Player getPlayerById(String id) {
        return playerRepository.findById(id).orElseThrow(
                ()-> new BusinessException(ExceptionPayloadFactory.PLAYER_NOT_FOUND.get())
        );
    }
}
