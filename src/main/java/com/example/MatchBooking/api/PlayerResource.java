package com.example.MatchBooking.api;

import com.example.MatchBooking.command.PlayerCommand;
import com.example.MatchBooking.command.ReservationCommand;
import com.example.MatchBooking.domain.Field;
import com.example.MatchBooking.domain.Player;
import com.example.MatchBooking.enums.Position;
import com.example.MatchBooking.exception.BusinessException;
import com.example.MatchBooking.exception.ExceptionPayloadFactory;
import com.example.MatchBooking.repositories.PlayerRepository;
import com.example.MatchBooking.service.field.FieldService;
import com.example.MatchBooking.service.player.PlayerService;
import com.example.MatchBooking.service.reservation.ReservationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import static com.example.MatchBooking.constants.ResourcePath.PLAYER;
import static com.example.MatchBooking.constants.ResourcePath.V1;

@RestController
@RequestMapping(V1+PLAYER)
@RequiredArgsConstructor
public class PlayerResource {
    private final PlayerService playerService;
    private final PlayerRepository playerRepository;
    private final FieldService fieldService;
    private final ReservationService reservationService;

    @PostMapping("/register" )
    public ResponseEntity<Void>addPlayer(@RequestBody PlayerCommand playerCommand){
        playerService.createPlayer(playerCommand);
        return ResponseEntity.ok().build();
    }
    @GetMapping("/pl")
    public ResponseEntity<List<List<Position>>> getPlayer(){
        return ResponseEntity.ok(playerRepository.findById("player_id_1").stream().map(Player::getPositions).collect(Collectors.toList()));
    }

    @GetMapping("/availableFields")
    public ResponseEntity<List<Field>> getAvailableFields(@RequestParam LocalDateTime time){
        return ResponseEntity.ok(fieldService.getAllAvailableFields(time));
    }

    @PostMapping("/reserve")
    public ResponseEntity<Void> reserve(@RequestBody ReservationCommand reservationCommand){
        reservationService.reserveField(reservationCommand);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/field")
    public ResponseEntity<Field> getField(@RequestParam String id){
        return ResponseEntity.ok(fieldService.getFieldById(id));
    }
}
