package com.pf.busqueda.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/busqueda")
public class BusquedaController {
    @GetMapping("/prueba")
    public ResponseEntity<Integer> prueba(){
        return new ResponseEntity<>(5, HttpStatus.OK);
    }
}
