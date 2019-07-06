package com.pf.busqueda.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Entity(name = "pasajero")
public class Pasajero {
    @Id
    @Column(name = "id_pasajero")
    private Integer id;
    @Column(name = "dni_pasaporte")
    private String dniPassaporte;
    @Column
    private String name;
    @Column(name = "apellido_paterno")
    private String apellidoPaterno;
    @Column(name = "apellido_materno")
    private String apellidoMaterno;
}