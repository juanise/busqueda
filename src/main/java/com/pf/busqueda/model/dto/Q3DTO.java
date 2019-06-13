package com.pf.busqueda.model.dto;

import com.pf.busqueda.model.AgenciaViajes;
import com.pf.busqueda.model.Vuelo;
import lombok.Data;

@Data
public class Q3DTO {
    private Vuelo vuelo;
    private AgenciaViajes estadoVuelo;
    public Q3DTO(){
        super();
    }
    public Q3DTO(Vuelo vuelo, AgenciaViajes estadoVuelo){
        super();
        this.vuelo = vuelo;
        this.estadoVuelo = estadoVuelo;
    }
}
