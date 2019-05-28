package com.pf.busqueda;

import com.pf.Vuelo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan("com.pf")
public class BusquedaApplication {

    public static void main(String[] args) {

        SpringApplication.run(BusquedaApplication.class, args);
    }

}
