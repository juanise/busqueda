package com.pf.busqueda.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity(name = "avion")
public class Avion {
    @Id
    @Column(name = "idavion")
    private Integer id;
    @Column(name = "max_capacidad_de_pasajero")
    private Integer maxCapacidad;

}
