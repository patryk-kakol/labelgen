package com.protolab.rest.controllers;

import com.protolab.rest.models.Pictogram;
import com.protolab.rest.models.dtos.PictogramDto;
import com.protolab.rest.services.PictogramService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/v1")
public class PictogramController {

    private PictogramService pictogramService;

    public PictogramController(PictogramService pictogramService) {
        this.pictogramService = pictogramService;
    }

    @GetMapping("pictograms")
    public List<Pictogram> getPictograms() {
        return this.pictogramService.getPictograms();
    }

    @GetMapping("/dto/pictograms")
    public List<PictogramDto> getPictogramsNoTimestamp() {
        return this.pictogramService.getPictogramsNoTimeStamp();
    }
}
