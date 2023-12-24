package com.hackaboss.ejercicio1clase6.dto;

import com.hackaboss.ejercicio1clase6.model.Ingrediente;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class IngredienteDTO {

    private String nombre;
    private int totalCalorias;
    private List<Ingrediente> ingredientes;
    private Ingrediente ingredienteConMasCalorias;
}
