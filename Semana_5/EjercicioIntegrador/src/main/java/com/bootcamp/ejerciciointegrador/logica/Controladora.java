/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bootcamp.ejerciciointegrador.logica;

import com.bootcamp.ejerciciointegrador.persistencia.ControladoraPersistencia;
import java.util.List;

/**
 *
 * @author roibaldomir
 */
public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void crearEquipo (Equipo equipo) {
        controlPersis.crearEquipo(equipo);
    }    
    
    public void eliminarEquipo (Long id) {
        controlPersis.eliminarEquipo(id);
    }
    
    public List<Equipo> traerEquipo() {
       return controlPersis.traerEquipo();
    }
    
    public void editarEquipo (Equipo equipo) {
        controlPersis.editarEquipo(equipo);
    }
    
    public void crearPartido(Partido partido, Long idEquipo1, Long idEquipo2) {
        Equipo equipo1 = controlPersis.ObtenerEquipo(idEquipo1);
        Equipo equipo2 = controlPersis.ObtenerEquipo(idEquipo2);
        
        partido.setEquipo1(equipo1);
        partido.setEquipo2(equipo2);
        
        controlPersis.crearPartido(partido);
    }    
    
    public void eliminarPartido(Long id) {
        controlPersis.eliminarPartido(id);
    }
    
    public List<Partido> traerPartidos() {
        return controlPersis.traerPartidos();
    }
    
    public void editarPartido(Partido partido) {
        controlPersis.editarPartido(partido);
    }  


}
