package com.pf.busqueda.repository;

import com.pf.busqueda.model.Pasajero;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PasajeroRepository extends CrudRepository<Pasajero, Integer> {
    // Q6
    @Query(value = "SELECT p.nombre, p.apellido_paterno, p.apellido_materno FROM pasajero p WHERE (SELECT count(*) FROM pasajero p2, reserva r2 WHERE p.id_pasajero=p2.id_pasajero AND p2.id_pasajero =r2.fk_pasajero_id_pasajero AND r2.embarque_prioritario = true) > 2", nativeQuery = true)
    List<Pasajero> getPasajerosPrioritariosMasDeUno();
}
