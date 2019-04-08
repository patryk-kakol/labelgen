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
@Table(name = "hazard_statement")
public class HazardStatement {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hazard_statement_id", nullable = false)
    private Long hazardStatementId;

    @Column(name = "code", nullable = false)
    private String code;

    @Column(name = "text", nullable = false)
    private String text;

    @Column(name = "timestamp")
    private String timestamp;

}
