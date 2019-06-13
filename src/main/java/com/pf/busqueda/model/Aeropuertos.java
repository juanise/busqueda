package com.pf.busqueda.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity(name = "aeropuerto")
public class Aeropuertos {
    @Id
    @Column(name = "ident")
    private String id;
    @Column
    private String type;
    @Column
    private String name;
    @Column(name = "elevacion_ft")
    private Float elevacion;
    @Column
    private String continent;
    @Column(name = "iso_country")
    private String country;
    @Column(name = "iso_region")
    private String region;
    @Column
    private String municipality;
    @Column(name = "gps_code")
    private String posicionGps;
    @Column(name = "iata_code")
    private String iataCode;
    @Column(name = "local_code")
    private String localCode;
    @Column(name = "coordinates")
    private String coordenadas;
}
