package com.n2o3.labelgen.services;

import com.n2o3.labelgen.models.Odczynnik;
import com.n2o3.labelgen.repositories.OdczynnikRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OdczynnikService {

    private OdczynnikRepository odczynnikRepository;

    public OdczynnikService(OdczynnikRepository odczynnikRepository) {
        this.odczynnikRepository = odczynnikRepository;
    }


    /*
    *
    *   DAO - Data Access Object
    *
    */

    public List<Odczynnik> getOdczynnik() {
        return odczynnikRepository.findAll();
    }



    /*
     *
     *   DTO - Data Transform Object
     *
     */
}
