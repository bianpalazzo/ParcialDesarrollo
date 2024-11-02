package com.example.ParcialDesarrollo.repository;

import com.example.ParcialDesarrollo.model.DnaRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface DnaRepository extends JpaRepository<DnaRecord, Long> {
    Optional<DnaRecord> findByDnaSequence(String dnaSequence);
}