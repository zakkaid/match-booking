package com.example.MatchBooking.dto.mapper;

import com.example.MatchBooking.domain.Field;
import com.example.MatchBooking.dto.FieldDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class FieldMapper {
    private ModelMapper modelMapper = new ModelMapper();

    public FieldDTO toFieldDTO(Field field){
        return modelMapper.map(field , FieldDTO.class);
    }

    public List<FieldDTO> toFieldDTO(List<Field> fields){
        return fields.stream()
                .map(this::toFieldDTO)
                .collect(Collectors.toList());
    }
}
