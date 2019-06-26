package com.pf.busqueda.repository;

import com.pf.busqueda.model.Avion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvionRepository extends CrudRepository<Avion, Integer> {
}
