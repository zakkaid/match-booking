package com.example.MatchBooking.dto;

import com.example.MatchBooking.domain.Field;
import com.example.MatchBooking.domain.Player;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ReservationDTO {
    private String id;
    private Player reservedBy;
    private LocalDateTime reservationDate;
    private LocalDateTime matchStartAt;
    private LocalDateTime matchEndAt;
    private Field fieldReserved;
}
