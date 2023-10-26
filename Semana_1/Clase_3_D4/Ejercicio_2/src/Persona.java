public class Persona {
    // Atributos de la clase
    private int id;
    private String nombre;
    private int edad;
    private String dirección;
    private int numTelefono;

    // Constructores de la clase
    public Persona() {
    }

    public Persona(int id, String nombre, int edad, String dirección, int numTelefono) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.dirección = dirección;
        this.numTelefono = numTelefono;
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

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public int getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(int numTelefono) {
        this.numTelefono = numTelefono;
    }
}
