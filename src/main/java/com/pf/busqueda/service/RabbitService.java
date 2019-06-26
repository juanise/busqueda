package com.pf.busqueda.service;

import com.pf.busqueda.config.RabbitConfig;
import com.pf.busqueda.model.Reserva;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabbitService {
    private static final Logger LOGGER = LoggerFactory.getLogger(RabbitListener.class);
    @Autowired
    private RabbitTemplate rabbitTemplate;
    @Autowired
    private RabbitConfig rabbitConfig;

    public void enviarPeticionPago(Reserva reserva){
        LOGGER.info("Enviando peticion de pago");
        rabbitTemplate.convertAndSend(rabbitConfig.exchange, "rk.peticion.pago", reserva);
    }
}
