import java.util.*;

public class RegistroMascotas <T extends Mascota>{
    private List<T> listaMascotas;

    public RegistroMascotas() {
        this.listaMascotas = new ArrayList<>();
    }

    // Método para agregar mascotas
    public void agregarMascota(T mascota) {
        listaMascotas.add(mascota);
    }

    // Método para saber el número de mascotas registradas
    public void conteoDeMascotas() {
        System.out.println("\nNúmero de mascotas registradas -> "+listaMascotas.size());
    }

    // Método para buscar por nombre
    public void buscarPorNombre(String nombre) {
            listaMascotas.stream()
                    .filter(n -> n.getNombre().equalsIgnoreCase(nombre))
                    .forEach(System.out::println);
    }

    // Método para buscar por especie
    public void buscarPorEspecie(String especie) {
        listaMascotas.stream()
                .filter(e -> e.getEspecie().equalsIgnoreCase(especie))
                .forEach(System.out::println);
    }

    // Método para generar datos aleatorios
    public void generarDatosAleatorios(T mascota) {
        List<String> nombres = Arrays.asList("Bobby", "Rex", "Lacy", "Duncan", "Dolly", "Neo", "Lucky", "Toby", "Blaqui", "Pelu"); // Colección de nombres
        List<String> especies = Arrays.asList("Americano", "Europeo", "Asiático", "Isleño", "Áfricano", "Selvático", "Penínsular", "Antártico", "De bosque", "Desértico"); // Colección de especies
        // Generación de valores aleatorios para los datos
        Random random = new Random();
        int idAleatoria = random.nextInt(100) + 1;
        int edadAleatoria = random.nextInt(20) + 1;
        int nombreAleatorio = random.nextInt(10);
        int especieAleatoria = random.nextInt(10);
        // Seteo de los valores aleatorios
        mascota.setId(idAleatoria);
        mascota.setNombre(nombres.get(nombreAleatorio));
        mascota.setEdad(edadAleatoria);
        mascota.setEspecie(especies.get(especieAleatoria));
    }

    public List<T> getListaMascotas() {
        return listaMascotas;
    }
}
