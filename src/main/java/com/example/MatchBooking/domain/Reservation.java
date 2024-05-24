package com.example.MatchBooking.domain;

import com.example.MatchBooking.command.ReservationCommand;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity @Setter
public class Reservation extends BaseEntity{
    @OneToOne
    private Player reservedBy;
    @Column
    private LocalDateTime reservationDate;
    @Column
    private LocalDateTime matchStartAt;
    @Column
    private LocalDateTime matchEndAt;
    @OneToOne
    private Field fieldReserved;

    public Reservation create(ReservationCommand reservationCommand){
        final Reservation reservation = new Reservation();
        reservation.reservedBy = new Player();
        reservation.fieldReserved = new Field();
        reservation.reservationDate = reservationCommand.getReservationDate();
        reservation.fieldReserved.setId(reservationCommand.getReservedBy());
        reservation.reservedBy.setId(reservationCommand.getFieldReserved());
        reservation.matchEndAt = reservationCommand.getMatchEndAt();
        reservation.matchStartAt = reservationCommand.getMatchStartAt();
        return  reservation;
    }

}
