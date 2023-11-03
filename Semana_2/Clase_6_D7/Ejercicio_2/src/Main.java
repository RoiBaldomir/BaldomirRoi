import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Definición e inicialización de las variables y el ArrayList
        List<Producto> productos = new ArrayList<>();
        double mayorPrecioVenta = 0;
        int mayorStock = 0;
        double menorPrecioVenta = Double.MAX_VALUE;
        String infoProducto = "";
        boolean primerElemento = true;

        // Creación y guardado de los objetos en el ArrayList
        productos.add(new Producto(1, "Samsung Tab 10", "Samsung", "Tablet", 300, 400, 10));
        productos.add(new Producto(2, "Xiaomi M10", "Xiaomi", "Móvil", 200, 300, 5));
        productos.add(new Producto(3, "Sony WX1000", "Sony", "Auriculares", 150, 250, 3));
        productos.add(new Producto(4, "Lenovo L100", "Lenovo", "Laptop", 700, 850, 8));
        productos.add(new Producto(5, "SanDisk USB", "SanDisk", "USB", 10, 15, 20));
        productos.add(new Producto(6, "LG T500", "LG", "Televisión", 500, 570, 12));
        productos.add(new Producto(7, "Sony BR-10", "Sony", "Reproductor Bluray", 100, 120, 6));
        productos.add(new Producto(8, "Dyson 10", "Dyson", "Aspiradora", 500, 540, 7));
        productos.add(new Producto(9, "HP-3320", "HP", "Ordenador de sobremesa", 600, 720, 1));
        productos.add(new Producto(10, "Logitech T10", "Logitech", "Teclado", 50, 70, 15));

        System.out.println("\n----Lista de productos----\n");

        for (Producto producto: productos) {
            System.out.println("Código = " + producto.getCodigo() +
                    ", Nombre = " + producto.getNombre() +
                    ", Marca = " + producto.getMarca() +
                    ", Tipo = " + producto.getTipo() +
                    ", Precio Costo = " + producto.getPrecioCosto() +
                    ", PrecioVenta = " + producto.getPrecioVenta() +
                    ", Stock = " + producto.getStock());
        }

        System.out.println("\n----Producto con mayor precio de venta----\n");

        for (Producto producto: productos) {
            if (producto.getPrecioVenta() > mayorPrecioVenta) {
                mayorPrecioVenta = producto.getPrecioVenta(); // En mayorPrecioVenta se va almacenando el mayor valor con cada iteración del bucle hasta que llegue al final
                infoProducto = producto.toString(); // Se muestra el objeto que cumple la condición
            }
        }

        System.out.println(infoProducto);

        System.out.println("\n----Producto con menor precio de venta----\n");

        for (Producto producto: productos) {
            if (producto.getPrecioVenta() < menorPrecioVenta) {
                menorPrecioVenta = producto.getPrecioVenta(); // En menorPrecioVenta se va almacenando el menor valor con cada iteración del bucle hasta que llegue al final
                infoProducto = producto.toString(); // Se muestra el objeto que cumple la condición
            }
        }

        System.out.println(infoProducto);

        System.out.println("\n----Borrado del elemento en la posición 5 del ArrayList----\n");

        productos.remove(5); // Borra el elemento correspondiente al indice elegido

        for (Producto producto: productos) {
            System.out.println("Código = " + producto.getCodigo() +
                    ", Nombre = " + producto.getNombre() +
                    ", Marca = " + producto.getMarca() +
                    ", Tipo = " + producto.getTipo() +
                    ", Precio Costo = " + producto.getPrecioCosto() +
                    ", PrecioVenta = " + producto.getPrecioVenta() +
                    ", Stock = " + producto.getStock());
        }

        System.out.println("\n----Producto con mayor cantidad de stock----\n");

        for (Producto producto: productos) {
            if (producto.getStock() > mayorStock) {
                mayorStock = producto.getStock(); // En mayorStock se va almacenando el mayor valor con cada iteración del bucle hasta que llegue al final
                infoProducto = producto.toString(); // Se muestra el objeto que cumple la condición
                if (!primerElemento){
                    producto.setStock(producto.getStock() - 3);
                }
                primerElemento = false; // Variable booleana que permite descartar el primer elemento para evitar que su stock sea disminuido
            }
        }

        System.out.println(infoProducto);

        System.out.println("\n----Registro actualizado con el descuento de stock----\n");

        for (Producto producto: productos) {
            System.out.println("Código = " + producto.getCodigo() +
                    ", Nombre = " + producto.getNombre() +
                    ", Marca = " + producto.getMarca() +
                    ", Tipo = " + producto.getTipo() +
                    ", Precio Costo = " + producto.getPrecioCosto() +
                    ", PrecioVenta = " + producto.getPrecioVenta() +
                    ", Stock = " + producto.getStock());
        }
    }
}