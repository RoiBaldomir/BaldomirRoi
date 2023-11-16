import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creación del directorio base
        Directorio directorio = new Directorio("Mis Documentos");
        ExploradorDirectorios explorador = new ExploradorDirectorios();

        // Creación de los subdirectorios
        List<Directorio> subdirectorios = Arrays.asList(
                new Directorio("|--Imágenes"),
                new Directorio("|--Vídeos"),
                new Directorio("|--Documentos"));

        // Se añaden los subdirectorios
        directorio.agregarSubdirectorios(directorio, subdirectorios);

        // Creación de los archivos
        List<String> archivosImagenes = Arrays.asList(
                "|----coliseo.jpg",
                "|----torre_eiffel.jpg",
                "|----escorial.jpg");

        List<String> archivosVideos = Arrays.asList(
                "|----paris2022.mp4",
                "|----roma2022.mp4",
                "|----madrid2022.mp4");

        List<String> archivosDocumentos = Arrays.asList(
                "|----apuntes.doc",
                "|----ejercicios.pdf",
                "|----temario.pdf");

        // Se añaden los archivos
        directorio.agregarArchivos(directorio, archivosImagenes ,1);
        directorio.agregarArchivos(directorio, archivosVideos ,2);
        directorio.agregarArchivos(directorio, archivosDocumentos ,3);

        // Se explora el directorio de manera recursiva
        explorador.explorarDirectorio(directorio);
    }
}