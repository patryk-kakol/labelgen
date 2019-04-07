package com.n2o3.labelgen.services;

import com.n2o3.labelgen.models.Compound;
import com.n2o3.labelgen.repositories.CompoundRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompoundService {

    private CompoundRepository compoundRepository;

    public CompoundService(CompoundRepository compoundRepository) {
        this.compoundRepository = compoundRepository;
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
}
