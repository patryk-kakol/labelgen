package com.protolab.rest.services;

import com.protolab.rest.mappers.HazardStatementMapper;
import com.protolab.rest.models.HazardStatement;
import com.protolab.rest.models.dtos.HazardStatementDto;
import com.protolab.rest.repositories.HazardStatementRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class HazardStatementService {

    private HazardStatementRepository hazardStatementRepository;
    private HazardStatementMapper hazardStatementMapper;

    public HazardStatementService(HazardStatementRepository hazardStatementRepository,
                                  HazardStatementMapper hazardStatementMapper) {
        this.hazardStatementRepository = hazardStatementRepository;
        this.hazardStatementMapper = hazardStatementMapper;
    }

    public List<HazardStatement> getHazardStatements() {
        return hazardStatementRepository.findAll();
    }

    public List<HazardStatementDto> getHazardStatementsNoTimestamp() {
        return hazardStatementRepository
                .findAll()
                .stream()
                .map(hazardStatementMapper::map)
                .collect(Collectors.toList());
    }
}
