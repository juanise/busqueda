package com.pf.busqueda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.pf")
public class BusquedaApplication {

    public static void main(String[] args) {

        SpringApplication.run(BusquedaApplication.class, args);
    }

}
