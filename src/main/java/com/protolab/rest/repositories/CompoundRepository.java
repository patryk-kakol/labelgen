package com.protolab.rest.repositories;

import com.protolab.rest.models.Compound;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface CompoundRepository extends JpaRepository<Compound, Long> {

    @Query(value = "SELECT c FROM Compound c WHERE c.compoundId = ?1")
    Optional<Compound> findCompoundByCompoundId(Long compoundId);


//    NOT IN USE YET
//
//    @Query(value = "SELECT c FROM Compound c WHERE c.name = ?1")
//    Optional<Compound> findCompoundByName(String name);
//
//    @Query(value = "SELECT c FROM Compound c WHERE c.name LIKE ?1 OR c.formula LIKE ?1")
//    List<Compound> findCompoundsByNameOrFormula(String pattern);
//
//    @Query(value = "SELECT c FROM Compound c WHERE c.formula = ?1")
//    Optional<Compound> findCompoundByFormula(String formula);
//
//    @Transactional
//    @Modifying
//    @Query(value = "DELETE FROM Compound c WHERE c.name = ?1")
//    void deleteCompoundByCompoundName(String name);

}