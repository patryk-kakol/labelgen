package com.protolab.rest.services;

import com.protolab.rest.mappers.CompoundMapper;
import com.protolab.rest.models.Compound;
import com.protolab.rest.models.dtos.CompoundDto;
import com.protolab.rest.repositories.CompoundRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CompoundService {

    private CompoundRepository compoundRepository;
    private CompoundMapper compoundMapper;

    public CompoundService(CompoundRepository compoundRepository, CompoundMapper compoundMapper) {
        this.compoundRepository = compoundRepository;
        this.compoundMapper = compoundMapper;
    }

    /*
    *
    *   DAO - Data Access Object
    *
    */

    public List<Compound> getCompounds() {
        return compoundRepository.findAll();
    }

    /*
     *
     *   DTO - Data Transform Object
     *
     */

    public List<CompoundDto> getCompoundsNoTimestamp() {
        return compoundRepository
                .findAll()
                .stream()
                .map(compoundMapper::map)
                .collect(Collectors.toList());
    }

    /*
     *
     *   Insert
     *
     */

    public Compound addCompound(CompoundDto compoundDto) {
        return compoundRepository
                .save(compoundMapper.reverseMap(compoundDto));
    }
}
