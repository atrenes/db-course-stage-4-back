package com.example.dbcoursestage4back.service;

import com.example.dbcoursestage4back.DTO.NinjaDto;
import com.example.dbcoursestage4back.model.Ninja;
import com.example.dbcoursestage4back.repository.NinjaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class NinjaService {
    @Autowired
    private NinjaRepository ninjaRepository;

    public List<NinjaDto> findAll() {
        return ninjaRepository.findAll().stream().map(this::convertToNinjaDto).collect(Collectors.toList());
    }

    private NinjaDto convertToNinjaDto(Ninja ninja) {
        return new NinjaDto(
                ninja.getName(),
                ninja.getClan().getName(),
                ninja.getEye() == null ? "default eyes" : ninja.getEye().getType(),
                ninja.getRank().getType(),
                ninja.getChakraAmount(),
                ninja.getCriminalNum(),
                ninja.getCriminalGroup() == null ? "not criminal" : ninja.getCriminalGroup().getName(),
                ninja.getIsCriminal(),
                ninja.getVillage().getName()
        );
    }
}
