package com.pf.busqueda.service;

import com.pf.busqueda.config.RabbitConfig;
import com.pf.busqueda.model.Reserva;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabbitListenerService {
    private static final Logger LOGGER = LoggerFactory.getLogger(RabbitListenerService.class);
    @Autowired
    private ReservaService reservaService;

    @RabbitListener(queues = {RabbitConfig.COLA_PAGO})
    public void informacionPagoRecibida (Reserva reserva){
        try{
            reservaService.create(reserva);
        } catch (Exception e){
            LOGGER.error("Error al guardar la reserva {}", reserva, e);
        }
    }

}
