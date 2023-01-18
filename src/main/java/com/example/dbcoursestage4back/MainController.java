package com.example.dbcoursestage4back;

import com.example.dbcoursestage4back.DTO.NinjaDto;
import com.example.dbcoursestage4back.DTO.WantedListDto;
import com.example.dbcoursestage4back.model.Ninja;
//import com.example.dbcoursestage4back.service.NinjaService;
import com.example.dbcoursestage4back.service.MainService;
import com.example.dbcoursestage4back.service.NinjaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    private MainService mainService;

    @GetMapping("/ninjas")
    public List<NinjaDto> getNinjas() {
        return mainService.findAllNinjas();
    }

    @GetMapping("/wanted")
    public List<WantedListDto> getWanted(){
        return mainService.getWanted();
    }
}
