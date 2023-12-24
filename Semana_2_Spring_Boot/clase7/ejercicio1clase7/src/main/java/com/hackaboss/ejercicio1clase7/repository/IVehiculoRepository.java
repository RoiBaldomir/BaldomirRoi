package com.hackaboss.ejercicio1clase7.repository;

import com.hackaboss.ejercicio1clase7.model.Vehiculo;

import java.util.List;

public interface IVehiculoRepository {

    public List<Vehiculo> devolverVehiculos();

    public String agregarVehiculo(Vehiculo vehiculo);
}
