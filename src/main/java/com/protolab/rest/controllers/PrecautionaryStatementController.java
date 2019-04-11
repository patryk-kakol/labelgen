package com.protolab.rest.controllers;

import com.protolab.rest.models.PrecautionaryStatement;
import com.protolab.rest.models.dtos.PrecautionaryStatementDto;
import com.protolab.rest.services.PrecautionaryStatementService;
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

    /*
     *
     *   DAO - Data Access Object
     *
     */

    @GetMapping("/precautionaryStatements")
    public List<PrecautionaryStatement> getPrecautionaryStatemens() {
        return precautionaryStatementService.getPrecautionaryStatements();
    }

    /*
     *
     *   DTO - Data Transform Object
     *
     */

    @GetMapping("/dto/precautionaryStatements")
    public List<PrecautionaryStatementDto> getPrecautionaryStatementsNoTimestamp() {
        return precautionaryStatementService.getPrecautionaryStatementsNoTimestamp();
    }
}
