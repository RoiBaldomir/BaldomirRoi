package com.hackaboss.ejercicio1clase5.controller;

import com.hackaboss.ejercicio1clase5.model.Estudiante;
import com.hackaboss.ejercicio1clase5.service.EstudianteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {

    EstudianteService serv = new EstudianteService();

    @GetMapping
    public List<Estudiante> devolverEstudiantes() {

        return serv.devolverEstudiantes();
    }
}
