package com.example.MatchBooking.repositories;

import com.example.MatchBooking.domain.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository< Player, String> {
    @Query("SELECT CASE WHEN COUNT(u) > 0 THEN true ELSE false END FROM Player u WHERE u.email = ?1 and u.password =?2")
    boolean credentialsTrue(String email , String password);
    @Query("SELECT u FROM Player u WHERE u.email = ?1 AND u.password = ?2")
    Player findIdByEmailAndPassword(String email , String password);
    @Query("SELECT CASE WHEN (COUNT(e) > 0) THEN true ELSE false END FROM Player e WHERE e.email = ?1")
    boolean emailAlreadyExist(String email);
}
