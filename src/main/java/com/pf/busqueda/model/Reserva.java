package com.pf.busqueda.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity(name = "reserva")
public class Reserva {
    @Id
    @Column(name = "id_tarjeta_embarque")
    private Integer id;
    @Column(name = "factura_de_equipaje")
    private Boolean equipaje;
    @Column(name = "embarque_prioritario")
    private Boolean prioritario;
    @Column(name = "fecha_de_reserva")
    private Date fechaReserva;
    @Column(name = "costo_total_reserva")
    private Integer costoReserva;
    @Column(name = "numero_asiento")
    private String numeroAsiento;
    @Column(name = "estado_reserva")
    private String estadoReserva;
    @ManyToOne
    @JoinColumn(name = "fk_pasajero_id_pasajero")
    private Pasajero pasajero;
    @ManyToOne
    @JoinColumn(name = "fk_idagencia")
    private AgenciaViajes agenciaViajes;
    @ManyToOne
    @JoinColumn(name = "fk_idvuelo_ida")
    private Vuelo ida;
    @ManyToOne
    @JoinColumn(name = "fk_idvuelo_vuelta")
    private Vuelo vuelta;


}
