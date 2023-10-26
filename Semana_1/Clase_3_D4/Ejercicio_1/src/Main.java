public class Main {
    public static void main(String[] args) {
        // Objetos creados con parámetros
        Electrodomestico electrodomestico1 = new Electrodomestico(1, "Fagor", "E200", 100, "Gris" );
        Electrodomestico electrodomestico2 = new Electrodomestico(2, "Teka", "T500", 300, "Azul" );
        Electrodomestico electrodomestico3 = new Electrodomestico(3, "Samsung", "S800", 200, "Blanco" );
        // Objetos creados sin parámetros
        Electrodomestico electrodomestico4 = new Electrodomestico();

        // Muestra por pantalla de la marca, modelo y consumo de los electrodomésticos con parámetros
        System.out.println("Marca: "+electrodomestico1.getMarca()+" | Modelo: "+electrodomestico1.getModelo()+" | Consumo: "+electrodomestico1.getConsumo()+" W");
        System.out.println("Marca: "+electrodomestico2.getMarca()+" | Modelo: "+electrodomestico2.getModelo()+" | Consumo: "+electrodomestico2.getConsumo()+" W");
        System.out.println("Marca: "+electrodomestico3.getMarca()+" | Modelo: "+electrodomestico3.getModelo()+" | Consumo: "+electrodomestico3.getConsumo()+" W");

        // Al intentar acceder a la marca del electrodoméstico sin parámetros el valor que se obtiene es el
        // nombre de la Clase junto al espacio de memoria correspondiente a la instancia de esta.
        System.out.println("Marca: "+electrodomestico4);
    }
}