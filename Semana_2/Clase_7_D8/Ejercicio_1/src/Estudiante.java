public class Estudiante {
    // Atributos de la clase
    private int id;
    private String nombre;
    private int edad;
    private int calificacion;

    // Constructores de la clase
    public Estudiante() {
    }

    public Estudiante(int id, String nombre, int edad, int calificacion) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.calificacion = calificacion;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
}
