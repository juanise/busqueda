package com.pf.busqueda.model.dto;

public class EmbarqueDTO {
    private String nombre;
    private Integer asiento;
    private Integer vuelo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getAsiento() {
        return asiento;
    }

    public void setAsiento(Integer asiento) {
        this.asiento = asiento;
    }

    public Integer getVuelo() {
        return vuelo;
    }

    public void setVuelo(Integer vuelo) {
        this.vuelo = vuelo;
    }
}
