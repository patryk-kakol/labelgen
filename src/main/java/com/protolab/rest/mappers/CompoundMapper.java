package com.protolab.rest.mappers;

import com.protolab.rest.commons.Mapper;
import com.protolab.rest.models.Compound;
import com.protolab.rest.models.dtos.CompoundDto;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class CompoundMapper implements Mapper<Compound, CompoundDto> {

    private HazardStatementMapper hazardStatementMapper;
    private PrecautionaryStatementMapper precautionaryStatementMapper;

    public CompoundMapper(HazardStatementMapper hazardStatementMapper,
                          PrecautionaryStatementMapper precautionaryStatementMapper) {
        this.hazardStatementMapper = hazardStatementMapper;
        this.precautionaryStatementMapper = precautionaryStatementMapper;
    }

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
                .hazardStatementDtos(from.getApplicableHazardStatements()
                    .stream().map(hazardStatementMapper::map)
                    .collect(Collectors.toList()))
                .precautionaryStatementDtos(from.getApplicablePrecautionaryStatements()
                    .stream().map(precautionaryStatementMapper::map)
                    .collect(Collectors.toList()))
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
                .applicableHazardStatements(to.getHazardStatementDtos()
                        .stream().map(hazardStatementMapper::reverseMap)
                        .collect(Collectors.toList()))
                .applicablePrecautionaryStatements(to.getPrecautionaryStatementDtos()
                        .stream().map(precautionaryStatementMapper::reverseMap)
                        .collect(Collectors.toList()))
                .build();
    }


// NOT IN USE YET
//
//    private String processFormula(String stringWithDigits) {
//        char[] formula = stringWithDigits.toCharArray();
//        int digit;
//        StringBuilder newFormula = new StringBuilder();
//
//        for (char c : formula) {
//            try {
//                digit = Integer.parseInt(Character.toString(c));
//                newFormula.append("&#832").append(digit);
//                continue;
//            } catch (Exception e) {
//            }
//            newFormula.append(c);
//        }
//        return new String(newFormula);
//    }
//
//    private String processFormula2(String stringWithDigits) {
//        char[] formula = stringWithDigits.toCharArray();
//        int digit;
//
//        for(int i = 0; i < formula.length; i++) {
//            try {
//                digit = Integer.parseInt(Character.toString(formula[i]));
//            } catch (Exception e) {
//                continue;
//            }
//            formula[i] = (char) (digit + 2080);
//        }
//        return new String(formula);
//    }
}




