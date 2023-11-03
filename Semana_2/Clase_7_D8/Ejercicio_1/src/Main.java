import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try {
            // Carga del driver (se debe agregar el .jar al proyecto)
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Clase MySql cargada.");
            // Se establece la conexión con la base de datos
            String url = "jdbc:mysql://localhost:3306/universidad";
            Connection conn = DriverManager.getConnection(url, "root", "1234");
            System.out.println("Conexión establecida.");

            // Se crean los objetos Estudiante a insertar en la base de datos
            Estudiante estudiante1 = new Estudiante(1, "Diego", 18, 8);
            Estudiante estudiante2 = new Estudiante(2, "Laura", 20, 5);
            Estudiante estudiante3 = new Estudiante(3, "Javier", 21, 4);

            // Se insertan los datos en la tabla utilizando una sentencia preparada
            String insertSQL = "INSERT INTO estudiantes (nombre, edad, calificacion) VALUES (?, ?, ?)";

            // Se declara la sentencia
            PreparedStatement stmt = conn.prepareStatement(insertSQL);

            // Se setean los parámetros
            stmt.setString(1, estudiante1.getNombre());
            stmt.setInt(2, estudiante1.getEdad());
            stmt.setInt(3, estudiante1.getCalificacion());
            // Se ejecuta la sentencia
            stmt.executeUpdate();

            stmt.setString(1, estudiante2.getNombre());
            stmt.setInt(2, estudiante2.getEdad());
            stmt.setInt(3, estudiante2.getCalificacion());
            // Se ejecuta la sentencia
            stmt.executeUpdate();

            stmt.setString(1, estudiante3.getNombre());
            stmt.setInt(2, estudiante3.getEdad());
            stmt.setInt(3, estudiante3.getCalificacion());
            // Se ejecuta la sentencia
            stmt.executeUpdate();
            System.out.println("Registros insertados en la tabla estudiantes.");

            // Se consultan los datos introducidos con una sentencia SELECT
            String selectSQL = "SELECT * FROM estudiantes";

            Statement stmt2 = conn.createStatement();
            ResultSet rs = stmt2.executeQuery(selectSQL);

            while (rs.next()) {
                // Se imprimen los resultados iterando un ResultSet según su posición y tipo
                System.out.println("Nombre: "+rs.getString(2) + " - " + "Edad: "+rs.getInt(3) + " - " + "Calificación: "+rs.getInt(4));
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}