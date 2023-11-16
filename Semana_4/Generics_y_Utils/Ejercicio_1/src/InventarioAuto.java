import java.util.ArrayList;
import java.util.List;

public class InventarioAuto<T extends Auto> {
    private List<T> listaAutos;

    public InventarioAuto() {
        this.listaAutos = new ArrayList<>();
    }

    // Método para añadir autos a la colección de autos
    public void agregarAutos(T auto) {
        listaAutos.add(auto);
    }

    // Métodos para buscar por marca y año
    public void buscarPorMarca(String marca) {
        listaAutos.stream()
                .filter(a -> a.getMarca().equalsIgnoreCase(marca))
                .forEach(System.out::println);
    }
    public void buscarPorAnyo(int anyo) {
        listaAutos.stream()
                .filter(a -> a.getAnyo() == anyo)
                .forEach(System.out::println);
    }

    public double calcularTotalInventario() {
        return listaAutos.stream()
                .mapToDouble(Auto::getPrecio)
                .sum();
    }
}
