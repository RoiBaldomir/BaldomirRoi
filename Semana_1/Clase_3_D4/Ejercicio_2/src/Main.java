public class Main {
    public static void main(String[] args) {
        // Creación del vector de tipo Persona con 5 posiciones
        Persona[] personas = new Persona[5];

        // Creación y guardado de las personas en el vector
        personas[0] = new Persona(1, "Paco", 25, "Calle 23", 987412456);
        personas[1] = new Persona(2, "Javier", 42, "Calle 45", 984714564);
        personas[2] = new Persona(3, "Jorge", 34,"Calle 56", 985214658);
        personas[3] = new Persona(4, "Cristina", 15, "Calle 12", 965412364);
        personas[4] = new Persona(5, "María", 72, "Calle 78", 974156584);

        // Muestra por pantalla el nombre y la edad de cada persona almacenada
        for (Persona persona : personas) {
            System.out.println("Nombre: "+persona.getNombre()+" | Edad: "+persona.getEdad());
        }

        // Cambio de nombres de las dos primeras personas
        System.out.println("\nNombre: "+personas[0].getNombre()+" | Nombre: "+personas[1].getNombre());
        personas[0].setNombre("Lucas");
        personas[1].setNombre("Alejandro");
        System.out.println("Nombre: "+personas[0].getNombre()+" | Nombre: "+personas[1].getNombre());

        System.out.println("\nPersonas mayores de 30 años:\n");
        for (Persona persona : personas) {
            // Filtro de personas mayores de 30 años
            if (persona.getEdad() > 30){
                System.out.println("Nombre: "+persona.getNombre()+" | Edad: "+persona.getEdad());
            }
        }
    }
}