package com.pf.busqueda.repository;

import com.pf.busqueda.model.Reserva;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservaRepository extends CrudRepository<Reserva, Integer> {
    @Query(value = "SELECT * FROM mydb.reserva r, mydb.vuelo v\n" +
            "WHERE v.idvuelo = r.fk_idvuelo_ida AND r.estado_reserva = 'confirmado' AND r.numero_asiento IS NOT NULL \n" +
            "AND timestampdiff(HOUR, current_timestamp(), v.fecha_de_salida)<24", nativeQuery = true)
    void getTarjetaEmbarque();// este hay que modificarlo
    @Query(value = "UPDATE mydb.reserva r JOIN mydb.vuelo v on r.fk_idvuelo_ida=v.idvuelo AND datediff(current_date(), r.fecha_de_reserva)>=7 AND r.id_tarjeta_embarque='12345' SET r.estado_reserva = 'cancelada'", nativeQuery = true)
    void cancelarVuelo();
}
