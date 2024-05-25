package com.example.MatchBooking.dto.mapper;


import com.example.MatchBooking.domain.FieldType;
import com.example.MatchBooking.dto.FieldTypeDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class FieldTypeMapper {
    private ModelMapper modelMapper = new ModelMapper();

    public FieldTypeDTO toFieldTypeDTO(FieldType fieldType){
        return modelMapper.map(fieldType , FieldTypeDTO.class);
    }
}
