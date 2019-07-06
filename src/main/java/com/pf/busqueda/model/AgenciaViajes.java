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
@Entity(name = "agencia_de_viajes")
public class AgenciaViajes {
    @Id
    @Column(name = "idagencia")
    private Integer id;

    @Column(name = "codigo_agencia")
    private String codigo;

}
