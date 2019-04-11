package com.protolab.rest.mappers;

import com.protolab.rest.commons.Mapper;
import com.protolab.rest.models.HazardStatement;
import com.protolab.rest.models.dtos.HazardStatementDto;
import org.springframework.stereotype.Component;

@Component
public class HazardStatementMapper implements Mapper<HazardStatement, HazardStatementDto> {
    @Override
    public HazardStatementDto map(HazardStatement from) {
        return HazardStatementDto
                .builder()
                .hazardStatementId(from.getHazardStatementId())
                .code(from.getCode())
                .text(from.getText())
                .build();
    }

    @Override
    public HazardStatement reverseMap(HazardStatementDto to) {
        return HazardStatement
                .builder()
                .hazardStatementId(to.getHazardStatementId())
                .code(to.getCode())
                .text(to.getText())
                .build();
    }
}
