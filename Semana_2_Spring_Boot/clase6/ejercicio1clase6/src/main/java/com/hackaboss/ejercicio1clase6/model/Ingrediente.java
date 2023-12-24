package com.hackaboss.ejercicio1clase6.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Ingrediente {

    private long codigoIngrediente;
    private String nombre;
    private int cantidadCalorias;
}
