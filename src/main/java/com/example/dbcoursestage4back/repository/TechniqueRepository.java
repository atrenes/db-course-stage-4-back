package com.example.dbcoursestage4back.repository;
import com.example.dbcoursestage4back.model.Technique;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TechniqueRepository extends JpaRepository<Technique, Integer> {
}
