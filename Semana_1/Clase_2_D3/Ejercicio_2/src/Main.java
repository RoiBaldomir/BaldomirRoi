import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Definición e inicialización de variables
        double precio;
        double total = 0;

        // Inicialización del scanner con el Locale en US para permitir los puntos
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        do {
            // Solicitud por pantalla al usuario para que ingrese los valores de los productos
            System.out.println("Ingrese el valor del producto. 0 para finalizar: ");
            precio = scanner.nextDouble();
            // Acumulación en el total de los precios ingresados
            total+=precio;
        }while (precio !=0); // Cuando el precio ingresado sea 0 no se podrán ingresar más valores

        // Muestra por pantalla del total de la compra
        System.out.println("El total de la compra asciende a "+total+" euros");
    }
}