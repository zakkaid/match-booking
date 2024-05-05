package com.example.MatchBooking.api;

import com.example.MatchBooking.command.FieldTypeCommand;
import com.example.MatchBooking.service.fieldType.FieldTypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.example.MatchBooking.constants.ResourcePath.FIELDTYPE;
import static com.example.MatchBooking.constants.ResourcePath.V1;

@RestController
@RequestMapping(V1 + FIELDTYPE)
@RequiredArgsConstructor
public class FieldTypeResource {
    private final FieldTypeService fieldTypeService;
    @PostMapping("/insert")
    public ResponseEntity<Void> addFieldType(@RequestBody FieldTypeCommand fieldTypeCommand){
        fieldTypeService.addFieldType(fieldTypeCommand);
        return ResponseEntity.ok().build();
    }

}
