public class Main {
    public static void main(String[] args) {
        Tarea proyecto = new Tarea("Proyecto 1");
        ExploradorTareas explorador = new ExploradorTareas();

       agregarTarea(proyecto, 0);

        System.out.println("\n---- Explorador -----\n");

        explorador.explorarTareas(proyecto); // Se muestra la estructura de tareas por pantalla
    }

    public static void agregarTarea(Tarea tarea, int nivel) {
        if (nivel > 2) {
            return;
        }

        for (int i = 1; i <= 2; i++) {
            Tarea tareaNueva = new Tarea("Tarea " + nivel + "." + i);
            tarea.agregarSubtarea(tareaNueva);
            agregarTarea(tareaNueva, nivel + 1);
        }
    }
}