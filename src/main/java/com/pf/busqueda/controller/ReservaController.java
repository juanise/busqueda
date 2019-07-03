package com.pf.busqueda.controller;

import com.pf.busqueda.model.Reserva;
import com.pf.busqueda.service.RabbitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController("/reserva")
public class ReservaController {

    @Autowired
    private RabbitService rabbitService;


    @PostMapping("/reservar")
    @ResponseStatus(HttpStatus.CREATED)
    public void crearReserva (@RequestBody @Valid Reserva reserva){
        rabbitService.enviarPeticionPago(reserva);
    }
}
