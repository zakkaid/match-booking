package com.example.MatchBooking.service.player;

import com.example.MatchBooking.command.PlayerCommand;
import com.example.MatchBooking.domain.Player;

public interface PlayerService {
    Player createPlayer(PlayerCommand playerCommand);
    Player getPlayerById(String id);
}
