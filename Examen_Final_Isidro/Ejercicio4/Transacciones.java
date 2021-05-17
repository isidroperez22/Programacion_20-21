package Exame;

import Entregable_1920.ConexionBD;

import java.sql.Connection;
import java.sql.SQLException;

public class Transacciones {
    Connection con = ConexionBD.getConnection();
    public void insertarPedido(orders orders, Orderdetails od1, Orderdetails od2) throws SQLException {
        try {
            con.setAutoCommit(false);
            ModelOrders.insertOrder(orders);
            System.out.println("Orden insertada");
            OrederdetailsModel.insertOrderDetails(od1);
            OrederdetailsModel.insertOrderDetails(od2);
            System.out.println("Detalles de orden insertados");
            con.commit();
        } catch (SQLException throwables) {
            System.out.println(throwables);
            try {
                if (con != null) {
                    System.out.println("Realizando rollback");
                    con.rollback();
                }
            } catch (SQLException sqlException) {
                System.out.println("Error en el rollback");
            }
        }
    }
}
