package com.protolab.rest.mappers;

import com.protolab.rest.commons.Mapper;
import com.protolab.rest.models.Pictogram;
import com.protolab.rest.models.dtos.PictogramDto;
import org.springframework.stereotype.Component;

@Component
public class PictogramMapper implements Mapper<Pictogram, PictogramDto> {
    @Override
    public PictogramDto map(Pictogram from) {
        return PictogramDto
                .builder()
                .pictogramId(from.getPictogramId())
                .code(from.getCode())
                .name(from.getName())
                .path(from.getPath())
                .build();
    }

    @Override
    public Pictogram reverseMap(PictogramDto to) {
        return Pictogram
                .builder()
                .pictogramId(to.getPictogramId())
                .code(to.getCode())
                .name(to.getName())
                .path(to.getPath())
                .build();
    }
}
