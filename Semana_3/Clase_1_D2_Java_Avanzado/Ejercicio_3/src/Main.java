import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nombres = new String[5];
        int opcion, indice;
        String nombre;

        System.out.println("\n---- Bienvenido al sistema de almacenamiento de datos ----\n");

        try{
            do {
                System.out.println("Ingrese el índice: ");
                indice = scanner.nextInt();
                System.out.println("Ingrese el nombre: ");
                nombre = scanner.next();

                nombres[indice] = nombre;

                System.out.println("Nombre ingresado correctamente.");
                System.out.println("¿Desea ingresar otro valor? Pulse 1 para sí, 0 para no");
                opcion = scanner.nextInt();
            }while (opcion == 1);
        // Captura de la excepción fuera de los límites del vector
        }catch (ArrayIndexOutOfBoundsException aioobe) {
            System.out.println("Error: "+aioobe.getMessage()+". El valor del índice seleccionado es inválido.");
        }

        try{
            System.out.println("Introduzca un valor de indice para consultar: ");
            indice = scanner.nextInt();
            System.out.println(nombres[indice]);
        // Captura de la excepción fuera de los límites del vector
        }catch (ArrayIndexOutOfBoundsException aioobe) {
            System.out.println("Error: "+aioobe.getMessage()+". El valor del índice seleccionado es inválido.");
        }finally {
            System.out.println("\nFin del programa.");
        }
    }
}