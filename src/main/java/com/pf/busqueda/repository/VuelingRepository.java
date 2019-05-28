package com.pf.busqueda.repository;

import com.pf.Pasajero;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VuelingRepository extends CrudRepository<Pasajero, Integer> {


}
