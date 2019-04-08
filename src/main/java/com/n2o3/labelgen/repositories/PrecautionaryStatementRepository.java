package com.n2o3.labelgen.repositories;

import com.n2o3.labelgen.models.PrecautionaryStatement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrecautionaryStatementRepository extends JpaRepository<PrecautionaryStatement, Long> {

}
