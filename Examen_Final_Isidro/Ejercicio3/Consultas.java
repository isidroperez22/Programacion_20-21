package Exame;

import java.sql.*;
import java.util.List;

public class Consultas {
    List<Office> MostrarOfincinas;
    Connection connection = null;

    public Consultas() {
    }

    public void oficinas(){
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/classicmodels?user=root&password=");

            String sql = "SELECT * FROM `offices`";
            PreparedStatement sentencia = connection.prepareStatement(sql);

            sentencia.executeQuery();

            ResultSet resultado = sentencia.executeQuery();

            while (resultado.next()){
                System.out.println("Codigo: "+ resultado.getString("officeCode"));
                System.out.println("Ciudad: "+resultado.getString("city"));
                System.out.println("telefono: "+ resultado.getString("phone"));
                System.out.println("direccion 1: "+resultado.getString("addressLine1"));
                System.out.println("direccion 2: " +resultado.getString("addressLine2"));
                System.out.println("estado: " +resultado.getString("state"));
                System.out.println("pais: " +resultado.getString("country"));
                System.out.println("codigo postal: " +resultado.getString("postalCode"));
                System.out.println("territorio: " +resultado.getString("territory"));
                System.out.println("-----------------------------------------------------------------------------");

            }

        } catch (SQLException throwables) {
            System.out.println("Error al conectar");
        }
    }
}
