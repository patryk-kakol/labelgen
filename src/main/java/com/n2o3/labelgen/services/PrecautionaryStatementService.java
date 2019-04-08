package com.n2o3.labelgen.services;

import com.n2o3.labelgen.models.PrecautionaryStatement;
import com.n2o3.labelgen.repositories.PrecautionaryStatementRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrecautionaryStatementService {

    private PrecautionaryStatementRepository precautionaryStatementRepository;

    public PrecautionaryStatementService(PrecautionaryStatementRepository precautionaryStatementRepository) {
        this.precautionaryStatementRepository = precautionaryStatementRepository;
    }

    public List<PrecautionaryStatement> getPrecautionaryStatements() {
        return precautionaryStatementRepository.findAll();
    }
}
