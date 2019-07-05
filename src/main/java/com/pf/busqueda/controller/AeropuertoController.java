package com.pf.busqueda.controller;

import com.pf.busqueda.service.AeropuertoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController("/aeropuertos")
@RequestMapping("/aeropuertos")
public class AeropuertoController {
    @Autowired
    private AeropuertoService aeropuertoService;

    @GetMapping("/ciudades-max-facturacion")
    public ResponseEntity<List<String>> getCiudadesMayorFacturacion(){
        return new ResponseEntity<>(aeropuertoService.getCiudadesMayorFacturacion(), HttpStatus.OK);
    }

    @GetMapping("reserva/seis-meses")
    public ResponseEntity<List<Double>> getImporteTotalReservasSeisMeses(){
        return new ResponseEntity<>(aeropuertoService.getImporteTotalReservasSeisMeses(), HttpStatus.OK);
    }
}
