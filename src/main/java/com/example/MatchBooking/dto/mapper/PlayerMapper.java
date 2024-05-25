package com.example.MatchBooking.dto.mapper;

import com.example.MatchBooking.domain.Player;
import com.example.MatchBooking.dto.PlayerDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class PlayerMapper {
    private ModelMapper modelMapper = new ModelMapper();
    public PlayerDTO toPlayerDTO(Player player){
        return modelMapper.map(player,PlayerDTO.class);
    }
}
