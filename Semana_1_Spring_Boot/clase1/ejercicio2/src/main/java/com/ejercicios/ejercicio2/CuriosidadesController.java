package com.ejercicios.ejercicio2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CuriosidadesController {

    @GetMapping
    public String devolverCuriosidad() {

        // Lista de curiosidades
        List<String> curiosidades = Arrays.asList(
                "Las hormigas no duermen.",
                "Los elefantes pueden comunicarse.",
                "Los caballitos de mar machos son los que tienen a las crías.",
                "Los mosquitos tienen 47 dientes.",
                "El caracol pasa un tercio de su vida durmiendo.",
                "El cocodrilo puede comer una vez al año.",
                "Los calamares tienen los ojos más grandes.",
                "La ballena gris es capaz de recorrer 23.150 km cuando realiza su migración anual desde el Ártico hasta México.",
                "Los búhos son capaces de girar su cabeza 360º.",
                "Los gatos no saborean lo dulce.",
                "Los perros tienen un sentido del olfato 1.000 veces más desarrollado y sensible que los humanos.");

        // Se genera el índice aleatorio
        int numeroAleatorio = (int) (Math.random() * 11);

        return curiosidades.get(numeroAleatorio);
    }
}
