package com.hackaboss.ejercicio1clase6.repository;

import com.hackaboss.ejercicio1clase6.model.Ingrediente;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.springframework.stereotype.Repository;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

@Repository
public class IngredienteRepository {

    public List<Ingrediente> devolverListaIngredientes() throws FileNotFoundException {

        List<Ingrediente> ingredientes = new ArrayList<>();

        try {

            JSONTokener tokener = new JSONTokener(new FileReader("src/main/java/com/hackaboss/ejercicio1clase6/repository/ingredients.json"));
            JSONArray jsonArray = new JSONArray(tokener);

            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject ingredienteJson = jsonArray.getJSONObject(i);
                Ingrediente ingrediente = new Ingrediente();
                ingrediente.setCodigoIngrediente(ingredienteJson.getLong("id"));
                ingrediente.setNombre(ingredienteJson.getString("name"));
                ingrediente.setCantidadCalorias(ingredienteJson.getInt("calories"));
                ingredientes.add(ingrediente);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ingredientes;
    }
}
