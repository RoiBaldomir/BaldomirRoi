package com.ejercicios.ejerciciovotacion.logica;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Partido implements Serializable {
    @Id @Column(length = 50)
    private String nombre;
    private int votos;

    public Partido() {
    }

    public Partido(String nombre, int votos) {
        this.nombre = nombre;
        this.votos = votos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }
    
}
