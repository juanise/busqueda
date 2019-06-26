package com.pf.busqueda.service;

import com.pf.busqueda.model.Reserva;
import com.pf.busqueda.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservaService {

    @Autowired
    private ReservaRepository reservaRepository;

    public Reserva create(Reserva reserva){
        return reservaRepository.save(reserva);
    }
}
