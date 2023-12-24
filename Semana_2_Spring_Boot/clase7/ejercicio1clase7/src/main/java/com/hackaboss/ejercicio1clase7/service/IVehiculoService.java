package com.hackaboss.ejercicio1clase7.service;

import com.hackaboss.ejercicio1clase7.model.Vehiculo;

import java.util.List;

public interface IVehiculoService {

    public String agregarVehiculo(Vehiculo vehiculo);

    public List<Vehiculo> devolverVehiculos();

    public List<Vehiculo> devolverVehiculosPrecioMenorAMayor();

    public Vehiculo devolverVehiculo(long id);
}
