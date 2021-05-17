package Exame;

import java.sql.SQLException;
import java.util.Date;

public class main {
    public static void main(String[] args) throws SQLException {
        Consultas consultas = new Consultas();
        Transacciones transacciones = new Transacciones();
        orders or1 = new orders(99999, "2021/5/31", "2021/6/7", "En process", 103);
        Orderdetails od = new Orderdetails(or1.getOrderNumber(), "S10_1678", 1,
                48.81, 3);
        Orderdetails od2 = new Orderdetails(or1.getOrderNumber(), "S10_4962", 1,
                103.42, 3);
        transacciones.insertarPedido(or1, od, od2);

    }
}
