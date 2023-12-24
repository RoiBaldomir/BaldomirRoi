package com.hackaboss.ejercicio1clase6.repository;

import com.hackaboss.ejercicio1clase6.model.Ingrediente;
import com.hackaboss.ejercicio1clase6.model.Plato;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

@Repository
public class PlatoRepository {

    @Autowired
    private IngredienteRepository ingredienteRepository;

    public List<Plato> devolverListaPlatos() throws FileNotFoundException {

        List<Plato> platos = new ArrayList<>();

        try {

            JSONTokener tokener = new JSONTokener(new FileReader("src/main/java/com/hackaboss/ejercicio1clase6/repository/dishes.json"));
            JSONArray jsonArray = new JSONArray(tokener);

            List<Ingrediente> ingredientes;

            for (int i = 0; i < jsonArray.length(); i++) {

                JSONObject platoJson = jsonArray.getJSONObject(i);
                JSONArray ingredientesIds = platoJson.getJSONArray("ingredientes");

                Plato plato = new Plato();
                ingredientes = new ArrayList<>();

                plato.setCodigoPlato(platoJson.getLong("id"));
                plato.setNombre(platoJson.getString("nombre"));

                for (int j = 0; j < ingredientesIds.length(); j++) {
                    long id = ingredientesIds.getLong(j);

                    if (id == ingredienteRepository.devolverListaIngredientes().get((int) id - 1).getCodigoIngrediente()) {

                        ingredientes.add(ingredienteRepository.devolverListaIngredientes().get((int) id - 1));
                    }
                }

                plato.setIngredientes(ingredientes);

                platos.add(plato);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return platos;
    }
}