import java.sql.*;

public class Main {
    /*Crear una aplicación para gestionar una lista de estudiantes en una base de datos.
    Los estudiantes tendrán atributos como id, nombre, edad y calificación.

El sistema debe ser capaz de permitir agregar nuevos estudiantes, recuperar la lista de todos y mostrar su información.

Crear una base de datos mediante MySQL llamada universidad y una tabla llamada estudiantes cuyas columnas coincidan con los atributos de la clase estudiante.

Utilizar JDBC (Java Database Connectivity) para interactuar con la base de datos.*/

    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/universidad";
        Connection connection = DriverManager.getConnection(url, "root", "");
        System.out.println("Conexion realizada");

        //insertar registros en una tabla de la BBDD
        String insertSql = "INSERT INTO estudiantes (nombre, edad, calificacion) VALUES (?, ?, ?)";

        //Declarar un Statement
        PreparedStatement statement = connection.prepareStatement(insertSql);

        //Setear parametros del insert
        statement.setString(1, "Juan");
        statement.setInt(2, 40);
        statement.setDouble(3,9.6);

        //Ejecutar sentencia
        statement.execute();

        //consultar datos ingresados
        String consultaSql = "SELECT * FROM estudiantes";
        Statement statement1 = connection.createStatement();
        ResultSet rs = statement1.executeQuery(consultaSql);

        //Recorrer el resultset para mostrar los registros obtenidos
        while (rs.next()) {
            System.out.println("Cliente ID: " + rs.getInt(1) + ", con nombre: " + rs.getString(2)+" y edad: "+rs.getInt(3)+" tiene una calidicacion de: "+rs.getDouble(4));

        }
    }
}