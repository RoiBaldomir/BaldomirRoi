/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bootcamp.ejerciciointegrador.logica;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author roibaldomir
 */
@Entity
public class Partido implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Date fecha;
    
    @ManyToOne
    @JoinColumn(name = "EQUIPOLOCAL")
    private Equipo equipo1;
    
    @ManyToOne
    @JoinColumn(name = "EQUIPOVISITANTE")
    private Equipo equipo2;
    
    private int resultadoLocal;
    private int resultadoVisitante;

    public Partido() {
    }

    public Partido(long id, Date fecha, Equipo equipo1, Equipo equipo2, int resultadoLocal, int resultadoVisitante) {
        this.id = id;
        this.fecha = fecha;
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.resultadoLocal = resultadoLocal;
        this.resultadoVisitante = resultadoVisitante;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Equipo getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(Equipo equipo1) {
        this.equipo1 = equipo1;
    }

    public Equipo getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(Equipo equipo2) {
        this.equipo2 = equipo2;
    }

    public int getResultadoLocal() {
        return resultadoLocal;
    }

    public void setResultadoLocal(int resultadoLocal) {
        this.resultadoLocal = resultadoLocal;
    }

    public int getResultadoVisitante() {
        return resultadoVisitante;
    }

    public void setResultadoVisitante(int resultadoVisitante) {
        this.resultadoVisitante = resultadoVisitante;
    }
    
     public String getFechaFormateada(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        return sdf.format(fecha);
    }

    
}
