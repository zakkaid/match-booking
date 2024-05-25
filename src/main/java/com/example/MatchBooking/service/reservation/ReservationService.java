package com.example.MatchBooking.service.reservation;

import com.example.MatchBooking.command.ReservationCommand;
import com.example.MatchBooking.domain.Reservation;
import com.example.MatchBooking.dto.ReservationDTO;

import java.time.LocalDateTime;
import java.util.List;

public interface ReservationService {
    Reservation reserveField(ReservationCommand reservationCommand);
    List<ReservationDTO> getAllReservations(String id);
    boolean isAvailable(String id, LocalDateTime localDateTime);
}
