package com.n2o3.labelgen.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "compound")
public class Compound {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long compound_id;

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


}
