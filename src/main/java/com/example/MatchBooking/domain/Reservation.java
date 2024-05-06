package com.example.MatchBooking.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;

import java.time.LocalDateTime;

@Entity
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



}
