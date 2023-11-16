public class ExploradorDirectorios {

    public void explorarDirectorio(Directorio directorio) {
        System.out.println(directorio.getNombre());
        directorio.getArchivos().forEach(System.out::println);

        for (Directorio subdirectorio : directorio.getSubdirectorios()){
            explorarDirectorio(subdirectorio);
        }
    }
}
