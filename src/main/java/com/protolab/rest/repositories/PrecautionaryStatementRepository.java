package com.protolab.rest.repositories;

import com.protolab.rest.models.PrecautionaryStatement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrecautionaryStatementRepository extends JpaRepository<PrecautionaryStatement, Long> {

}
