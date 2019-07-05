package com.pf.busqueda.controller;

import com.pf.busqueda.controller.assemblers.VueloResourceAssembler;
import com.pf.busqueda.model.Vuelo;
import com.pf.busqueda.service.VueloService;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.Resources;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController("/vuelo")
@RequestMapping("/vuelo")
public class VueloController {

    @Autowired
    private VueloService vueloService;

    @Autowired
    private VueloResourceAssembler vueloResourceAssembler;

    @GetMapping
    public ResponseEntity<List<Vuelo>> getVuelos(
            @ApiParam (name = "origen", value = "Aeropuerto origen") @RequestParam(value = "origen", defaultValue = "00AA") String origen,
            @ApiParam(name = "destino", value = "Aeropuerto destino") @RequestParam(value = "destino", defaultValue = "00A") String destino,
            @ApiParam(name = "fechaVuelo", value = "Fecha salida") @RequestParam(value = "fechaVuelo", defaultValue = "05-06-2019") @DateTimeFormat(pattern = "dd-MM-yyyy") LocalDate fechaVuelo){

        return new ResponseEntity<>(vueloService.getVuelos(origen, destino, java.sql.Date.valueOf(fechaVuelo)), HttpStatus.OK);
    }

    @GetMapping("/{idAgencia}/agencia")
    public Resources<Resource<Vuelo>> getVuelosContratadosAgencia(@PathVariable("idAgencia") Integer idAgencia){

        final Iterable<Vuelo> list = vueloService.getVuelosContratados(idAgencia);
        return new Resources<>(StreamSupport.stream(list.spliterator(), false).map(vueloResourceAssembler::toResource).collect(Collectors.toList()));
    }

    @GetMapping("/{id}/")
    public Resource<Vuelo> getById(@PathVariable("id") Integer id){

        return vueloResourceAssembler.toResource(vueloService.findById(id).orElse(null));
    }

    @GetMapping("/con-plaza")
    public Resources<Resource<Vuelo>> getVuelosConPLazaDisponible(
            @ApiParam(name = "idOrigen", value = "Origen") @RequestParam(value = "idOrigen", defaultValue = "00AA") String idOrigen,
            @ApiParam(name = "idDestino", value = "Destino") @RequestParam(value = "idDestino", defaultValue = "00A") String idDestino,
            @ApiParam(name = "numPasajeros", value = "Número de pasajeros que van a viajar") @RequestParam(value = "numPasajeros", defaultValue = "1") Integer numPasajeros,
            @ApiParam(name = "fecha", value = "Fecha del vuelo") @RequestParam(name = "fecha", defaultValue = "12-09-2019") @DateTimeFormat(pattern = "dd-MM-yyyy")  Date fecha,
            @ApiParam(name = "tipoVuelo", value = "Si es vuelo de ida o de ida y vuelta")
            @RequestParam(name = "tipoVuelo", defaultValue = "false") boolean tipoVuelo){

        final List<Vuelo> vuelos = vueloService.getVuelosConPlazaDisponible(idOrigen, idDestino, numPasajeros, fecha, tipoVuelo);
        return new Resources<>(vuelos.stream().map(vueloResourceAssembler::toResource).collect(Collectors.toList()));
    }
}
