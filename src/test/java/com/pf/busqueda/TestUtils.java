package com.pf.busqueda;

import com.pf.busqueda.model.Pasajero;
import com.pf.busqueda.model.Vuelo;
import com.pf.busqueda.model.dto.EmbarqueDTO;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public final class TestUtils {
    private static final Locale LOCALE = Locale.forLanguageTag("es-ES");
    private static final SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat("dd-MM-yyyy", LOCALE);
    /**
     * contructor privado para evitar que se instancie
     */
    private TestUtils(){
        super();
        throw new IllegalStateException("Esta clase no se debe instanciar");
    }

    public static List<Vuelo> getVuelosAgencias() {
        try {
            final List<Vuelo> vuelos = new ArrayList<>();
            final Vuelo vuelo = new Vuelo();
            vuelo.setId(1);
            vuelo.setEstadoVuelo("Estado");
            vuelo.setFechaLlegada(SIMPLE_DATE_FORMAT.parse("29-01-2019"));
            vuelo.setFechaSalida(SIMPLE_DATE_FORMAT.parse("25-01-2019"));
            vuelos.add(vuelo);
            return vuelos;
        }catch (ParseException e){
            // No me interesa esta excepcion
        }
        return Collections.emptyList();
    }

    public static List<EmbarqueDTO> getembarques() {
        final EmbarqueDTO embarqueDTO = new EmbarqueDTO();
        embarqueDTO.setAsiento(100);
        embarqueDTO.setNombre("Pepe");
        embarqueDTO.setVuelo(1);
        final List<EmbarqueDTO> embarques = new ArrayList<>();
        embarques.add(embarqueDTO);
        return embarques;
    }

    public static Date getFecha(String fecha) throws ParseException {
        return SIMPLE_DATE_FORMAT.parse(fecha);
    }

    public static List<Pasajero> getPasajeros() {
        final Pasajero pasajero = new Pasajero();
        pasajero.setName("Pedro");
        pasajero.setId(2);
        pasajero.setApellidoMaterno("materno");
        pasajero.setApellidoPaterno("paterno");
        pasajero.setDniPassaporte("DNI");
        final List<Pasajero> pasajeros = new ArrayList<>();
        pasajeros.add(pasajero);
        return pasajeros;
    }

    public static List<String> getCiudades(){
        final List<String> ciudades = new ArrayList<>();
        ciudades.add("Valencia");
        ciudades.add("Madrid");
        return ciudades;
    }

    public static List<BigDecimal> getImportesReservas() {
        final List<BigDecimal> importes = new ArrayList<>();
        importes.add(BigDecimal.valueOf(1000D));
        importes.add(BigDecimal.valueOf(2000D));
        importes.add(BigDecimal.valueOf(3000D));
        importes.add(BigDecimal.valueOf(4000D));
        importes.add(BigDecimal.valueOf(5000D));
        importes.add(BigDecimal.valueOf(6000D));
        return importes;
    }
}
