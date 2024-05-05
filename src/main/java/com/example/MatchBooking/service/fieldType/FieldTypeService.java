package com.example.MatchBooking.service.fieldType;

import com.example.MatchBooking.command.FieldTypeCommand;
import com.example.MatchBooking.domain.FieldType;

public interface FieldTypeService {
    FieldType addFieldType(FieldTypeCommand fieldTypeCommand);
}
