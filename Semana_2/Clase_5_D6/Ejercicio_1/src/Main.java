public class Main {
    public static void main(String[] args) {
        // c) Creación de los objetos y llamada a los métodos saludar.
        Mamifero mamifero = new Mamifero(1, "Elefante", 20, "Dura", "Herbívoro", 4, "Sexual", "Gris", "Sabana");
        Ave ave = new Ave(2, "Pingüino", 10, "Plumaje", "Carnívoro", 15, "No", "Negro y blanco", "Normal");
        Reptil reptil = new Reptil(3, "Salamandra", 5, "Viscosa", "Omnívoro", 21.5, "Lisas", "No", "Ciénaga");

        mamifero.saludar();
        ave.saludar();
        reptil.saludar();

        // d) Es posible crear un objeto Animal y asignarle un mamífero gracias a la propiedad de herencia de las clases.
        Animal mamifero2 = new Mamifero(2, "Jirafa", 25, "Pelaje", "Herbívoro", 4, "Sexual", "Amarillo y negro", "Sabana");

        // e) No es posible acceder a un método con la propiedad private desde el main, ya que la propiedad private no permite el acceso al método desde fuera de la clase en la que se encuentra.
    }
}