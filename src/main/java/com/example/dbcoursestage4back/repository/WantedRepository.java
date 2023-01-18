package com.example.dbcoursestage4back.repository;

import com.example.dbcoursestage4back.model.Ninja;
import com.example.dbcoursestage4back.model.WantedList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WantedRepository extends JpaRepository<WantedList, Integer> {
}
