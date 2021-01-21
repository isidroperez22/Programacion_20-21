package U4.Tarea1.Pizzeria;

import java.util.Date;

public class main {

  public static void main(String[] args) {
    for (Size tam : Size.values()) {
      System.out.println(tam);
    }
    Ingrendiente jamon = new Ingrendiente("Jamon", 200);
    Ingrendiente mortadela = new Ingrendiente("Mortadela", 200);
    Ingrendiente champinion = new Ingrendiente("Champinion", 70);
    Ingrendiente carne = new Ingrendiente("Carne", 100);

    Pizza p1 = new Pizza();

    Pedido pe = new Pedido(new Pizza(), new Date());
    Pizzeria pizzasusia = new Pizzeria(pe, 0, 5);
    pizzasusia.add_pedido(new Pizza());
    System.out.println(pizzasusia);
  }
}
