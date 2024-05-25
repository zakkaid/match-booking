package com.example.MatchBooking.dto.mapper;

import com.example.MatchBooking.domain.Reservation;
import com.example.MatchBooking.dto.ReservationDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ReservationMapper {
    private ModelMapper modelMapper = new ModelMapper();
    public ReservationDTO toReservationDTO(Reservation reservation){
        return modelMapper.map(reservation, ReservationDTO.class);
    }
    public List<ReservationDTO> toReservationDTO(List<Reservation> reservations) {
        return reservations.stream()
                .map(reservation -> modelMapper.map(reservation, ReservationDTO.class))
                .collect(Collectors.toList());
    }

}
