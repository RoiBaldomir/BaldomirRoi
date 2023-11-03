package org.example.logica;

import org.example.persistencia.ControladoraPersistencia;

import java.util.List;

public class Controladora {
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void crearPlatillo(Platillo platillo) {
        controlPersis.crearPlatillo(platillo);
    }

    public void eliminarPlatillo (int id) {
        controlPersis.eliminarPlatillo (id);
    }

    public void editarPlatillo (Platillo platillo) {
        controlPersis.editarEstudiante(platillo);
    }

    public List<Platillo> traerPlatillos () {
        return controlPersis.traerPlatillos();
    }

}
