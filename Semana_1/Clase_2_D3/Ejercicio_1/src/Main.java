import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Definición de variables2
        int edad;

        // Inicialización del scanner
        Scanner scanner = new Scanner(System.in);

        // Solicitud de la edad por pantalla al usuario
        System.out.println("Ingrese su edad: ");
        edad = scanner.nextInt();

        if (edad >= 18) {
            // Si cumple la condición se le mostrará por pantalla al usuario que podrá entrar
            System.out.println("Puede entrar al recital.");
        } else {
            // En el caso de que no, se le mostrará que no puede
            System.out.println("Lo siento, no tiene la edad suficiente para acceder al recital.");
        }
    }
}