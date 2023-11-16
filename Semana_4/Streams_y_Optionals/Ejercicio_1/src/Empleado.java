public class Empleado {
    // Atributos
    private String nombre; // nombre del empleado
    private double salario; // salario del empleado
    private String categoria; // categoría del empleado

    // Constructores
    public Empleado() {
    }

    public Empleado(String nombre, double salario, String categoria) {
        this.nombre = nombre;
        this.salario = salario;
        this.categoria = categoria;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    // Método toString()
    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                ", salario=" + salario +
                ", categoria='" + categoria + '\'';
    }
}
