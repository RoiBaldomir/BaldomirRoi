package com.ejercicios.ejercicio1.controllers;

import com.ejercicios.ejercicio1.models.Evento;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EventoController {

    List<Evento> eventos = new ArrayList<>();

    @GetMapping("/eventos")
    public List<Evento> devolverEventos() {

        return eventos;
    }

    @GetMapping("/evento/{id}")
    public Evento devolverEvento(@PathVariable long id) {

        return eventos.stream()
                .filter(evento -> evento.getId() == id)
                .findFirst()
                .orElseThrow();
    }

    @PostMapping("/evento")
    public String crearEvento(@RequestBody Evento nuevoEvento) {

        eventos.add(nuevoEvento);

        return "Evento creado: "+nuevoEvento.getTitulo();
    }
}
