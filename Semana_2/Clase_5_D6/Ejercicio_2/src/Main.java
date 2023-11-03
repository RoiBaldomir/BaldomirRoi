public class Main {
    public static void main(String[] args) {
        // Creación del vector que almacene las vestimentas
        Vestimenta[] vestimentas = new Vestimenta[9];

        // Creación y almacenado de los objetos en el vector
        vestimentas[0] = new Zapato(1, "Mocasín", 30.50, "Geox", 39, "Marrón", "Cuero", "Cordón");
        vestimentas[1] = new Zapato(2, "Sandalia", 10.50, "Geox", 38, "Negra", "Sintético", "Sin cierre");
        vestimentas[2] = new Zapato(3, "Deportiva", 50, "Fila", 40, "Azul", "Sintético", "Cordón");
        vestimentas[3] = new Pantalon(4, "Vaquero", 60, "Levis", 38, "Azul", "Jeans", "Vaquero");
        vestimentas[4] = new Pantalon(5, "Chino", 40, "Zara", 40, "Verde", "Casual", "Lana");
        vestimentas[5] = new Pantalon(6, "Corto", 25.50, "Adidas", 42, "Negro", "Deportivo", "Sintético");
        vestimentas[6] = new Camiseta(7, "Larga", 15.50, "Adidas", 37, "Azul", "Larga", "Redondo");
        vestimentas[7] = new Camiseta(8, "Corta", 18.50, "Nike", 36, "Naranja", "Corta", "En pico");
        vestimentas[8] = new Sombrero(9, "De copa", 45, "DC", 20, "Negro", "De copa", 20);

        // Se recorre el vector mostrando el mensaje correspondiente
        for (Vestimenta vestimenta: vestimentas) {
            vestimenta.mensaje();
        }
    }
}