package com.protolab.rest.models;

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
@Table(name = "precautionary_statement")
public class PrecautionaryStatement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "precautionary_statement_id", nullable = false)
    private Long precautionaryStatementId;

    @Column(name = "code", nullable = false)
    private String code;

    @Column(name = "text", nullable = false)
    private String text;

    @Column(name = "timestamp")
    private String timestamp;
}
