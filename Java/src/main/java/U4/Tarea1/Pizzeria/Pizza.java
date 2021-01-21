package U4.Tarea1.Pizzeria;

import java.util.Arrays;

public class Pizza {
  private Size tamanio;
  private Ingrendiente[] ingrendientes;
  private int num_ingredientes;

  public Pizza(Size tamanio, Ingrendiente[] ingrendientes) {
    this.tamanio = tamanio;
    this.ingrendientes = ingrendientes;
  }

  public Pizza() {
    Ingrendiente[] ingrendientes = new Ingrendiente[2];
    Ingrendiente queso = new Ingrendiente();
    Ingrendiente jamon = new Ingrendiente("Jamon", 50);
    ingrendientes[0] = queso;
    this.tamanio = Size.FAMILIAR;
    this.ingrendientes = ingrendientes;
  }

  public boolean add_ingrediente(Ingrendiente[] ingrendientes) {
    num_ingredientes = 0;
    if (num_ingredientes < 3) {
      Ingrendiente i = new Ingrendiente();
      ingrendientes[num_ingredientes++] = i;
    }
    return true;
  }

  @Override
  public String toString() {
    return "Pizza{"
        + "tamanio="
        + tamanio
        + ", ingrendientes="
        + Arrays.toString(ingrendientes)
        + ", num_ingredientes="
        + num_ingredientes
        + '}';
  }
}
