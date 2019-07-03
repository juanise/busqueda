package com.pf.busqueda.service;

import com.pf.busqueda.model.Pasajero;
import com.pf.busqueda.repository.PasajeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PasajeroService {
    @Autowired
    private PasajeroRepository pasajeroRepository;

    public List<Pasajero> getPasajerosPrioritariosMasDeUno(){
        return pasajeroRepository.getPasajerosPrioritariosMasDeUno();
    }
}
