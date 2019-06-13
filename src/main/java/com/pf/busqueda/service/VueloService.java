package com.pf.busqueda.service;

import com.pf.busqueda.model.Vuelo;
import com.pf.busqueda.model.dto.Q3DTO;
import com.pf.busqueda.repository.VueloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class VueloService {
    @Autowired
    private VueloRepository vueloRepository;

    public List<Vuelo> getVuelosConPlazaDisponible(String idOrigen, String idDestino, Integer numPasajeros, Date fecha, Boolean tipoVuelo){
        return vueloRepository.getVuelosConPlazaDisponible(idOrigen, idDestino, numPasajeros, fecha, tipoVuelo);
    }

    public List<Vuelo> getVuelos(String origen, String destino, Date fechaVuelo){
        return vueloRepository.getVuelos(origen, destino, fechaVuelo);
    }

    public List<Q3DTO> getVuelosContratados(Integer idagencia){
        return vueloRepository.getVuelosContratados(idagencia);
    }
}
