package com.pf.busqueda.controller;

import com.pf.busqueda.model.Reserva;
import com.pf.busqueda.service.RabbitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController("/reserva")
@RequestMapping("/reserva")
public class ReservaController {

    @Autowired
    private RabbitService rabbitService;


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void crearReserva (@RequestBody @Valid Reserva reserva){
        rabbitService.enviarPeticionPago(reserva);
    }
}
