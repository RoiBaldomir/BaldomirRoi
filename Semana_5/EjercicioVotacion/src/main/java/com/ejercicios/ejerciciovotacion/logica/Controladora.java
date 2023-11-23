/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejercicios.ejerciciovotacion.logica;

import com.ejercicios.ejerciciovotacion.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void crearPartido(Partido partido) {
        controlPersis.crearPartido(partido);
    }    
    
    public void eliminarPartido(String nombre) {
        controlPersis.eliminarPartido(nombre);
    }
    
    public List<Partido> traerPartidos() {
        return controlPersis.traerPartidos();
    }
    
    public void editarPartido(Partido partido) {
        controlPersis.editarPartido(partido);
    }
    
    public Partido traerPartidoNombre(String nombre) {
        return controlPersis.traerPartidoNombre(nombre);
    }
}
