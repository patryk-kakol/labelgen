package com.n2o3.labelgen.controllers;

import com.n2o3.labelgen.models.HazardStatement;
import com.n2o3.labelgen.services.HazardStatementService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/v1")
public class HazardStatementController {

    private HazardStatementService hazardStatementService;

    public HazardStatementController(HazardStatementService hazardStatementService) {
        this.hazardStatementService = hazardStatementService;
    }

    @GetMapping("hazardStatements")
    public List<HazardStatement> getHazardStatements() {
        return hazardStatementService.getHazardStatements();
    }
}
