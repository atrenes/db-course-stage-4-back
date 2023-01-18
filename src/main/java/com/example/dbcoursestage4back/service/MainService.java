package com.example.dbcoursestage4back.service;

import com.example.dbcoursestage4back.DTO.NinjaDto;
import com.example.dbcoursestage4back.DTO.WantedListDto;
import com.example.dbcoursestage4back.model.Ninja;
import com.example.dbcoursestage4back.model.WantedList;
import com.example.dbcoursestage4back.repository.NinjaRepository;
import com.example.dbcoursestage4back.repository.WantedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MainService {
    @Autowired
    private NinjaRepository ninjaRepository;

    @Autowired
    private WantedRepository wantedRepository;

    public List<NinjaDto> findAllNinjas() {
        return ninjaRepository.findAll().stream().map(this::convertToNinjaDto).collect(Collectors.toList());
    }

    public List<WantedListDto> getWanted() {
        return wantedRepository.findAll().stream().map(this::convertToWantedListDto).collect(Collectors.toList());
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

    private WantedListDto convertToWantedListDto(WantedList wantedList) {
        return new WantedListDto(
                wantedList.getWantedNinja().getName(),
                wantedList.getIsCaptured(),
                wantedList.getExecutorNinja() == null ? "-" : wantedList.getExecutorNinja().getName(),
                wantedList.getDescription(),
                wantedList.getDateOfSearchStart(),
                wantedList.getDateOfCapture()
        );
    }
}
