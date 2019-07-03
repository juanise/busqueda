package com.pf.busqueda.service;

import com.pf.busqueda.repository.AeropuertoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class AeropuertoService {
    @Autowired
    private AeropuertoRepository aeropuertoRepository;

    public List<String> getCiudadesMayorFacturacion(){
        return aeropuertoRepository.getCiudadesMayorFacturacion();
    }

    public List<BigDecimal> getImporteTotalReservasSeisMeses(){
        return aeropuertoRepository.getImporteTotalReservasSeisMeses();
    }
}
