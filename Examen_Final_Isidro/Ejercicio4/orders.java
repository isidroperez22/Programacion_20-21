package Exame;

import java.util.Date;

public class orders {
   private final int orderNumber;
    private final String orderDate;
    private final String requiredDate;
    private final String status;
    private final int customerNumber;

    public orders(int orderNumber, String orderDate, String requiredDate, String status, int customerNumber) {
        this.orderNumber = orderNumber;
        this.orderDate = orderDate;
        this.requiredDate = requiredDate;
        this.status = status;
        this.customerNumber = customerNumber;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public String getRequiredDate() {
        return requiredDate;
    }

    public String getStatus() {
        return status;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }
}
