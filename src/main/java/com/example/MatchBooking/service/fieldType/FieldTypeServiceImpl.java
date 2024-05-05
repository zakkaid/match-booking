package com.example.MatchBooking.service.fieldType;

import com.example.MatchBooking.command.FieldTypeCommand;
import com.example.MatchBooking.domain.FieldType;
import com.example.MatchBooking.repositories.FieldTypeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FieldTypeServiceImpl implements FieldTypeService{

    private final FieldTypeRepository fieldTypeRepository;
    @Override
    public FieldType addFieldType(FieldTypeCommand fieldTypeCommand) {
        final FieldType fieldType = new FieldType();
        return fieldTypeRepository.save(fieldType.createFieldType(fieldTypeCommand));
    }
}
