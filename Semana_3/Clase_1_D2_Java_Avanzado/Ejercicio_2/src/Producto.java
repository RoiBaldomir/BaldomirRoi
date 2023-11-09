public class Producto {
    // Atributos
    private String nombre;
    private double precio;
    private int cantidad;

    public Producto() {
    }

    // Constructores
    public Producto(String nombre, double precio, int cantidad) throws ProductoException {
        // Excepción si la cantidad es inferior a 1
        if (cantidad < 1) {
            throw new ProductoException("La cantidad no puede ser inferior a 1.");
        }
        // Excepción si el precio es inferior a 1
        if(precio < 1) {
            throw new ProductoException("El precio no puede ser inferior a 1.");
        }
        // Excepción si el nombre del producto queda vacío
        if (nombre.isEmpty()){
            throw new ProductoException("El nombre del producto no puede quedar vacío.");
        }
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    // Método toString()
    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", cantidad=" + cantidad;
    }
}
