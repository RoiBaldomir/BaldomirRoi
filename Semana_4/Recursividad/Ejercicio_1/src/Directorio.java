import java.util.ArrayList;
import java.util.List;

class Directorio {
    String nombre;
    List<Directorio> subdirectorios;
    List<String> archivos;

    public Directorio() {
    }

    public Directorio(String nombre) {
        this.nombre = nombre;
        this.subdirectorios = new ArrayList<>();
        this.archivos = new ArrayList<>();
    }

    // Método para agregar subdirectorios
    public void agregarSubdirectorios(Directorio directorio, List<Directorio> subdirectorios) {
        directorio.setSubdirectorios(subdirectorios);
    }

    // Método para agregar archivos
    public void agregarArchivos(Directorio directorio, List<String> archivos , int carpeta) {
        directorio.getSubdirectorios().get(carpeta - 1).setArchivos(archivos);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Directorio> getSubdirectorios() {
        return subdirectorios;
    }

    public void setSubdirectorios(List<Directorio> subdirectorios) {
        this.subdirectorios = subdirectorios;
    }

    public List<String> getArchivos() {
        return archivos;
    }

    public void setArchivos(List<String> archivos) {
        this.archivos = archivos;
    }

    @Override
    public String toString() {
        return "Nombre='" + nombre + '\'' +
                ", Subdirectorios=" + subdirectorios +
                ", Archivos=" + archivos;
    }
}