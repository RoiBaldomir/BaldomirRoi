package com.hackaboss.ejercicio1clase5.controller;

import com.hackaboss.ejercicio1clase5.dto.CalificacionDTO;
import com.hackaboss.ejercicio1clase5.model.Calificacion;
import com.hackaboss.ejercicio1clase5.service.CalificacionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/calificaciones")
public class CalificacionController {

    CalificacionService serv = new CalificacionService();

    @GetMapping("/{numMatricula}")
    public CalificacionDTO devolverCalificaciones(@PathVariable int numMatricula) {

        return serv.devolverCalificaciones(numMatricula);
    }

    @GetMapping("/ordendesc")
    public List<CalificacionDTO> devolverCalificacionesDesc() {

        return serv.devolverCalificacionesDesc();
    }
}
