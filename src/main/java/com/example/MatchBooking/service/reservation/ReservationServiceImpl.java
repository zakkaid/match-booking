package com.example.MatchBooking.service.reservation;

import com.example.MatchBooking.command.ReservationCommand;
import com.example.MatchBooking.domain.Field;
import com.example.MatchBooking.domain.Player;
import com.example.MatchBooking.domain.Reservation;
import com.example.MatchBooking.exception.BusinessException;
import com.example.MatchBooking.exception.ExceptionPayloadFactory;
import com.example.MatchBooking.repositories.ReservationRepository;
import com.example.MatchBooking.service.field.FieldService;
import com.example.MatchBooking.service.player.PlayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReservationServiceImpl implements ReservationService{

    private final ReservationRepository reservationRepository;
    private final PlayerService playerService;
    private final FieldService fieldService;
    @Override
    public Reservation reserveField(ReservationCommand reservationCommand) {
        reservationCommand.validate();
        final Reservation reservation = new Reservation();
        reservation.setReservedBy(playerService.getPlayerById(reservationCommand.getReservedBy()));
        Field field = fieldService.getFieldById(reservationCommand.getFieldReserved());
        reservation.setFieldReserved(field);
        reservation.create(reservationCommand);
        return reservationRepository.save(reservation);
    }
}
