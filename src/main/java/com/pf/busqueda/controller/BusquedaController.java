package com.pf.busqueda.controller;

import com.pf.busqueda.model.Vuelo;
import com.pf.busqueda.service.VueloService;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@RestController("/busqueda")
public class BusquedaController {

    @Autowired
    private VueloService vueloService;

    @GetMapping("/vuelos")
    public ResponseEntity<List<Vuelo>> getVuelos(
            @Valid @ApiParam (name = "origen", value = "Aeropuerto origen") @RequestParam(value = "origen") String origen,
            @Valid @ApiParam(name = "destino", value = "Aeropuerto destino") @RequestParam(value = "destino") String destino,
            @Valid @ApiParam(name = "fechaVuelo", value = "Fecha salida") @RequestParam(value = "destino") Date fechaVuelo){
        return new ResponseEntity<List<Vuelo>>(vueloService.getVuelos(origen, destino, fechaVuelo), HttpStatus.OK);
    }

}
