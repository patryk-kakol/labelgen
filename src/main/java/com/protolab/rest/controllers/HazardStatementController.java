package com.protolab.rest.controllers;

import com.protolab.rest.models.HazardStatement;
import com.protolab.rest.models.dtos.HazardStatementDto;
import com.protolab.rest.services.HazardStatementService;
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

    @GetMapping("/dto/hazardStatements")
    public List<HazardStatementDto> getHazardStatementsNoTimestamp() {
        return hazardStatementService.getHazardStatementsNoTimestamp();
    }
}
