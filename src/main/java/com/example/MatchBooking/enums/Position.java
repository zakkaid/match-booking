package com.example.MatchBooking.enums;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public enum Position {
    GK,
    CB,
    RB,
    LB,
    RWB,
    LWB,
    MDC,
    MC,
    MOC,
    CAM,
    LW,
    LF,
    RF,
    RW,
    ST,
    CF;



    public static List<String> getAllPositions() {
        List<String> allPositions = new ArrayList<>();
        for (Position position : Position.values()) {
            allPositions.add(position.name());
        }
        return allPositions;
    }
}
