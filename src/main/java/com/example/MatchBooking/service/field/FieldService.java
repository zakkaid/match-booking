package com.example.MatchBooking.service.field;

import com.example.MatchBooking.domain.Field;

import java.time.LocalDateTime;
import java.util.List;

public interface FieldService {
    List<Field> getAllAvailableFields(LocalDateTime reservationDate);
}
