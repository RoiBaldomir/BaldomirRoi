public class Producto {
    // Atributos de la clase
    private int codigo;
    private String nombre;
    private String marca;
    private String tipo;
    private double precioCosto;
    private double precioVenta;
    private int stock;

    // Constructores de la clase
    public Producto() {
    }

    public Producto(int codigo, String nombre, String marca, String tipo, double precioCosto, double precioVenta, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.tipo = tipo;
        this.precioCosto = precioCosto;
        this.precioVenta = precioVenta;
        this.stock = stock;
    }

    // Setters y Getters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(double precioCosto) {
        this.precioCosto = precioCosto;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    // Método toString()
    @Override
    public String toString() {
        return "Código = " + codigo +
                ", Nombre = " + nombre +
                ", Marca = " + marca +
                ", Tipo = " + tipo +
                ", Precio Costo = " + precioCosto +
                ", PrecioVenta = " + precioVenta +
                ", Stock = " + stock;
    }
}
