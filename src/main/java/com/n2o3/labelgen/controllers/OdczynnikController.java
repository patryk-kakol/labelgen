package com.n2o3.labelgen.controllers;


import com.n2o3.labelgen.models.Odczynnik;
import com.n2o3.labelgen.services.OdczynnikService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/v1")
public class OdczynnikController {

    private OdczynnikService odczynnikService;

    public OdczynnikController(OdczynnikService odczynnikService) {
        this.odczynnikService = odczynnikService;
    }


    @GetMapping("odczynniki")
    public List<Odczynnik> getOdczynnik() {
        return odczynnikService.getOdczynnik();
    }
}
