package com.protolab.rest.controllers;

import com.protolab.rest.models.Compound;
import com.protolab.rest.models.dtos.CompoundDto;
import com.protolab.rest.services.CompoundService;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/dto/compounds")
    public List<CompoundDto> getCompoundsNoTimestamp() {
        return compoundService.getCompoundsNoTimestamp();
    }

    @PostMapping("/dto/compounds")
    public Compound addCompound(@RequestBody CompoundDto compoundDto) {
        return compoundService.addCompound(compoundDto);
    }

//    NOT IN USE YET
//
//    @GetMapping("/dto/compounds")
//    public List<CompoundDto> getCompoundsDto(
//            @RequestParam(value = "name", required = false) String name) {
//        if (name != null) return compoundService.getCompoundsByNameOrFormula(name);
//        return compoundService.getCompoundsNoTimestamp();
//    }
//
//    @PutMapping("/dto/compound")
//    public void updateCompound(@RequestBody CompoundDto compoundDto) {
//        compoundService.updateCompound(compoundDto);
//    }
//
//    @DeleteMapping("/dto/compound/{compoundName}")
//    public void deleteCompound(@PathVariable String name) {
//        compoundService.deleteCompound(name);
//    }
//
//    @DeleteMapping("/dto/compound/")
//    public void deleteCompound(@RequestParam(value = "name") String name) {
//        compoundService.deleteCompound(name);
//    }
}