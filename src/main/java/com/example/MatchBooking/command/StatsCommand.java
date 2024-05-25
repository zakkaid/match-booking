package com.example.MatchBooking.command;

import com.example.MatchBooking.core.Validatable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StatsCommand implements Validatable {
    private int pace;
    private int shooting;
    private int passing;
    private int dribbling;
    private int defending;
    private int physicality;

    @Override
    public void validate() {

    }
}
