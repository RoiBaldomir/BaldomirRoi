package com.ejercicios.ejercicio1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConversorController {

    @GetMapping("/conversor/{alturaCentimetros}")
    public String convertirAMetros(@PathVariable int alturaCentimetros) {

        // Se convierte el valor de centímetros a metros
        double alturaMetros = (double) alturaCentimetros / 100;

        return alturaCentimetros+" cm es equivalente a "+ alturaMetros+" m.";
    }
}
