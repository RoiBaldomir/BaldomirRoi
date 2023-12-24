package com.hackaboss.ejercicio1clase5.service;

import com.hackaboss.ejercicio1clase5.dto.CalificacionDTO;
import com.hackaboss.ejercicio1clase5.model.Calificacion;

import java.util.*;

public class CalificacionService implements ICalificacionService {

    private EstudianteService serv = new EstudianteService();

    List<Calificacion> calificaciones = Arrays.asList(
            new Calificacion(1, 7.0, 5.0, 6.0, 6.0, serv.devolverEstudiantes().get(0)),
            new Calificacion(2, 4.0, 5.0, 6.0, 5.0, serv.devolverEstudiantes().get(1)),
            new Calificacion(3, 9.0, 8.0, 7.0, 8.0, serv.devolverEstudiantes().get(2)),
            new Calificacion(4, 3.0, 2.0, 1.0, 2.0, serv.devolverEstudiantes().get(3)));

    @Override
    public CalificacionDTO devolverCalificaciones(int numMatricula) {

        Calificacion calificacionesEstudiante = calificaciones.stream()
                .filter(calificacion -> calificacion.getEstudiante().getNumMatricula() == numMatricula)
                .findFirst()
                .orElse(null);

        CalificacionDTO dto = new CalificacionDTO();

        if (calificacionesEstudiante != null) {
            dto.setNombreEstudiante(calificacionesEstudiante.getEstudiante().getNombre());
            dto.setCalificacion1(calificacionesEstudiante.getCalificacion1());
            dto.setCalificacion2(calificacionesEstudiante.getCalificacion2());
            dto.setCalificacion3(calificacionesEstudiante.getCalificacion3());
            dto.setPromedio(calificacionesEstudiante.getPromedio());
        }

        return dto;
    }

    @Override
    public List<CalificacionDTO> devolverCalificacionesDesc() {

        List<CalificacionDTO> listaDTO = new ArrayList<>();

        calificaciones.forEach(calificacion -> {

            CalificacionDTO dto = new CalificacionDTO();

            dto.setNombreEstudiante(calificacion.getEstudiante().getNombre());
            dto.setCalificacion1(calificacion.getCalificacion1());
            dto.setCalificacion2(calificacion.getCalificacion2());
            dto.setCalificacion3(calificacion.getCalificacion3());
            dto.setPromedio(calificacion.getPromedio());

            listaDTO.add(dto);
        });

        listaDTO.sort(Comparator.comparingDouble(CalificacionDTO::getPromedio).reversed());

        return listaDTO;
    }
}
