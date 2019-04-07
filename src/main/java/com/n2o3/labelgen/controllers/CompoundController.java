package com.n2o3.labelgen.controllers;


import com.n2o3.labelgen.models.Compound;
import com.n2o3.labelgen.services.CompoundService;
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


    @GetMapping("compounds")
    public List<Compound> getCompounds() {
        return compoundService.getCompounds();
    }
}
