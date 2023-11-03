public class Sombrero extends Vestimenta {
    // Atributos de la clase
    private String tipo;
    private double tamaño;

    // Constructores de la clase
    public Sombrero() {
    }

    public Sombrero(int codigo, String nombre, double precio, String marca, int talla, String color, String tipo, double tamaño) {
        super(codigo, nombre, precio, marca, talla, color);
        this.tipo = tipo;
        this.tamaño = tamaño;
    }

    // Getters y Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    // Método para mostrar el mensaje
    public void mensaje() {
        System.out.println("Este sombrero es de marca: "+getMarca());
    }
}
