package com.pf.busqueda.controller.assemblers;

import com.pf.busqueda.controller.AvionController;
import com.pf.busqueda.model.Avion;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.ResourceAssembler;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

@Component
public class AvionResourceAssembler implements ResourceAssembler<Avion, Resource<Avion>> {

	@Override
	public Resource<Avion> toResource(Avion entity) {
		return new Resource<>(entity,
				linkTo(methodOn(AvionController.class).getById(entity.getId())).withSelfRel(),
				linkTo(methodOn(AvionController.class).getAll()).withRel("aviones"));
	}

}