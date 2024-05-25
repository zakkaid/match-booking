package com.example.MatchBooking.service.player;

import com.example.MatchBooking.command.PlayerLoginCommand;
import com.example.MatchBooking.command.PlayerCommand;
import com.example.MatchBooking.domain.Player;
import com.example.MatchBooking.dto.PlayerDTO;

public interface PlayerService {
    Player createPlayer(PlayerCommand playerCommand);
    Player getPlayerById(String id);
    PlayerDTO authenticate(PlayerLoginCommand playerLoginCommand);
}
