package com.example.MatchBooking.command;


import com.example.MatchBooking.core.Validatable;
import com.example.MatchBooking.util.Assert;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

import static com.example.MatchBooking.constants.RegexExpressions.EMAIL;
import static com.example.MatchBooking.constants.RegexExpressions.PHONE_NUMBER;

@RequiredArgsConstructor
@Getter
public class PlayerCommand implements Validatable {
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String phone;
    private final LocalDateTime dob;

    @Override
    public void validate() {
        Assert.assertNotNull(firstName);
        Assert.assertNotNull(lastName);
        Assert.assertRegex(email,EMAIL);
        Assert.assertRegex(phone,PHONE_NUMBER);
        Assert.assertNotNull(dob);
    }
}
