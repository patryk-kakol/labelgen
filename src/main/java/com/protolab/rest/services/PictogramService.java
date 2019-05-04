package com.protolab.rest.services;

import com.protolab.rest.mappers.PictogramMapper;
import com.protolab.rest.models.Pictogram;
import com.protolab.rest.models.dtos.PictogramDto;
import com.protolab.rest.repositories.PictogramRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PictogramService {

    private PictogramRepository pictogramRepository;
    private PictogramMapper pictogramMapper;

    public PictogramService(PictogramRepository pictogramRepository,
                            PictogramMapper pictogramMapper) {
        this.pictogramRepository = pictogramRepository;
        this.pictogramMapper = pictogramMapper;
    }

    public List<Pictogram> getPictograms() {
        return pictogramRepository.findAll();
    }

    public List<PictogramDto> getPictogramsNoTimeStamp() {
        return pictogramRepository
                .findAll()
                .stream()
                .map(pictogramMapper::map)
                .collect(Collectors.toList());
    }
}
