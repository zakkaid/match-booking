package com.example.MatchBooking.service.player;

import com.example.MatchBooking.command.PlayerCommand;
import com.example.MatchBooking.domain.Field;
import com.example.MatchBooking.domain.Player;
import com.example.MatchBooking.domain.Reservation;
import com.example.MatchBooking.repositories.PlayerRepository;
import com.example.MatchBooking.service.field.FieldService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlayerServiceImpl implements PlayerService{

    private final PlayerRepository playerRepository;
    private final FieldService fieldService;
    @Override
    public Player createPlayer(PlayerCommand playerCommand) {
        Player player = new Player(playerCommand);
        return playerRepository.save(player);
    }



}
