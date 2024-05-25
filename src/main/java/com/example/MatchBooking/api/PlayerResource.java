package com.example.MatchBooking.api;

import com.example.MatchBooking.command.PlayerCommand;
import com.example.MatchBooking.command.ReservationCommand;
import com.example.MatchBooking.dto.FieldDTO;
import com.example.MatchBooking.dto.mapper.FieldMapper;
import com.example.MatchBooking.repositories.PlayerRepository;
import com.example.MatchBooking.service.field.FieldService;
import com.example.MatchBooking.service.player.PlayerService;
import com.example.MatchBooking.service.reservation.ReservationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

import static com.example.MatchBooking.constants.ResourcePath.PLAYER;
import static com.example.MatchBooking.constants.ResourcePath.V1;

@RestController
@RequestMapping(V1+PLAYER)
@RequiredArgsConstructor
@CrossOrigin("http://http://localhost:3001/")
public class PlayerResource {
    private final PlayerService playerService;
    private final FieldService fieldService;
    private final ReservationService reservationService;
    private final FieldMapper fieldMapper;

    @PostMapping("/register" )
    public ResponseEntity<Void>addPlayer(@RequestBody PlayerCommand playerCommand){
        playerService.createPlayer(playerCommand);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/availableFields")
    public ResponseEntity<List<FieldDTO>> getAvailableFields(@RequestParam LocalDateTime time){
        return ResponseEntity.ok(fieldService.getAllAvailableFields(time));
    }

    @PostMapping("/reserve")
    public ResponseEntity<Void> reserve(@RequestBody ReservationCommand reservationCommand){
        reservationService.reserveField(reservationCommand);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/field")
    public ResponseEntity<FieldDTO> getField(@RequestParam String id){
        return ResponseEntity.ok(fieldMapper.toFieldDTO(fieldService.getFieldById(id)));
    }
}
