package com.pf.busqueda.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Pasajero {
    @Id
    private Integer id;

}