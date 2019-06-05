package com.pf.busqueda.model;

import lombok.Data;

import java.util.Date;

@Data
public class Vuelos {
    private Integer id;
    private Date fechaSalida;
    private Date fechaLlegada;
    private Float precio;


}
