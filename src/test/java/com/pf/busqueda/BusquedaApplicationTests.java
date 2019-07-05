package com.pf.busqueda;

import com.pf.busqueda.model.Pasajero;
import com.pf.busqueda.model.Vuelo;
import com.pf.busqueda.model.dto.EmbarqueDTO;
import com.pf.busqueda.repository.*;
import com.pf.busqueda.service.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BusquedaApplicationTests {

    @MockBean
    private VueloRepository vueloRepository;
    @MockBean
    private PasajeroRepository pasajeroRepository;
    @MockBean
    private AeropuertoRepository aeropuertoRepository;
    @Autowired
    private VueloService vueloService;
    @Autowired
    private PasajeroService pasajeroService;
    @Autowired
    private AeropuertoService aeropuertoService;

    private static final List<Vuelo> VUELOS_AGENCIA1 = TestUtils.getVuelosAgencias();
    private static final List<EmbarqueDTO> EMBARQUES = TestUtils.getembarques();
    private static final List<Pasajero> PASAJEROS = TestUtils.getPasajeros();
    private static final List<String> CIUDADES = TestUtils.getCiudades();
    private static final List<Double> IMPORTES_RESERVAS = TestUtils.getImportesReservas();

    @Before
    public void setup() throws ParseException {


        final Date fecha = TestUtils.getFecha("25-01-2019");

        BDDMockito.given(vueloRepository.getVuelosContratados(1)).willReturn(VUELOS_AGENCIA1);
        BDDMockito.given(vueloRepository.getVuelos("Valencia", "Francia", fecha)).willReturn(VUELOS_AGENCIA1);
        BDDMockito.given(vueloRepository.getEmbarquesPendientesToDTO(2)).willReturn(EMBARQUES);
        BDDMockito.given(vueloRepository.getVuelosConPlazaDisponible("Valencia", "Francia", 4, fecha, false)).willReturn(VUELOS_AGENCIA1);

        BDDMockito.given(pasajeroRepository.getPasajerosPrioritariosMasDeUno()).willReturn(PASAJEROS);
        BDDMockito.given(aeropuertoRepository.getCiudadesMayorFacturacion()).willReturn(CIUDADES);
        BDDMockito.given(aeropuertoRepository.getImporteTotalReservasSeisMeses()).willReturn(IMPORTES_RESERVAS);
    }

    @Test
    public void contextLoads() {
    }

    @Test
    public void vueloTest() throws ParseException {
        final Date fecha = TestUtils.getFecha("25-01-2019");
        Vuelo[] vueloArray = VUELOS_AGENCIA1.toArray(new Vuelo[0]);
        Assert.assertArrayEquals(vueloArray, vueloService.getVuelosContratados(1).toArray(new Vuelo[0]));
        Assert.assertArrayEquals(vueloArray, vueloService.getVuelos("Valencia", "Francia", TestUtils.getFecha("25-01-2019")).toArray(new Vuelo[0]));
        Assert.assertArrayEquals(EMBARQUES.toArray(new EmbarqueDTO[0]), vueloService.getEmbarquesPendientes(2).toArray(new EmbarqueDTO[0]));
        Assert.assertArrayEquals(vueloArray, vueloService.getVuelosConPlazaDisponible("Valencia", "Francia", 4, fecha, false).toArray(new Vuelo[0]));
    }

    @Test
    public void pasajeroTest(){
        Assert.assertArrayEquals(PASAJEROS.toArray(new Pasajero[0]), pasajeroService.getPasajerosPrioritariosMasDeUno().toArray(new Pasajero[0]));
    }

    @Test
    public void aeropuertoTest(){
        Assert.assertArrayEquals(CIUDADES.toArray(new String[0]), aeropuertoService.getCiudadesMayorFacturacion().toArray(new String[0]));
        Assert.assertArrayEquals(IMPORTES_RESERVAS.toArray(new BigDecimal[0]), aeropuertoService.getImporteTotalReservasSeisMeses().toArray(new BigDecimal[0]));
    }
}
