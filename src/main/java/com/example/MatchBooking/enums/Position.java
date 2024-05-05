package com.example.MatchBooking.enums;

import lombok.Getter;

@Getter
public enum Position {
    GK(1),
    CB(2),
    RB(3),
    LB(4),
    RWB(5),
    LWB(6),
    MDC(7),
    MC(8),
    MOC(9),
    CAM(10),
    LW(11),
    LF(12),
    RF(13),
    RW(14),
    ST(15),
    CF(16);

    private final int value;

    Position(int value) {
        this.value=value;
    }
}
