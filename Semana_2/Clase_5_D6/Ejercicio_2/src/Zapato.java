public class Zapato extends Vestimenta {
    // Atributos de la clase
    private String material;
    private String tipoCierre;

    // Constructores de la clase
    public Zapato() {
    }

    public Zapato(int codigo, String nombre, double precio, String marca, int talla, String color, String material, String tipoCierre) {
        super(codigo, nombre, precio, marca, talla, color);
        this.material = material;
        this.tipoCierre = tipoCierre;
    }

    // Getters y Setters
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTipoCierre() {
        return tipoCierre;
    }

    public void setTipoCierre(String tipoCierre) {
        this.tipoCierre = tipoCierre;
    }

    // Método para mostrar el mensaje
    public void mensaje() {
        System.out.println("Estos zapatos son de marca: "+getMarca());
    }
}
