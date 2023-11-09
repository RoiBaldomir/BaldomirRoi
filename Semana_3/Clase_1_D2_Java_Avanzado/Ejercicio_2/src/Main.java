import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre;
        double precio;
        int cantidad;

        try{
            System.out.println("\n---- Bienvenido al sistema de gestión de inventario ----\n");
            System.out.println("Ingrese el nombre del producto: ");
            nombre = scanner.next();
            System.out.println("Ingrese el precio del producto: ");
            precio = scanner.nextDouble();
            System.out.println("Ingrese la cantidad del producto: ");
            cantidad = scanner.nextInt();

            Producto producto = new Producto(nombre, precio, cantidad);

            System.out.println("Producto añadido correctamente.");
        // Captura de las excepciones personalizadas
        }catch (ProductoException pe) {
            System.out.println("Error: "+pe.getMessage());
        // Captura de una excepción predefinida
        }catch (InputMismatchException ime) {
            System.out.println("Error: "+ime.getMessage()+". Ingrese un valor numérico, por favor.");
        }finally {
            System.out.println("\nFin del programa.");
        }
    }
}