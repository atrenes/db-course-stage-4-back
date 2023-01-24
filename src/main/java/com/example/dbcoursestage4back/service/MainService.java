package com.example.dbcoursestage4back.service;

import com.example.dbcoursestage4back.DTO.DescriptionDto;
import com.example.dbcoursestage4back.DTO.NinjaDto;
import com.example.dbcoursestage4back.DTO.TechniqueDto;
import com.example.dbcoursestage4back.DTO.WantedListDto;
import com.example.dbcoursestage4back.model.Ninja;
import com.example.dbcoursestage4back.model.Technique;
import com.example.dbcoursestage4back.model.WantedList;
import com.example.dbcoursestage4back.repository.NinjaRepository;
import com.example.dbcoursestage4back.repository.TechniqueRepository;
import com.example.dbcoursestage4back.repository.WantedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class MainService {
    @Autowired
    private NinjaRepository ninjaRepository;

    @Autowired
    private WantedRepository wantedRepository;

    @Autowired
    private TechniqueRepository techniqueRepository;

    public List<NinjaDto> findAllNinjas() {
        return ninjaRepository.findAll().stream().map(this::convertToNinjaDto).collect(Collectors.toList());
    }

    public List<WantedListDto> getWanted() {
        return wantedRepository.findAll().stream().map(this::convertToWantedListDto).collect(Collectors.toList());
    }

    public Optional<NinjaDto> getNinjaById(Integer id) {
        return ninjaRepository.findById(id).map(this::convertToNinjaDto);
    }

    public List<NinjaDto> getWantedExecutors(Integer wantedId) {
        Optional<WantedListDto> wanted = wantedRepository.findById(wantedId).map(this::convertToWantedListDto);
        if (wanted.isPresent()) {
            int chakra = ninjaRepository.findById(wanted.get().getId()).get().getChakraAmount();
            return ninjaRepository.findAll().stream().map(this::convertToNinjaDto).filter(n -> n.getChakraAmount() >= chakra && !n.getIsCriminal()).collect(Collectors.toList());
        }
        return null;
    }

    public List<DescriptionDto> getDescriptionDto() {
        return wantedRepository.findAll().stream().map(this::convertToDescriptionDto).collect(Collectors.toList());
    }

    public List<TechniqueDto> getTechniques() {
        return techniqueRepository.findAll().stream().map(this::convertToTechniqueDto).collect(Collectors.toList());
    }

    private NinjaDto convertToNinjaDto(Ninja ninja) {
        return new NinjaDto(
                ninja.getId(),
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
                wantedList.getId(),
                wantedList.getWantedNinja().getName(),
                wantedList.getIsCaptured(),
                wantedList.getExecutorNinja() == null ? "-" : wantedList.getExecutorNinja().getName(),
                wantedList.getDescription(),
                wantedList.getDateOfSearchStart(),
                wantedList.getDateOfCapture()
        );
    }

    private TechniqueDto convertToTechniqueDto(Technique technique) {
        return new TechniqueDto(
                technique.getId(),
                technique.getClan().getName(),
                technique.getName(),
                technique.getType().getType(),
                technique.getChakraCost()
        );
    }

    private DescriptionDto convertToDescriptionDto(WantedList wantedList) {
        return new DescriptionDto(
                wantedList.getId(),
                wantedList.getDescription()
        );
    }
}
