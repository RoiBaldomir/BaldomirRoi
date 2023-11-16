public class ExploradorDirectorios {

    public void explorarDirectorio(Directorio directorio) {
        if (directorio == null || directorio.getNombre() == null) {
            return;
        }

        System.out.println(directorio.getNombre());
        directorio.getArchivos().forEach(System.out::println);

        for (Directorio subdirectorio : directorio.getSubdirectorios()){
            explorarDirectorio(subdirectorio);
        }
    }
}
