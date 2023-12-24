package com.hackaboss.ejercicio1clase5.service;

import com.hackaboss.ejercicio1clase5.dto.CalificacionDTO;
import com.hackaboss.ejercicio1clase5.model.Calificacion;

import java.util.List;

public interface ICalificacionService {

    public CalificacionDTO devolverCalificaciones(int numMatricula);

    public List<CalificacionDTO> devolverCalificacionesDesc();
}
