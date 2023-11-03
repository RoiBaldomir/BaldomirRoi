public class Camiseta extends Vestimenta {
    // Atributos de la clase
    private String manga;
    private String cuello;

    // Constructores de la clase
    public Camiseta() {
    }

    public Camiseta(int codigo, String nombre, double precio, String marca, int talla, String color, String manga, String cuello) {
        super(codigo, nombre, precio, marca, talla, color);
        this.manga = manga;
        this.cuello = cuello;
    }

    // Getters y Setters
    public String getManga() {
        return manga;
    }

    public void setManga(String manga) {
        this.manga = manga;
    }

    public String getCuello() {
        return cuello;
    }

    public void setCuello(String cuello) {
        this.cuello = cuello;
    }

    // Método para mostrar el mensaje
    public void mensaje() {
        System.out.println("Esta camiseta es de marca: "+getMarca());
    }
}
