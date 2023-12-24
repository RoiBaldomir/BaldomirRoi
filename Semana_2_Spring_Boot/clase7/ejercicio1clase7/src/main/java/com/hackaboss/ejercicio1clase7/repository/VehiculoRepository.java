package com.hackaboss.ejercicio1clase7.repository;

import com.hackaboss.ejercicio1clase7.model.Vehiculo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class VehiculoRepository implements IVehiculoRepository {

    private List<Vehiculo> vehiculos = new ArrayList<>();
    private long id = 1;

    @Override
    public List<Vehiculo> devolverVehiculos() {

        return vehiculos;
    }

    @Override
    public String agregarVehiculo(Vehiculo vehiculo) {

        vehiculo.setId(id++);

        vehiculos.add(vehiculo);

        return "Vehículo "+vehiculo.getMarca()+" "+vehiculo.getModelo()+" agregado correctamente.";
    }
}
