package com.protolab.rest.mappers;

import com.protolab.rest.commons.Mapper;
import com.protolab.rest.models.Compound;
import com.protolab.rest.models.dtos.CompoundDto;
import org.springframework.stereotype.Component;

@Component
public class CompoundMapper implements Mapper<Compound, CompoundDto> {


    @Override
    public CompoundDto map(Compound from) {
        return CompoundDto
                .builder()
                .compoundId(from.getCompoundId())
                .name(from.getName())
                .cas(from.getCas())
                .we(from.getWe())
                .formula(from.getFormula())
                .un(from.getUn())
                .baseClass(from.getBaseClass())
                .helperClass(from.getHelperClass())
                .packagingGroup(from.getPackagingGroup())
                .applicableHazardStatements(from.getApplicableHazardStatements())
                .applicablePrecautionaryStatements(from.getApplicablePrecautionaryStatements())
                .build();
    }

    @Override
    public Compound reverseMap(CompoundDto to) {
        return Compound
                .builder()
                .compoundId(to.getCompoundId())
                .name(to.getName())
                .cas(to.getCas())
                .we(to.getWe())
                .formula(to.getFormula())
                .un(to.getUn())
                .baseClass(to.getBaseClass())
                .helperClass(to.getHelperClass())
                .packagingGroup(to.getPackagingGroup())
                .applicableHazardStatements(to.getApplicableHazardStatements())
                .applicablePrecautionaryStatements(to.getApplicablePrecautionaryStatements())
                .build();
    }
}
