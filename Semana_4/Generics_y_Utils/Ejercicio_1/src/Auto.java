public class Auto {
    // Atributos
    private String marca;
    private String modelo;
    private int anyo;
    private double precio;

    // Constructores
    public Auto() {
    }

    public Auto(String marca, String modelo, int anyo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anyo = anyo;
        this.precio = precio;
    }

    // Getters y Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Marca='" + marca + '\'' +
                ", Modelo='" + modelo + '\'' +
                ", Año=" + anyo +
                ", Precio=" + precio;
    }
}
