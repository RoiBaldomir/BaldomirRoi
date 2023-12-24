package com.hackaboss.ejercicio1clase6.service;

import com.hackaboss.ejercicio1clase6.dto.IngredienteDTO;
import com.hackaboss.ejercicio1clase6.model.Ingrediente;
import com.hackaboss.ejercicio1clase6.model.Plato;

import java.io.FileNotFoundException;
import java.util.List;

public interface IPlatoService {

    public IngredienteDTO devolverCaloriasPlato(String nombre) throws FileNotFoundException;
}
