import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Definición e inicialización de variables
        double[] temperaturas = new double[7];
        double temperatura;
        double total = 0;
        double promedio;

        // Inicialización del scanner con el Locale en US para permitir los puntos
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        for (int i = 0; i < temperaturas.length; i++) {
            // Solicitud por pantalla al usuario de que ingrese las temperaturas
            System.out.println("Ingrese las temperaturas máximas de esta semana: ");
            temperatura = scanner.nextDouble();
            // En cada iteración del bucle se van almacenando las temperaturas en el array
            temperaturas[i] = temperatura;
        }

        for (int i = 0; i < temperaturas.length; i++) {
            // Se muestran por pantalla las temperaturas
            System.out.println(temperaturas[i]);
            // Se calcula el total de las temperaturas
            total+=temperaturas[i];
        }

        // Calculo del promedio de temperaturas
        promedio = total / temperaturas.length;

        // Se muestra por pantalla el resultado
        System.out.println("\nEl promedio de temperaturas máximas de esta semana es: "+Math.round(promedio * 100.0) / 100.0+"º");
    }
}