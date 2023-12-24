package com.hackaboss.ejercicio1clase6.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Plato {

    private long codigoPlato;
    private String nombre;
    private double precio;
    private List<Ingrediente> ingredientes;
}
