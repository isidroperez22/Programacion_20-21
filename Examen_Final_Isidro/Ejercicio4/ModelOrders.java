package Exame;

import Ejemplo.ConexionBD;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ModelOrders {
    public static Integer insertOrder(orders orders) throws SQLException {
        Integer rowsAffected=0;
        Connection con= ConexionBD.getConnection();

        String sql="INSERT INTO orders VALUES (?,?,?,NULL,?,NULL,?)";
        PreparedStatement sentencia=con.prepareStatement(sql);

        sentencia.setInt(1,orders.getOrderNumber());
        sentencia.setString(2,  orders.getOrderDate());
        sentencia.setString(3,  orders.getRequiredDate());
        sentencia.setString(4,orders.getStatus());
        sentencia.setInt(5,orders.getCustomerNumber());

        rowsAffected=sentencia.executeUpdate();

        return rowsAffected;

    }
}
