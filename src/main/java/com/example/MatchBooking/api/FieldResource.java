package com.example.MatchBooking.api;

import com.example.MatchBooking.dto.FieldDTO;
import com.example.MatchBooking.service.field.FieldService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

import static com.example.MatchBooking.constants.ResourcePath.*;

@RestController
@RequestMapping(V1+FIELD)
@RequiredArgsConstructor
@CrossOrigin("http://localhost:3001/")
public class FieldResource {
    private final FieldService fieldService;

    @GetMapping("/availableFields")
    public ResponseEntity<List<FieldDTO>> getAvailableFields(@RequestParam LocalDateTime time){
        return ResponseEntity.ok(fieldService.getAllAvailableFields(LocalDateTime.now()));
    }
}
