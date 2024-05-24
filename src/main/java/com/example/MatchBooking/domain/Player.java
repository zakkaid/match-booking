package com.example.MatchBooking.domain;

import com.example.MatchBooking.command.PlayerCommand;
import com.example.MatchBooking.enums.Position;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class Player extends BaseEntity{
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String email;
    @Column
    private String phone;
    @Column
    private LocalDateTime dob;
    @ElementCollection
    @Enumerated
    private List<Position> positions;
    @OneToOne
    private Stats stats;

    public Player(PlayerCommand playerCommand) {
        super();
        firstName = playerCommand.getFirstName();
        lastName = playerCommand.getLastName();
        email = playerCommand.getEmail();
        phone = playerCommand.getPhone();
        dob = playerCommand.getDob();
    }
}
