import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Empleado> listaEmpleados = Arrays.asList(
            new Empleado("Roi", 24000, "Desarrollador"),
            new Empleado("Javier", 22000, "Analista"),
            new Empleado("Paula", 30000, "Gerente"),
            new Empleado("Jorge", 28000, "Analista"),
            new Empleado("Pablo", 35000, "Gerente"),
            new Empleado("Laura", 22000, "Desarrollador"),
            new Empleado("David", 26000, "Analista"),
            new Empleado("Ana", 32000, "Gerente"),
            new Empleado("Juan", 18000, "Desarrollador"));

        List<Empleado> listaFiltrada;

        // Empleados con salario mayor a 25000
        System.out.println("\n---- Empleados con salario mayor a 25000 ----\n");

        double salario = 25000;

        listaEmpleados.stream()
                .filter(empleado -> empleado.getSalario() > salario)
                .toList()
                .forEach(System.out::println);

        // Listado de empleados desarrolladores
        System.out.println("\n---- Empleados desarrolladores y media de salario ----\n");

        listaFiltrada = listaEmpleados.stream()
                .filter(empleado -> empleado.getCategoria().equalsIgnoreCase("desarrollador"))
                .toList();

        listaFiltrada.forEach(System.out::println);

        // Salario medio de desarrolladores
        double mediaDesarrollador = listaFiltrada.stream()
                .mapToDouble(Empleado::getSalario)
                .average()
                .orElse(0);

        System.out.println("\nEl salario medio de los desarrolladores es de -> "+Math.round(mediaDesarrollador * 100d)/100d);

        // Listado de empleados analistas
        System.out.println("\n---- Empleados analistas y media de salario ----\n");

        listaFiltrada = listaEmpleados.stream()
                .filter(empleado -> empleado.getCategoria().equalsIgnoreCase("analista"))
                .toList();

        listaFiltrada.forEach(System.out::println);

        // Salario medio de analistas
        double mediaAnalista = listaFiltrada.stream()
                .mapToDouble(Empleado::getSalario)
                .average()
                .orElse(0);

        System.out.println("\nEl salario medio de los analistas es de -> "+Math.round(mediaAnalista * 100d)/100d);

        // Listado de empleados gerentes
        System.out.println("\n---- Empleados gerentes y media de salario ----\n");

        listaFiltrada = listaEmpleados.stream()
                .filter(empleado -> empleado.getCategoria().equalsIgnoreCase("gerente"))
                .toList();

        listaFiltrada.forEach(System.out::println);

        // Salario medio de gerentes
        double mediaGerente = listaFiltrada.stream()
                .mapToDouble(Empleado::getSalario)
                .average()
                .orElse(0);

        System.out.println("\nEl salario medio de los gerentes es de -> "+Math.round(mediaGerente * 100d)/100d);

        // Empleado con el mayor salario
        Empleado empleadoMayorSalario = listaEmpleados.stream()
                .max(Comparator.comparing(Empleado::getSalario))
                .orElse(new Empleado());

        System.out.println("\n---- Empleado con el mayor salario ----\n");
        System.out.println(empleadoMayorSalario);
    }
}