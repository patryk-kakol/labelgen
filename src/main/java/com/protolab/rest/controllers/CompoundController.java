package com.protolab.rest.controllers;

import com.protolab.rest.models.Compound;
import com.protolab.rest.models.PrecautionaryStatement;
import com.protolab.rest.models.dtos.CompoundDto;
import com.protolab.rest.services.CompoundService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/v1")
public class CompoundController {

    private CompoundService compoundService;

    public CompoundController(CompoundService compoundService) {
        this.compoundService = compoundService;
    }

    /*
     *
     *   DAO - Data Access Object
     *
     */

    @GetMapping("compounds")
    public List<Compound> getCompounds() {
        return compoundService.getCompounds();
    }

    /*
     *
     *   DTO - Data Transform Object
     *
     */

    @GetMapping("/dto/compounds")
    public List<CompoundDto> getCompoundsNoTimestamp() {
        return compoundService.getCompoundsNoTimestamp();
    }
}