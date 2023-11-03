package org.example;

import org.example.logica.Controladora;
import org.example.logica.Platillo;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        //Se crea una instancia de la Controladora de la logica
        Controladora control = new Controladora ();

        // Se crean objetos Platillo
        Platillo platillo1 = new Platillo(1, "Tortilla", "Patatas, huevo, sal", 6);
        Platillo platillo2 = new Platillo(2, "Cocido", "Patatas, Verdura, Carne, Aceite", 9);
        Platillo platillo3 = new Platillo(3, "Paella", "Arroz, Carne, Verduras", 10);

        // Alta de los objetos en la BD
        control.crearPlatillo(platillo1);
        control.crearPlatillo(platillo2);
        control.crearPlatillo(platillo3);

        // Baja de uno de los objetos
        control.eliminarPlatillo(platillo3.getId());

        // Se modifica un atributo en la BD
        platillo2.setNombre("Cocido gallego");
        control.editarPlatillo(platillo2);

        // Listado de los platillos de la BD
        List<Platillo> listaPlatillos = control.traerPlatillos();
        for(Platillo platillo : listaPlatillos){
            System.out.println("Platillo: "+platillo.getNombre());
        }


    }
}