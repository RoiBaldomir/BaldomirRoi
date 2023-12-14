package com.ejercicios.ejercicio2y3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class TraductorController {

    @GetMapping("/traducir")
    public String traducirAMorse(@RequestParam String texto) {

        StringBuilder resultadoMorse = new StringBuilder();

        HashMap<String, String> equivalenciasMorse = obtenerEquivalenciasMorse();

        for (int i = 0; i < texto.length(); i++) {
            // Se divide la palabra en carácteres y se convierten a mayúscula
            String caracterPalabra = String.valueOf(texto.charAt(i)).toUpperCase();
            // Se van convirtiendo los carácteres
            String convertir = equivalenciasMorse.getOrDefault(caracterPalabra, "");

            // Se añaden al StringBuilder creado anteriormente
            resultadoMorse.append(convertir).append(" ");
        }

        if (resultadoMorse.isEmpty()) {
            // Se devuelve un error si el resultado está vacío
            return "Error. El texto se encuentra vacío.";
        }

        // Se devuelve el resultado en morse
        return resultadoMorse.toString();
    }

    public HashMap<String, String> obtenerEquivalenciasMorse() {

        // Almacenamiento de las equivalencias entre morse y alfabeto
        HashMap<String, String> equivalenciasMorse = new HashMap<>();

        equivalenciasMorse.put("A", ".-");
        equivalenciasMorse.put("B", "-...");
        equivalenciasMorse.put("C", "-.-.");
        equivalenciasMorse.put("D", "-..");
        equivalenciasMorse.put("E", ".");
        equivalenciasMorse.put("F", "..-.");
        equivalenciasMorse.put("G", "--.");
        equivalenciasMorse.put("H", "....");
        equivalenciasMorse.put("I", "..");
        equivalenciasMorse.put("J", ".---");
        equivalenciasMorse.put("K", "-.-");
        equivalenciasMorse.put("L", ".-..");
        equivalenciasMorse.put("M", "--");
        equivalenciasMorse.put("N", "-.");
        equivalenciasMorse.put("Ñ", "--.--");
        equivalenciasMorse.put("O", "---");
        equivalenciasMorse.put("P", ".--.");
        equivalenciasMorse.put("Q", "--.-");
        equivalenciasMorse.put("R", ".-.");
        equivalenciasMorse.put("S", "...");
        equivalenciasMorse.put("T", "-");
        equivalenciasMorse.put("U", "..-");
        equivalenciasMorse.put("V", "...-");
        equivalenciasMorse.put("W", ".--");
        equivalenciasMorse.put("X", "-..-");
        equivalenciasMorse.put("Y", "-.--");
        equivalenciasMorse.put("Z", "--..");
        equivalenciasMorse.put("0", "-----");
        equivalenciasMorse.put("1", ".----");
        equivalenciasMorse.put("2", "..---");
        equivalenciasMorse.put("3", "...--");
        equivalenciasMorse.put("4", "....-");
        equivalenciasMorse.put("5", ".....");
        equivalenciasMorse.put("6", "-....");
        equivalenciasMorse.put("7", "--...");
        equivalenciasMorse.put("8", "---..");
        equivalenciasMorse.put("9", "----.");
        equivalenciasMorse.put(" ", "   ");

        return equivalenciasMorse;
    }
}
