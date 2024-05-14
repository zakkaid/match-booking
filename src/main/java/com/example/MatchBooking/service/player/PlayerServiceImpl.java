package com.example.MatchBooking.service.player;

import com.example.MatchBooking.command.PlayerCommand;
import com.example.MatchBooking.domain.Player;
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
}
