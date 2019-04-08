package com.n2o3.labelgen.controllers;

import com.n2o3.labelgen.models.PrecautionaryStatement;
import com.n2o3.labelgen.services.PrecautionaryStatementService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/v1")
public class PrecautionaryStatementController {

    private PrecautionaryStatementService precautionaryStatementService;

    public PrecautionaryStatementController(PrecautionaryStatementService precautionaryStatementService) {
        this.precautionaryStatementService = precautionaryStatementService;
    }

    @GetMapping("/precautionaryStatements")
    public List<PrecautionaryStatement> getPrecautionaryStatemens() {
        return precautionaryStatementService.getPrecautionaryStatements();
    }
}
