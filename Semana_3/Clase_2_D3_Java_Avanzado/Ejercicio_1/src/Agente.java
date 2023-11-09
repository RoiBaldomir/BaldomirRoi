public class Agente extends Thread {
    // Atributos
    private String nombre;

    // Constructores
    public Agente() {
    }

    public Agente(String nombre) {
        this.nombre = nombre;
    }

    // Método sobrescrito de la clase Thread para ejecutar el hilo
    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            System.out.println(nombre+" está recibiendo una llamada...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(nombre+" está resolviendo una consulta...");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(nombre+" está registrando la información de la llamada...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
