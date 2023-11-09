public class Trabajador extends Thread {
    // Atributos
    private String nombre;
    private int productosEnsamblados;
    private int productosConControlDeCalidad;
    private int productosEmbalados;

    // Constructores
    public Trabajador() {
    }

    public Trabajador(String nombre) {
        this.nombre = nombre;
    }

    // Método sobrescrito de la clase Thread para ejecutar el hilo
    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            estacionTrabajo1();
            estacionTrabajo2();
            estacionTrabajo3();
        }
    }

    // Se sincronizan los métodos para que los resultados de los contadores se devuelvan correctamente
    public synchronized void estacionTrabajo1() {
        System.out.println(nombre+" está ensamblando productos en la estación de trabajo 1.");
        productosEnsamblados++;
    }

    public synchronized void estacionTrabajo2() {
        System.out.println(nombre+" está realizando controles de calidad en la estación de trabajo 2.");
        productosConControlDeCalidad++;
    }
    public synchronized void estacionTrabajo3() {
        System.out.println(nombre+" está embalando productos en la estación de trabajo 3.");
        productosEmbalados++;
    }

    public String getNombre() {
        return nombre;
    }

    public int getProductosEnsamblados() {
        return productosEnsamblados;
    }

    public int getProductosConControlDeCalidad() {
        return productosConControlDeCalidad;
    }

    public int getProductosEmbalados() {
        return productosEmbalados;
    }
}
