package com.pf.busqueda.service;

import com.pf.busqueda.model.Vuelo;
import com.pf.busqueda.model.dto.EmbarqueDTO;
import com.pf.busqueda.repository.VueloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

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

    public List<Vuelo> getVuelosContratados(Integer idagencia){
        return vueloRepository.getVuelosContratados(idagencia);
    }

    public Optional<Vuelo> findById(Integer id) {
        return vueloRepository.findById(id);
    }

    public List<EmbarqueDTO> getEmbarquesPendientes(Integer idVuelo) {
        return vueloRepository.getEmbarquesPendientesToDTO(idVuelo);
    }
}
