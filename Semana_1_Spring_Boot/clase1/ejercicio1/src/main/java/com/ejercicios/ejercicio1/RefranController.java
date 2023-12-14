package com.ejercicios.ejercicio1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class RefranController {

    @GetMapping
    public String devolverRefran() {
        
        // Lista de refranes
        List<String> refranes = Arrays.asList(
                "Más vale estar solo que mal acompañado.",
                "Perro ladrador poco mordedor.",
                "A caballo regalado no le mires el dentado.",
                "A lo hecho, pecho.",
                "Al mal tiempo, buena cara.",
                "Cada loco con su tema.",
                "De tal palo, tal astilla.",
                "El que la hace, la paga.",
                "Cada oveja con su pareja.",
                "Tira la piedra y esconde la mano.",
                "Quien mucho abarca, poco aprieta.");

        // Se genera el índice aleatorio
        int numeroAleatorio = (int) (Math.random() * 11);

        return refranes.get(numeroAleatorio);
    }
}
