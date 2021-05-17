package Exame;

import Ejemplo.ConexionBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OrederdetailsModel {
    public static Integer insertOrderDetails(Orderdetails od) throws SQLException {
        Integer rowsAffected=0;
        Connection con= ConexionBD.getConnection();

        String sql="INSERT INTO orderdetails VALUES (?,?,?,?,?)";
        PreparedStatement sentencia=con.prepareStatement(sql);

        sentencia.setInt(1,od.getOrderNumber());
        sentencia.setString(2,od.getProductCode());
        sentencia.setInt(3,od.getQuantityOrdered());
        sentencia.setDouble(4,od.getPriceEach());
        sentencia.setInt(5,od.getOrderLineNumber());

        rowsAffected=sentencia.executeUpdate();

        return rowsAffected;

    }
}
