import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Tarea proyecto = new Tarea("Proyecto 1");
        ExploradorTareas explorador = new ExploradorTareas();
        List<Tarea> listaTareas = new ArrayList<>(); // Lista para almacenar las tareas creadas
        String nombreTarea;
        Tarea tareaAIngresar;
        int op;

        System.out.println("\n---- Bienvenido al sistema de ingreso de tareas ----\n");

        do {
            System.out.println("Introducir nombre de la tarea a ingresar: "); // Se solicita al usuario la creación de la tarea
            nombreTarea = scanner.next();

            System.out.println("Creando tarea...");

            tareaAIngresar = new Tarea(nombreTarea); // Se crea la tarea

            listaTareas.add(tareaAIngresar); // Se añade la tarea a la lista

            System.out.println("\n¿Te gustaría añadir una nueva tarea? 1. Sí 0. No\n");
            op = scanner.nextInt();
        }while (op == 1);

        System.out.println("Añadiendo tareas...");

        proyecto.agregarSubtareas(proyecto, listaTareas); // Se añade la lista a la lista de subtareas

        System.out.println("\n---- Explorador -----\n");

        explorador.explorarTareas(proyecto); // Se muestra la estructura de tareas por pantalla
    }
}