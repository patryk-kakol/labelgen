package com.protolab.rest.mappers;

import com.protolab.rest.commons.Mapper;
import com.protolab.rest.models.HazardStatement;
import com.protolab.rest.models.PrecautionaryStatement;
import com.protolab.rest.models.dtos.HazardStatementDto;
import com.protolab.rest.models.dtos.PrecautionaryStatementDto;
import org.springframework.stereotype.Component;

@Component
public class PrecautionaryStatementMapper implements Mapper<PrecautionaryStatement, PrecautionaryStatementDto> {
    @Override
    public PrecautionaryStatementDto map(PrecautionaryStatement from) {
        return PrecautionaryStatementDto
                .builder()
                .precautionaryStatementId(from.getPrecautionaryStatementId())
                .code(from.getCode())
                .text(from.getText())
                .build();
    }

    @Override
    public PrecautionaryStatement reverseMap(PrecautionaryStatementDto to) {
        return PrecautionaryStatement
                .builder()
                .precautionaryStatementId(to.getPrecautionaryStatementId())
                .code(to.getCode())
                .text(to.getText())
                .build();
    }
}
