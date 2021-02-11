package U5.Tarea1.Electrodomesticos;

public class Lavadora extends Electrodomestico implements Comparable {
  int carga;

  public Lavadora(double preciobase, Color color, ConsumoEnergetico consumo, double peso) {
    super(preciobase, color, consumo, peso);
    this.carga = 5;
  }

  public Lavadora(double preciobase, double peso, int carga) {
    super(preciobase, peso);
    this.carga = 5;
  }

  public Lavadora(int carga) {
    this.carga = carga;
  }

  @Override
  public int compareTo(Object o) {
    int resultado;
    if (this.preciobase < ((Lavadora) o).preciobase) {
      resultado = -1;
    } else if (this.preciobase > ((Lavadora) o).preciobase) {
      resultado = 1;
    } else {
      resultado = 0;
    }
    return resultado;
  }
}
