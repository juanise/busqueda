package com.pf.busqueda.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class Vuelo {
    @Id
    @Column(name = "idvuelo")
    private Integer id;
    @Column(name = "fecha_de_salida")
    private Date fechaSalida;
    @Column(name = "fecha_de_llegada")
    private Date fechaLlegada;
    @Column(name = "tarjeta_de_embarque")
    private String tarjetaEmbarque;
    @Column(name = "tarifas")
    private Float tarifas;
    @Column(name = "estado_del_vuelo")
    private String estadoVuelo;
    @Column(name = "tipo_de_vuelo")
    private Boolean tipoVuelo;

}
