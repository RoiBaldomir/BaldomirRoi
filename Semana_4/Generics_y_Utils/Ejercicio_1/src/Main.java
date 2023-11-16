public class Main {
    public static void main(String[] args) {
        InventarioAuto<Auto> inventario = new InventarioAuto<>();

        Auto auto1 = new Auto("Ford", "Escort", 1993, 18000);
        Auto auto2 = new Auto("Kia", "Río", 2005, 15000);
        Auto auto3 = new Auto("Ford", "Ka", 1990, 10000);
        Auto auto4 = new Auto("Renault", "7", 1980, 8000);
        Auto auto5 = new Auto("Ferrari", "Testarossa", 2005, 100000);

        System.out.println("Agregando autos al inventario...");

        inventario.agregarAutos(auto1);
        inventario.agregarAutos(auto2);
        inventario.agregarAutos(auto3);
        inventario.agregarAutos(auto4);
        inventario.agregarAutos(auto5);

        System.out.println("\n---- Búsqueda por marca ----\n");

        inventario.buscarPorMarca("ford");

        System.out.println("\n---- Búsqueda por año ----\n");

        inventario.buscarPorAnyo(2005);

        System.out.println("\nEl valor total del inventario es -> "+inventario.calcularTotalInventario());

    }
}