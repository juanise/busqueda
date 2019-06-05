package com.pf.busqueda.model;

import lombok.Data;

import java.util.Date;

@Data
public class Reserva {
    private Boolean equipaje;
    private Boolean prioritario;
    private Date fechaReserva;
    private TipoVuelo tipoVuelo;

}
