package com.example.MatchBooking.command;


import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@Getter
public class PlayerCommand {
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String phone;
    private final LocalDateTime dob;

}
