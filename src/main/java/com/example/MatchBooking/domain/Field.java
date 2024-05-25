package com.example.MatchBooking.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Entity
@RequiredArgsConstructor
@Getter
public class Field extends BaseEntity{
    @Column
    private int code;
    @ManyToOne
    private FieldType fieldType;


}
