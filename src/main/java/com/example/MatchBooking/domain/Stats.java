package com.example.MatchBooking.domain;

import jakarta.persistence.Entity;

@Entity
public class Stats extends BaseEntity{
    private int overallRating;
    private int pace;
    private int shooting;
    private int passing;
    private int dribbling;
    private int defending;
    private int physicality;
}
