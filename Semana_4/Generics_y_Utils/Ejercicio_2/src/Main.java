public class Main {
    public static void main(String[] args) {
        RegistroMascotas<Mascota> registro = new RegistroMascotas<>();

        Perro mascota1 = new Perro();
        Gato mascota2 = new Gato();
        Reptil mascota3 = new Reptil();
        Ave mascota4 = new Ave();

        // Llamada al método para generar los datos aleatorios de las mascotas
        registro.generarDatosAleatorios(mascota1);
        registro.generarDatosAleatorios(mascota2);
        registro.generarDatosAleatorios(mascota3);
        registro.generarDatosAleatorios(mascota4);

        System.out.println("Añadiendo mascotas...");

        // Se añaden las mascotas al registro
        registro.agregarMascota(mascota1);
        registro.agregarMascota(mascota2);
        registro.agregarMascota(mascota3);
        registro.agregarMascota(mascota4);

        // Se muestra el número de mascotas registradas
        registro.conteoDeMascotas();

        // Búsqueda por nombre y especie de las mascotas
        System.out.println("\n---- Búsqueda por especie ----\n");

        registro.buscarPorEspecie("Americano");

        System.out.println("\n---- Búsqueda por nombre ----\n");

        registro.buscarPorNombre("Duncan");

        System.out.println("\n---- Registro mascotas ----\n");

        registro.getListaMascotas().forEach(System.out::println);
    }
}