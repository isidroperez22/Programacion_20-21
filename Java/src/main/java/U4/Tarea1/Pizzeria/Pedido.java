package U4.Tarea1.Pizzeria;

import java.util.Date;

public class Pedido {
  private Pizza Pizzas;
  private Date d = new Date();

  public Pedido(Pizza pizzas, Date d) {
    Pizzas = pizzas;
    this.d = d;
  }

  @Override
  public String toString() {
    return "Pedidos{" + "Pizzas=" + Pizzas + ", d=" + d + '}';
  }
}
