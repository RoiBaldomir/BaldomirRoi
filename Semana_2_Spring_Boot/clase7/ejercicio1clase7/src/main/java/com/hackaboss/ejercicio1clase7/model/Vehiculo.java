package com.hackaboss.ejercicio1clase7.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Vehiculo {

    private long id;
    private String marca;
    private String modelo;
    private int kilometros;
    private int puertas;
    private int precio;
}
