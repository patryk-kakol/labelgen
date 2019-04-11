package com.protolab.rest.repositories;

import com.protolab.rest.models.HazardStatement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HazardStatementRepository extends JpaRepository<HazardStatement, Long> {

}
