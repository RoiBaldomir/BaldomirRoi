public class Main {
    public static void main(String[] args) {
        // Instancia de cada uno de los agentes
        Agente agente1 = new Agente("Pablo");
        Agente agente2 = new Agente("Javier");
        Agente agente3 = new Agente("Laura");
        Agente agente4 = new Agente("Lucía");

        // Se ejecuta cada agente en un hilo diferente con start()
            agente1.start();
            agente2.start();
            agente3.start();
            agente4.start();
    }
}