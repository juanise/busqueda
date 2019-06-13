package com.pf.busqueda.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity(name = "agencia_de_viajes")
@Data
public class AgenciaViajes {
    @Id
    @Column(name = "idagencia")
    private Integer id;

    @Column(name = "codigo_agencia")
    private String codigo;

}
