import java.util.ArrayList;
import java.util.List;

public class Tarea {
    String nombre;
    List<Tarea> subtareas;

    public Tarea() {
    }

    public Tarea(String nombre) {
        this.nombre = nombre;
        this.subtareas = new ArrayList<>();
    }

    // Método para agregar subtareas
    public void agregarSubtarea(Tarea subtarea) {
        subtareas.add(subtarea);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Tarea> getSubtareas() {
        return subtareas;
    }

    public void setSubtareas(List<Tarea> subtareas) {
        this.subtareas = subtareas;
    }
}