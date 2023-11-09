import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner para la introducción de datos por parte del usuario
        Scanner scanner = new Scanner(System.in);
        String nombre, destino;
        int dia, mes, anyo, asientos;

        System.out.println("\n---- Bienvenido al sistema de reserva de vuelos ----\n");
        System.out.println("Ingrese su nombre: ");
        nombre = scanner.next();
        System.out.println("Ingrese su destino: ");
        destino = scanner.next();
        System.out.println("Ingrese el día de la fecha en la desea viajar: ");
        dia = scanner.nextInt();
        System.out.println("Ingrese el mes de la fecha en la desea viajar: ");

        mes = scanner.nextInt();
        System.out.println("Ingrese el año de la fecha en la desea viajar: ");
        anyo = scanner.nextInt();
        System.out.println("Ingrese el número de asientos que desea reservar: ");
        asientos = scanner.nextInt();

        try {
            // Creación de la instancia de la reserva
            ReservaVuelo reservaVuelo1 = new ReservaVuelo(nombre, destino, LocalDate.of(anyo, mes, dia), asientos);

            System.out.println("\nSu reserva ha sido realizada correctamente.\n");
            System.out.println(reservaVuelo1.toString());
            System.out.println("\nGracias por utilizar nuestros servicios.");
        // Captura de las excepciones personalizadas
        }catch (ReservaInvalidaException rie) {
            System.out.println("Error: "+rie.getMessage());
        // Captura de la excepción de valor de fecha incorrecto.
        }catch (DateTimeException dte) {
            System.out.println("Error: "+dte.getMessage()+". Valor de fecha incorrecto.");
        }finally {
            System.out.println("\nFin del programa.");
        }

    }
}