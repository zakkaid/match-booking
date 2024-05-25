package com.example.MatchBooking.repositories;

import com.example.MatchBooking.domain.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, String> {
    @Query("SELECT r from Reservation r where r.reservedBy.id = ?1 and r.deleted = false and r.matchEndAt < CURRENT_TIMESTAMP")
   List<Reservation> findPlayerReservations(String id);
}
