package com.example.MatchBooking.api;

import com.example.MatchBooking.command.PlayerLoginCommand;
import com.example.MatchBooking.command.PlayerCommand;
import com.example.MatchBooking.command.ReservationCommand;
import com.example.MatchBooking.dto.FieldDTO;
import com.example.MatchBooking.dto.PlayerDTO;
import com.example.MatchBooking.dto.ReservationDTO;
import com.example.MatchBooking.dto.mapper.FieldMapper;
import com.example.MatchBooking.enums.Position;
import com.example.MatchBooking.service.field.FieldService;
import com.example.MatchBooking.service.player.PlayerService;
import com.example.MatchBooking.service.reservation.ReservationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Arrays;
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

    @PostMapping("/login")
    public ResponseEntity<PlayerDTO> login(@RequestBody PlayerLoginCommand playerLoginCommand){
        return ResponseEntity.ok(playerService.authenticate(playerLoginCommand));
    }
    @GetMapping("/positions")
    public ResponseEntity<List<Position>> getAllPositions() {
        List<Position> positions = Arrays.asList(Position.values());
        return ResponseEntity.ok(positions);
    }

    @GetMapping("/reservations")
    public ResponseEntity<List<ReservationDTO>> reservations(@RequestParam String id){
        return ResponseEntity.ok(reservationService.getAllReservations(id));
    }

    @GetMapping("/availability")
    public ResponseEntity<Boolean> playerAvailability(@RequestParam String id , @RequestParam LocalDateTime localDateTime){
        return ResponseEntity.ok(reservationService.isAvailable(id,localDateTime));
    }


}
