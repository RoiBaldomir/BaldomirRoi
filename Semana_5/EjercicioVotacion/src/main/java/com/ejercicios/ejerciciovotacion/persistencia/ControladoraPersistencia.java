package com.ejercicios.ejerciciovotacion.persistencia;

import com.ejercicios.ejerciciovotacion.logica.Partido;
import com.ejercicios.ejerciciovotacion.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
   
    PartidoJpaController partidoJPA = new PartidoJpaController();
    
    /*PARA PARTIDO*/
    public void crearPartido(Partido partido) {
        partidoJPA.create(partido);
    }
    
    public void eliminarPartido(String nombre) {
        try {
            partidoJPA.destroy(nombre);
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

    public Partido traerPartidoNombre(String nombre) {
        return partidoJPA.findPartidoName(nombre);
    }

}    

