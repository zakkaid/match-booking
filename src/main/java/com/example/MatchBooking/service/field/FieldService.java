package com.example.MatchBooking.service.field;

import com.example.MatchBooking.domain.Field;
import com.example.MatchBooking.dto.FieldDTO;

import java.time.LocalDateTime;
import java.util.List;

public interface FieldService {
    List<FieldDTO> getAllAvailableFields(LocalDateTime reservationDate);
    Field getFieldById(String id);
}
