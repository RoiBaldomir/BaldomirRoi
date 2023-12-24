package com.hackaboss.ejercicio1clase6.controller;

import com.hackaboss.ejercicio1clase6.dto.IngredienteDTO;
import com.hackaboss.ejercicio1clase6.service.IPlatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;
import java.util.List;

@RestController
public class PlatoController {

    @Autowired
    IPlatoService service;

    @GetMapping("/plato")
    public IngredienteDTO devolverCaloriasPlato(@RequestParam String nombre) throws FileNotFoundException {

        return service.devolverCaloriasPlato(nombre);
    }
}
