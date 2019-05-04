package com.protolab.rest.models.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PictogramDto {

    private Long pictogramId;
    private String code;
    private String name;
    private String path;

}

