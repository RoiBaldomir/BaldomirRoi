public class Reptil extends Animal{
    // Atributos de la clase
    private double longitud;
    private String tipoEscamas;
    private String tipoVeneno;
    private String habitat;

    // Constructores de la clase
    public Reptil() {
    }

    public Reptil(int id, String nombre, int edad, String tipoPiel, String tipoAlimentacion, double longitud, String tipoEscamas, String tipoVeneno, String habitat) {
        super(id, nombre, edad, tipoPiel, tipoAlimentacion);
        this.longitud = longitud;
        this.tipoEscamas = tipoEscamas;
        this.tipoVeneno = tipoVeneno;
        this.habitat = habitat;
    }

    // Getters y Setters
    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public String getTipoEscamas() {
        return tipoEscamas;
    }

    public void setTipoEscamas(String tipoEscamas) {
        this.tipoEscamas = tipoEscamas;
    }

    public String getTipoVeneno() {
        return tipoVeneno;
    }

    public void setTipoVeneno(String tipoVeneno) {
        this.tipoVeneno = tipoVeneno;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    // Método para saludar
    @Override
    public void saludar() {
        System.out.println("Hola, soy un réptil");
    }
}

