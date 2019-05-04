package com.protolab.rest.repositories;

import com.protolab.rest.models.Pictogram;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PictogramRepository extends JpaRepository<Pictogram, Long> {
}
