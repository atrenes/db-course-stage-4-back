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
}
