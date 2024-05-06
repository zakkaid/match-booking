package com.example.MatchBooking.service.field;

import com.example.MatchBooking.domain.Field;
import com.example.MatchBooking.repositories.FieldRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
@Service
@RequiredArgsConstructor
public class FieldServiceImpl implements FieldService{
    private final FieldRepository fieldRepository;

    @Override
    public List<Field> getAllAvailableFields(LocalDateTime reservationDate) {
        return fieldRepository.findAllAvailableFields(reservationDate);
    }
}
