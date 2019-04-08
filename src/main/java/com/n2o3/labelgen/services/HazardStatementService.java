package com.n2o3.labelgen.services;

import com.n2o3.labelgen.models.HazardStatement;
import com.n2o3.labelgen.repositories.HazardStatementRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HazardStatementService {

    private HazardStatementRepository hazardStatementRepository;

    public HazardStatementService(HazardStatementRepository hazardStatementRepository) {
        this.hazardStatementRepository = hazardStatementRepository;
    }

    public List<HazardStatement> getHazardStatements() {
        return hazardStatementRepository.findAll();
    }
}
