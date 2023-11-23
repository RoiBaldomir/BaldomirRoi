/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bootcamp.ejerciciointegrador.persistencia;

import com.bootcamp.ejerciciointegrador.logica.Equipo;
import com.bootcamp.ejerciciointegrador.logica.Partido;
import com.bootcamp.ejerciciointegrador.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author roibaldomir
 */
public class ControladoraPersistencia {
    
    EquipoJpaController equipoJPA = new EquipoJpaController();
    PartidoJpaController partidoJPA = new PartidoJpaController();
    
    public void crearEquipo (Equipo equipo) {
        equipoJPA.create(equipo);
    }
    
    public void eliminarEquipo (Long id) {
        try {
            equipoJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Equipo> traerEquipo () {
        return equipoJPA.findEquipoEntities();
    }
    
    public void editarEquipo (Equipo equipo) {
        try {
            equipoJPA.edit(equipo);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Equipo ObtenerEquipo(Long id) {
        return equipoJPA.findEquipo(id);
    } 


    public void crearPartido(Partido partido) {
        partidoJPA.create(partido);
    }
    
    public void eliminarPartido(Long id) {
        try {
            partidoJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Partido> traerPartidos() {
        return partidoJPA.findPartidoEntities();
    }
    
    public void editarPartido(Partido partido) {
        try {
            partidoJPA.edit(partido);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    

}
