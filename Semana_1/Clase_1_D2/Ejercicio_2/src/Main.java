public class Main {
    public static void main(String[] args) {
        // Definición e inicialización de las variables
        int num = 3;
        double num2 = 4.5;
        boolean bool = true;
        String saludo = "!Hola a todos!";

        // Muestra del valor de las variables por pantalla
        System.out.println(num);
        System.out.println(num2);
        System.out.println(bool);
        System.out.println(saludo);

        // Si se intenta asignar un valor que no corresponde al tipo de dato de la variable el compilador
        // mostrará un error diciendo que no puede convertir el tipo al correspondiente, salvo en el caso del tipo
        // double que permite el tipo integer ya que realiza la conversión automáticamente, sin embargo, a la inversa
        // no la realiza y el compilador mostrará un error de incompatibilidad de tipo.
    }
}