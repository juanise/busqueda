package com.pf.busqueda.repository;

import com.pf.busqueda.model.Vuelo;
import com.pf.busqueda.model.dto.Q3DTO;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface VueloRepository extends CrudRepository<Vuelo, Integer> {

    @Query(value = "SELECT * FROM mydb.vuelo v ,mydb.avion a \n" +
            "WHERE v.fecha_de_salida <= current_date() AND v.fk_aeropuerto_destino = :destino AND v.fk_aeropuerto_origen= :origen AND v.fecha_de_salida \n" +
            "BETWEEN (SELECT date_add(:fechaVuelo, INTERVAL -3 day))\n" +
            " AND (SELECT date_add(:fechaVuelo, INTERVAL 3 day)) AND v.fk_avion_idavion=a.idavion AND a.max_capacidad_de_pasajeros >=(SELECT COUNT(*) FROM mydb.reserva r) ORDER BY v.tarifas ASC", nativeQuery = true)
    List<Vuelo> getVuelos(@Param(value = "origen") String origen, @Param(value = "destino") String destino, @Param(value = "fechaVuelo") Date fechaVuelo);

    @Query(value = "SELECT * FROM vuelo v, avion a WHERE v.fecha_de_salida >= current_date and v.fecha_de_salida >= :fecha v.fk_aeropuerto_destino = :destino AND v.fk_aeropuerto_origen = :origen AND v.fk_avion_idavion = a.idavion AND v.tipo_de_vuelo = :tipoVuelo AND a.max_capacidad_de_pasajeros = :numPasajeros + (SELECT COUNT(*) FROM reserva r where r.fk_idvuelo_ida = v.idvuelo)", nativeQuery = true)
    List<Vuelo> getVuelosConPlazaDisponible(@Param(value = "origen") String idOrigen, @Param(value = "destino") String idDestino, @Param(value = "numPasajeros") Integer numPasajeros, @Param(value = "fecha") Date fecha, @Param(value = "tipoVuelo") Boolean tipoVuelo);

    @Query(value = "select v.* FROM vuelo v left join reserva r on v.idvuelo = r.fk_idvuelo_ida or v.idvuelo = r.fk_idvuelo_vuelta left join agencia_de_viajes a ON a.idagencia = r.fk_idagencia WHERE a.idagencia = :idagencia", nativeQuery = true)
    List<Q3DTO> getVuelosContratados(@Param(value = "idagencia") Integer idagencia);

}
