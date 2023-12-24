package com.hackaboss.ejercicio1clase5.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Calificacion {

    private int id;
    private double calificacion1;
    private double calificacion2;
    private double calificacion3;
    private double promedio;
    private Estudiante estudiante;
}
