package com.hackaboss.ejercicio1clase6.service;

import com.hackaboss.ejercicio1clase6.dto.IngredienteDTO;
import com.hackaboss.ejercicio1clase6.model.Ingrediente;
import com.hackaboss.ejercicio1clase6.model.Plato;
import com.hackaboss.ejercicio1clase6.repository.PlatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.util.Comparator;

@Service
public class PlatoService implements IPlatoService {

    @Autowired
    PlatoRepository platoRepository;

    @Override
    public IngredienteDTO devolverCaloriasPlato(String nombre) throws FileNotFoundException {

        IngredienteDTO dto = new IngredienteDTO();

        Plato platoSolicitado = platoRepository.devolverListaPlatos().stream()
                .filter(plato -> plato.getNombre().equalsIgnoreCase(nombre))
                .findFirst()
                .orElse(null);

        int totalCaloriasPlato = platoSolicitado.getIngredientes()
                .stream()
                .mapToInt(Ingrediente::getCantidadCalorias)
                .sum();

        Ingrediente ingredienteMasCalorico = platoSolicitado.getIngredientes()
                .stream()
                .max(Comparator.comparing(Ingrediente::getCantidadCalorias))
                .orElse(null);


        dto.setNombre(platoSolicitado.getNombre());
        dto.setTotalCalorias(totalCaloriasPlato);
        dto.setIngredienteConMasCalorias(ingredienteMasCalorico);
        dto.setIngredientes(platoSolicitado.getIngredientes());

        return dto;
    }
}
