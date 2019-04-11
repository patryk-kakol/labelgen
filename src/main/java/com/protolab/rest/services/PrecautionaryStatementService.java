package com.protolab.rest.services;

import com.protolab.rest.mappers.PrecautionaryStatementMapper;
import com.protolab.rest.models.PrecautionaryStatement;
import com.protolab.rest.models.dtos.PrecautionaryStatementDto;
import com.protolab.rest.repositories.PrecautionaryStatementRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PrecautionaryStatementService {

    private PrecautionaryStatementRepository precautionaryStatementRepository;
    private PrecautionaryStatementMapper precautionaryStatementMapper;

    public PrecautionaryStatementService(PrecautionaryStatementRepository precautionaryStatementRepository,
                                         PrecautionaryStatementMapper precautionaryStatementMapper) {
        this.precautionaryStatementRepository = precautionaryStatementRepository;
        this.precautionaryStatementMapper = precautionaryStatementMapper;
    }

    /*
     *
     *   DAO - Data Access Object
     *
     */

    public List<PrecautionaryStatement> getPrecautionaryStatements() {
        return precautionaryStatementRepository.findAll();
    }

    /*
     *
     *   DTO - Data Transform Object
     *
     */

    public List<PrecautionaryStatementDto> getPrecautionaryStatementsNoTimestamp() {
        return precautionaryStatementRepository
                .findAll()
                .stream()
                .map(precautionaryStatementMapper::map)
                .collect(Collectors.toList());
    }
}
