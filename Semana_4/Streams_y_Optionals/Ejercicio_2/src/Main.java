import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Evento> listaEventos = Arrays.asList(
                new Evento("Evento 1", LocalDate.of(2023, 12, 13), "Reunión"),
                new Evento("Evento 2", LocalDate.of(2023, 11, 20), "Taller"),
                new Evento("Evento 3", LocalDate.of(2023, 11, 25), "Conferencia"),
                new Evento("Evento 4", LocalDate.of(2023, 12, 4), "Taller"),
                new Evento("Evento 5", LocalDate.of(2023, 12, 10), "Conferencia"),
                new Evento("Evento 6", LocalDate.of(2023, 12, 5), "Reunión"),
                new Evento("Evento 7", LocalDate.of(2023, 12, 13), "Taller"),
                new Evento("Evento 8", LocalDate.of(2023, 11, 21), "Reunión"),
                new Evento("Evento 9", LocalDate.of(2023, 11, 30), "Conferencia"));

        List<Evento> listaFiltrada;

        // Eventos programados para el 13-12-2023
        System.out.println("\n---- Eventos programados para el 13/12/2023 ----\n");

        LocalDate fecha = LocalDate.of(2023, 12, 13);

        listaEventos.stream()
                .filter(evento -> evento.getFecha().equals(fecha))
                .toList()
                .forEach(System.out::println);

        System.out.println("\n---- Listado y número de reuniones ----\n");

        // Listado de reuniones
        listaFiltrada = listaEventos.stream()
                .filter(evento -> evento.getCategoria().equalsIgnoreCase("reunión"))
                .toList();

        listaFiltrada.forEach(System.out::println);

        // Total de reuniones
        int totalReuniones = listaFiltrada.size();

        System.out.println("\nEl número total de reuniones es de -> "+totalReuniones);

        System.out.println("\n---- Listado y número de talleres ----\n");

        // Listado de talleres
        listaFiltrada = listaEventos.stream()
                .filter(evento -> evento.getCategoria().equalsIgnoreCase("taller"))
                .toList();

        listaFiltrada.forEach(System.out::println);

        // Total de talleres
        int totalTalleres = listaFiltrada.size();

        System.out.println("\nEl número total de talleres es de -> "+totalTalleres);

        System.out.println("\n---- Listado y número de conferencias ----\n");

        // Listado de conferencias
        listaFiltrada = listaEventos.stream()
                .filter(evento -> evento.getCategoria().equalsIgnoreCase("conferencia"))
                .toList();

        listaFiltrada.forEach(System.out::println);

        // Total de conferencias
        int totalConferencias = listaFiltrada.size();

        System.out.println("\nEl número total de conferencias es de -> "+totalConferencias);

        System.out.println("\n---- Evento más cercano ----\n");

        // Evento más cercano
        Evento eventoMasCercano = listaEventos.stream()
                .filter(evento -> LocalDate.now().isBefore(evento.getFecha())) // La fecha de hoy tiene que ser anterior al evento
                .min(Comparator.comparing(evento -> ChronoUnit.DAYS.between(LocalDate.now(), evento.getFecha())))
                .orElse(new Evento());

        System.out.println("El evento más cercano es -> "+eventoMasCercano);
    }
}