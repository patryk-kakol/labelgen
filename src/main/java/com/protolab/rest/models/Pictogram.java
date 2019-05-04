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
@Table(name = "pictogram")
public class Pictogram {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pictogram_id", nullable = false)
    private Long pictogramId;

    @Column(name = "code", nullable = false)
    private String code;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "path", nullable = false)
    private String path;

    @Column(name = "timestamp")
    private String timestamp;
}
