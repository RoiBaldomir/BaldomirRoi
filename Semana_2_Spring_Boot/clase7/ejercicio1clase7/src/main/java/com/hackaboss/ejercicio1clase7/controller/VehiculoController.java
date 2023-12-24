package com.hackaboss.ejercicio1clase7.controller;

import com.hackaboss.ejercicio1clase7.model.Vehiculo;
import com.hackaboss.ejercicio1clase7.service.IVehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/vehiculos")
public class VehiculoController {

    @Autowired
    private IVehiculoService service;

    @PostMapping
    public String agregarVehiculo(@RequestBody Vehiculo vehiculo) {

        return service.agregarVehiculo(vehiculo);
    }

    @GetMapping
    public List<Vehiculo> devolverVehiculos() {

        return service.devolverVehiculos();
    }

    @GetMapping("/precios")
    public List<Vehiculo> devolverVehiculosPrecioMenorAMayor() {

        return service.devolverVehiculosPrecioMenorAMayor();
    }

    @GetMapping("/{id}")
    public Vehiculo devolverVehiculo(@PathVariable long id) {

        return service.devolverVehiculo(id);
    }
}
