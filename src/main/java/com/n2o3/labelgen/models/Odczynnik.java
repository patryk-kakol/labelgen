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
@Table(name = "odczynnik")
public class Odczynnik {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long odczynnik_id;

    @Column(name = "nazwa", nullable = false)
    private String nazwa;

    @Column(name = "CAS", nullable = false)
    private String cas;

    @Column(name = "WE", nullable = false)
    private String we;

    @Column(name = "wzor", nullable = false)
    private String wzor;

    @Column(name = "UN", nullable = false)
    private String un;

    @Column(name = "klasa_podstawowa", nullable = false)
    private String klasaPodstawowa;

    @Column(name = "klasa_pomocnicza")
    private String klasaPomocnicza;

    @Column(name = "grupa_pakowania", nullable = false)
    private String grupaPakowania;

    @Column(name = "timestamp")
    private String timestamp;


}
