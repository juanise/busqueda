package com.pf.busqueda.repository;

import com.pf.busqueda.model.Aeropuertos;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface AeropuertoRepository extends CrudRepository<Aeropuertos, String> {
    @Query(value = "SELECT municipality AS ciudad, fk_aeropuerto_destino AS codigo_aeropuerto, SUM(costo_total_reserva) AS Importe_Total\n" +
            "FROM (aeropuerto a JOIN vuelo v ON v.fk_aeropuerto_destino = a.ident) \n" +
            "JOIN reserva r ON r.fk_idvuelo_ida = v.idvuelo\n" +
            "WHERE month (fecha_de_reserva) = month(sysdate())\n" +
            "GROUP BY fk_aeropuerto_destino, municipality\n" +
            "ORDER BY Importe_Total DESC\n" +
            "LIMIT 10", nativeQuery = true)
    List<String> getCiudadesMayorFacturacion();
    @Query(value = "SELECT month(Fecha_de_reserva) AS Mes, SUM(costo_total_reserva) AS costo_total \n" +
            "FROM reserva \n" +
            "WHERE date_sub(sysdate(),\n" +
            "INTERVAL 6 MONTH)<= fecha_de_reserva AND estado_reserva = 'confirmado’\n" +
            "GROUP BY month(fecha_de_reserva)", nativeQuery = true)
    List<BigDecimal> getImporteTotalReservasSeisMeses();
}
