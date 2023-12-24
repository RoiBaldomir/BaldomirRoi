package com.hackaboss.ejercicio1clase5.service;

import com.hackaboss.ejercicio1clase5.model.Estudiante;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class EstudianteService implements IEstudianteService {

    private List<Estudiante> estudiantes = Arrays.asList(
            new Estudiante(1, "Roi", "Baldomir", LocalDate.of(2010, 10, 1)),
            new Estudiante(2, "María", "Gómez", LocalDate.of(2009, 2, 7)),
            new Estudiante(3, "Alberto", "Ares", LocalDate.of(2008, 5, 14)),
            new Estudiante(4, "Cristina", "Ramos", LocalDate.of(2007, 7, 21)));

    @Override
    public List<Estudiante> devolverEstudiantes() {

        return estudiantes;
    }
}
