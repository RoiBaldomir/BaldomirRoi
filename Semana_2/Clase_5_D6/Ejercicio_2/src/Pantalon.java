public class Pantalon extends Vestimenta {
    // Atributos de la clase
    private String estilo;
    private String tipoTejido;

    // Constructores de la clase
    public Pantalon() {
    }

    public Pantalon(int codigo, String nombre, double precio, String marca, int talla, String color, String estilo, String tipoTejido) {
        super(codigo, nombre, precio, marca, talla, color);
        this.estilo = estilo;
        this.tipoTejido = tipoTejido;
    }

    // Getters y Setters
    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getTipoTejido() {
        return tipoTejido;
    }

    public void setTipoTejido(String tipoTejido) {
        this.tipoTejido = tipoTejido;
    }

    // Método para mostrar el mensaje
    public void mensaje() {
        System.out.println("Estos pantalones son de marca: "+getMarca());
    }
}
