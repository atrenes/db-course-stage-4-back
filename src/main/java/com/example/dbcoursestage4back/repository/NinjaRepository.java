package com.example.dbcoursestage4back.repository;

import com.example.dbcoursestage4back.model.Ninja;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NinjaRepository extends JpaRepository<Ninja, Integer> {
}