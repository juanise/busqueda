package com.pf.busqueda.controller;

import com.pf.busqueda.model.dto.EmbarqueDTO;
import com.pf.busqueda.service.VueloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/acciones")
public class AccionesController {

    @Autowired
    private VueloService vueloService;

    @GetMapping("/embarques")
    public List<EmbarqueDTO> getEmbarquesPendientesVuelo(@PathVariable("idVuelo") Integer idVuelo){
        return vueloService.getEmbarquesPendientes(idVuelo);
    }

}
