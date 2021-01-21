package U4.Tarea1.Pizzeria;

import java.util.Arrays;

public class Pizzeria {
  private Pizza[] pedidos;
  private int num_pedidos;
  private int num_max;

  public Pizzeria(Pedido pedidos, int num_pedidos, int num_max) {
    setNum_pedidos(0);
    setNum_max(5);
    this.pedidos = new Pizza[num_max];
  }

  public Pizza[] getPedidos() {
    return pedidos;
  }

  public void setPedidos(Pizza[] pedidos) {
    this.pedidos = pedidos;
  }

  public int getNum_pedidos() {
    return num_pedidos;
  }

  public void setNum_pedidos(int num_pedidos) {
    this.num_pedidos = num_pedidos;
  }

  public int getNum_max() {
    return num_max;
  }

  public void setNum_max(int num_max) {
    this.num_max = num_max;
  }

  public void add_pedido(Pizza p) {
    if (num_pedidos < pedidos.length) {
      pedidos = Arrays.copyOf(pedidos, pedidos.length + 1);
    }
    pedidos[num_pedidos++] = p;
  }

  @Override
  public String toString() {
    return "Pizzeria{" + "pedidos=" + Arrays.toString(pedidos) + '}';
  }

  public int num_pedidos() {
    return getNum_pedidos();
  }
}
