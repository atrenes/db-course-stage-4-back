package com.example.dbcoursestage4back;

import com.example.dbcoursestage4back.DTO.DescriptionDto;
import com.example.dbcoursestage4back.DTO.NinjaDto;
import com.example.dbcoursestage4back.DTO.TechniqueDto;
import com.example.dbcoursestage4back.DTO.WantedListDto;
import com.example.dbcoursestage4back.model.Ninja;
//import com.example.dbcoursestage4back.service.NinjaService;
import com.example.dbcoursestage4back.model.WantedList;
import com.example.dbcoursestage4back.repository.WantedRepository;
import com.example.dbcoursestage4back.service.MainService;
import com.example.dbcoursestage4back.service.NinjaService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MainController {

    @Autowired
    WantedRepository wantedRepository;

    @Autowired
    private MainService mainService;

    @GetMapping("/ninjas")
    public List<NinjaDto> getNinjas() {
        return mainService.findAllNinjas();
    }

    @GetMapping(value = "/ninjas/{id}", produces = "application/json")
    public Optional<NinjaDto> getNinjaById(@PathVariable Integer id) {
        return mainService.getNinjaById(id);
    }

    @GetMapping(value="/executors_for/{id}", produces = "application/json")
    public List<NinjaDto> getExecutorsForWanted(@PathVariable Integer id) {
        return mainService.getWantedExecutors(id);
    }

    @GetMapping("/wanted")
    public List<WantedListDto> getWanted(){
        return mainService.getWanted();
    }

//    @GetMapping("/wanteddto")
//    public List<DescriptionDto> getDescription() {
//        return mainService.getDescriptionDto();
//    }

    @GetMapping("/techniques")
    public List<TechniqueDto> getTechniques(){
        return mainService.getTechniques();
    }

    @PostMapping(path = "/wanted/addDescription", consumes = "application/json")
    public String addWantedDescription(@RequestBody DescriptionDto descriptionDto){
        try{
            WantedList wanted = wantedRepository.findById(descriptionDto.getId()).get();
            wanted.setDescription(descriptionDto.getDescription());
            wantedRepository.save(wanted);
            return "ok";
        } catch(Exception e) {
            e.printStackTrace();
            return "wrong token";
        }
    }
}
