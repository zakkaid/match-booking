package com.example.MatchBooking.command;

import com.example.MatchBooking.core.Validatable;
import com.example.MatchBooking.util.Assert;
import lombok.Getter;
import lombok.Setter;

import static com.example.MatchBooking.constants.RegexExpressions.EMAIL;

@Getter
@Setter
public class PlayerLoginCommand implements Validatable {
    private String email;
    private String password;

    @Override
    public void validate() {
        Assert.assertRegex(email,EMAIL);
        Assert.assertNotNull(password);
    }
}
