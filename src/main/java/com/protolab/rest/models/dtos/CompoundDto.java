package com.protolab.rest.models.dtos;
import com.protolab.rest.models.HazardStatement;
import com.protolab.rest.models.PrecautionaryStatement;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CompoundDto {


        private Long compoundId;
        private String name;
        private String cas;
        private String we;
        private String formula;
        private String un;
        private String baseClass;
        private String helperClass;
        private String packagingGroup;
        List<HazardStatement> applicableHazardStatements;
        List<PrecautionaryStatement> applicablePrecautionaryStatements;

}
