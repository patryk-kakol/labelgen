package com.protolab.rest.repositories;

import com.protolab.rest.models.Compound;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompoundRepository extends JpaRepository<Compound, Long> {

}
