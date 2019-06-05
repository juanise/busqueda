package com.pf.busqueda.repository;

import com.pf.busqueda.model.Pasajero;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VuelingRepository extends CrudRepository<Pasajero, Integer> {


}
