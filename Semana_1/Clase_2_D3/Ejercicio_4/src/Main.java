import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Definición e inicialización de variables
        String[][] asientos = new String[5][5];
        int fila = 0;
        int asiento = 0;
        int compra = 0;

        // Inicialización del scanner
        Scanner scanner = new Scanner(System.in);

        // Lleno de vacios de la matriz
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos.length; j++) {
                asientos[i][j] = "O";
            }
        }

        do {
            // Solicitud al usuario por pantalla de la fila y asiento
            System.out.println("Fila: ");
            fila = scanner.nextInt();
            System.out.println("Asiento: ");
            asiento = scanner.nextInt();
            // Si el asiento está ocupado se le solicitará al usuario por pantalla que seleccione otro
            while(asientos[fila][asiento] == "X") {
                System.out.println("Asiento Ocupado. Seleccione otro, por favor");
                System.out.println("Fila: ");
                fila = scanner.nextInt();
                System.out.println("Asiento: ");
                asiento = scanner.nextInt();
            }
            // Se asigna al usuario el asiento correspondiente
            asientos[fila][asiento] = "X";
            // Se actualiza el mapa de asientos después de cada reserva
            for (int i = 0; i < asientos.length; i++) {
                for (int j = 0; j < asientos.length; j++) {
                    System.out.print(asientos[i][j] + " ");
                }
            }
            // Solicitud por pantalla al usuario si quiere hacer otra reserva
            System.out.println("\n¿Otra reserva? 1. Sí 0. No");
            compra = scanner.nextInt();
        }while (compra == 1);

        // Se muestra el mapa de asientos definitivo
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos.length; j++) {
                System.out.print(asientos[i][j] + " ");
            }
        }
    }
}