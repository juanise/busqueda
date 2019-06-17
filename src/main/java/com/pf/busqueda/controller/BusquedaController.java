package com.pf.busqueda.controller;

import com.pf.busqueda.model.Vuelo;
import com.pf.busqueda.service.VueloService;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@RestController("/busqueda")
public class BusquedaController {

    @Autowired
    private VueloService vueloService;

    @GetMapping("/vuelos")
    public ResponseEntity<List<Vuelo>> getVuelos(
            @ApiParam (name = "origen", value = "Aeropuerto origen") @RequestParam(value = "origen", defaultValue = "00AA") String origen,
            @ApiParam(name = "destino", value = "Aeropuerto destino") @RequestParam(value = "destino", defaultValue = "00A") String destino,
            @ApiParam(name = "fechaVuelo", value = "Fecha salida") @RequestParam(value = "fechaVuelo", defaultValue = "05-06-2019") @DateTimeFormat(pattern = "dd-MM-yyyy") LocalDate fechaVuelo){
        return new ResponseEntity<>(vueloService.getVuelos(origen, destino, java.sql.Date.valueOf(fechaVuelo)), HttpStatus.OK);
    }



}
