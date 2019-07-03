package com.pf.busqueda.controller;

import com.pf.busqueda.model.Pasajero;
import com.pf.busqueda.service.PasajeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/pasajeros")
public class PasajeroController {
    @Autowired
    private PasajeroService pasajeroService;

    @GetMapping("/estadisticas-embarque-prioritario")
    public List<Pasajero> getPasajerosMasUnoPrioritario(){
        return pasajeroService.getPasajerosPrioritariosMasDeUno();
    }
}
