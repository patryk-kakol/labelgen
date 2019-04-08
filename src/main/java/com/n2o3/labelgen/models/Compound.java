package com.n2o3.labelgen.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "compound")
public class Compound {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "compound_id", nullable = false)
    private Long compoundId;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "cas", nullable = false)
    private String cas;

    @Column(name = "we", nullable = false)
    private String we;

    @Column(name = "formula", nullable = false)
    private String formula;

    @Column(name = "un", nullable = false)
    private String un;

    @Column(name = "base_class", nullable = false)
    private String baseClass;

    @Column(name = "helper_class")
    private String helperClass;

    @Column(name = "packaging_group", nullable = false)
    private String packagingGroup;

    @Column(name = "timestamp")
    private String timestamp;

    @ManyToMany
    @JoinTable(
            name = "compound_hazard_statement",
            joinColumns = @JoinColumn(name = "compound_id"),
            inverseJoinColumns = @JoinColumn(name = "hazard_statement_id")
    )
    List<HazardStatement> applicableHazardStatements;

    @ManyToMany
    @JoinTable(
            name = "compound_precautionary_statement",
            joinColumns = @JoinColumn(name = "compound_id"),
            inverseJoinColumns = @JoinColumn(name = "precautionary_statement_id")
    )
    List<HazardStatement> applicablePrecautionaryStatements;

}
