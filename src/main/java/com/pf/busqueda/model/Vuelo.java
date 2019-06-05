package com.pf.busqueda.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Vuelo {
    @Id
    private Integer id;
}
