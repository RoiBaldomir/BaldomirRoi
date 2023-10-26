import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Definición de variables
        int num1, num2, suma, resta, multiplicacion, division;

        // Inicialización del scanner
        Scanner scanner = new Scanner(System.in);

        // Solicitud de los números al usuario
        System.out.println("Ingrese el primer número: ");
        num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo número: ");
        num2 = scanner.nextInt();



        // Cálculo de las operaciones númericas a realizar
        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;
        while(num2 == 0) {
            System.out.println("No se puede dividir entre 0. Ingrese otro número: ");
            num2 = scanner.nextInt();
        }
        division = num1 / num2;

        // Salida por pantalla al usuario de los resultados de las operaciones realizadas
        System.out.println("El resultado de la suma es: "+suma);
        System.out.println("El resultado de la resta es: "+resta);
        System.out.println("El resultado de la multiplicación es: "+multiplicacion);
        System.out.println("El resultado de la división es: "+division);

        // Si el segundo número es un 0 en una división el programa terminará con un error aritmético, ya que no se
        // puede dividir entre 0. Una posible solución sería implementar un bucle while para volver a solicitar al
        // usuario el segundo valor si este introduce un 0.
    }
}