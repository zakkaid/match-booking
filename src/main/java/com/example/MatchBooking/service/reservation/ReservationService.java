package com.example.MatchBooking.service.reservation;

import com.example.MatchBooking.command.ReservationCommand;
import com.example.MatchBooking.domain.Reservation;

public interface ReservationService {
    Reservation reserveField(ReservationCommand reservationCommand);
}
