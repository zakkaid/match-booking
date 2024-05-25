package com.example.MatchBooking.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FieldDTO {
    private String id;
    private int code;
    private FieldTypeDTO fieldType;
}
