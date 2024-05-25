package com.example.MatchBooking.command;

import com.example.MatchBooking.core.Validatable;
import com.example.MatchBooking.domain.Field;
import com.example.MatchBooking.domain.Player;
import com.example.MatchBooking.util.Assert;
import lombok.*;

import java.time.LocalDateTime;

import static com.example.MatchBooking.constants.RegexExpressions.DATE;

@Getter
@Setter
public class ReservationCommand implements Validatable {

    private String reservedBy;
    private LocalDateTime reservationDate;
    private LocalDateTime matchStartAt;
    private LocalDateTime matchEndAt;
    private String fieldReserved;

    @Override
    public void validate() {

        Assert.assertNotNull(fieldReserved);
        Assert.assertNotNull(reservedBy);
        Assert.assertStartMatchDate(matchStartAt);
    }
}
