package com.example.ParcialDesarrollo.controller;

import com.example.ParcialDesarrollo.service.MutantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/mutant")

public class MutantController {

    private final MutantService mutantService;

    @Autowired
    public MutantController(MutantService mutantService) {
        this.mutantService = mutantService;
    }

        @PostMapping("/")
        public ResponseEntity<?> isMutant(@RequestBody Map<String, String[]> dnaRequest) {
            String[] dna = dnaRequest.get("dna");
            if (mutantService.isMutant(dna)) {
                return ResponseEntity.ok(Map.of("mensaje", "Mutante detectado"));
            } else {
                return ResponseEntity.status(HttpStatus.FORBIDDEN)
                        .body(Map.of("mensaje", "No un mutante"));
            }
        }

    }
