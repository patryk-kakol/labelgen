package com.protolab.rest.models.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HazardStatementDto {

    private Long hazardStatementId;
    private String code;
    private String text;

}
