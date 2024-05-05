package com.example.MatchBooking.repositories;

import com.example.MatchBooking.domain.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository< Player, String> {

}
