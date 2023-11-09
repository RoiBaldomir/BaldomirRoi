public class Main {
    public static void main(String[] args) {
        int suma;

        // Instancia de cada uno de los trabajadores
        Trabajador trabajador1 = new Trabajador("Pedro");
        Trabajador trabajador2 = new Trabajador("Luisa");
        Trabajador trabajador3 = new Trabajador("Carmen");

        // Se ejecuta cada trabajador en un hilo diferente con start()
        trabajador1.start();
        trabajador2.start();
        trabajador3.start();

        // Con el método join se hace esperar a que terminen los hilos para ejecutar el hilo principal
        try {
            trabajador1.join();
            trabajador2.join();
            trabajador3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        suma = trabajador1.getProductosEnsamblados() + trabajador2.getProductosEnsamblados() + trabajador3.getProductosEnsamblados();
        System.out.println("Total productos ensamblados : "+suma);
        suma = trabajador1.getProductosConControlDeCalidad() + trabajador2.getProductosConControlDeCalidad() + trabajador3.getProductosConControlDeCalidad();
        System.out.println("Total productos con control de calidad superado : "+suma);
        suma = trabajador1.getProductosEmbalados() + trabajador2.getProductosEmbalados() + trabajador3.getProductosEmbalados();
        System.out.println("Total productos embalados : "+suma);

    }
}
