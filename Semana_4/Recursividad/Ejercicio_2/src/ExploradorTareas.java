public class ExploradorTareas {
    public void explorarTareas(Tarea tarea) {
        if (tarea == null || tarea.getNombre() == null) {
            return;
        }

        System.out.println(tarea.getNombre());

        for (Tarea subtarea : tarea.getSubtareas()){
            explorarTareas(subtarea);
        }
    }
}
