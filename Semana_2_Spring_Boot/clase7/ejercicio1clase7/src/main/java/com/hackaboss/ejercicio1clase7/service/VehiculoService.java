package com.hackaboss.ejercicio1clase7.service;

import com.hackaboss.ejercicio1clase7.model.Vehiculo;
import com.hackaboss.ejercicio1clase7.repository.IVehiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class VehiculoService implements IVehiculoService {

    @Autowired
    private IVehiculoRepository repository;

    @Override
    public String agregarVehiculo(Vehiculo vehiculo) {

        return repository.agregarVehiculo(vehiculo);
    }

    @Override
    public List<Vehiculo> devolverVehiculos() {

        return repository.devolverVehiculos();
    }

    @Override
    public List<Vehiculo> devolverVehiculosPrecioMenorAMayor() {

        repository.devolverVehiculos().sort(Comparator.comparingInt(Vehiculo::getPrecio));

        return repository.devolverVehiculos();
    }

    @Override
    public Vehiculo devolverVehiculo(long id) {

        return repository.devolverVehiculos().stream()
                .filter(vehiculo -> vehiculo.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
