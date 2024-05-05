package com.example.MatchBooking.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity

public class Field extends BaseEntity{
    @Column
    private int code;
    @ManyToOne
    private FieldType fieldType;
}
