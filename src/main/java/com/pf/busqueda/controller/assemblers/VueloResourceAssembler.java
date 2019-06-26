package com.pf.busqueda.controller.assemblers;

import com.pf.busqueda.controller.VueloController;
import com.pf.busqueda.model.Vuelo;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.ResourceAssembler;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

@Component
public class VueloResourceAssembler implements ResourceAssembler<Vuelo, Resource<Vuelo>> {
    @Override
    public Resource<Vuelo> toResource(Vuelo vuelo) {
        return new Resource<>(vuelo, linkTo(methodOn(VueloController.class).getById(vuelo.getId())).withSelfRel());
    }
}
