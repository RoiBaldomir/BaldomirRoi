package com.bootcamp.ejerciciointegrador.logica;

import com.bootcamp.ejerciciointegrador.logica.Equipo;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-11-23T03:43:10")
@StaticMetamodel(Partido.class)
public class Partido_ { 

    public static volatile SingularAttribute<Partido, Date> fecha;
    public static volatile SingularAttribute<Partido, Integer> resultadoVisitante;
    public static volatile SingularAttribute<Partido, Equipo> equipo2;
    public static volatile SingularAttribute<Partido, Integer> resultadoLocal;
    public static volatile SingularAttribute<Partido, Equipo> equipo1;
    public static volatile SingularAttribute<Partido, Long> id;

}