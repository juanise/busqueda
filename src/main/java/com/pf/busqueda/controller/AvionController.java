package com.pf.busqueda.controller;

import com.pf.busqueda.controller.assemblers.AvionResourceAssembler;
import com.pf.busqueda.model.Avion;
import com.pf.busqueda.service.AvionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.Resources;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

@RestController("/avion")
@RequestMapping("/avion")
public class AvionController {

    @Autowired
    private AvionResourceAssembler avionResourceAssembler;
    @Autowired
    private AvionService avionService;

    @GetMapping("/{id}")
    public Resource<Avion> getById (@PathVariable(value = "id") Integer id){
        return new Resource<>(avionService.findById(id).orElse(null));
    }

    @GetMapping
    public Resources<Resource<Avion>> getAllAviones(){
        return new Resources<>(StreamSupport.stream(avionService.findAll().spliterator(), false).map(avionResourceAssembler::toResource).collect(Collectors.toList()));
    }
}
