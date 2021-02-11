package U5.Tarea1.Electrodomesticos;

public class Televison extends Electrodomestico {
  double pulgadas;
  Boolean TDT;

  public Televison(
      double preciobase,
      Color color,
      ConsumoEnergetico consumo,
      double peso,
      double pulgadas,
      Boolean TDT) {
    super(preciobase, color, consumo, peso);
    this.pulgadas = pulgadas;
    this.TDT = TDT;
  }

  public Televison(double preciobase, double peso) {
    super(preciobase, peso);
    this.pulgadas = 20;
    this.TDT = false;
  }

  public Televison() {
    this.pulgadas = 20;
    this.TDT = false;
  }

  public double getPulgadas() {
    return pulgadas;
  }

  public Boolean getTDT() {
    return TDT;
  }

  public double getPrecioFinal() {
      if (pulgadas > 40) {
          preciobase = (preciobase * 0.3) + preciobase;
      }
      if (getTDT()) {
          preciobase = preciobase + 50;
      }
      switch (getConsumo()){
          case A -> this.preciobase = preciobase+ 100;
          case B -> this.preciobase = preciobase+ 80;
          case C -> this.preciobase = preciobase+ 60;
          case D -> this.preciobase = preciobase+ 50;
          case E -> this.preciobase = preciobase+ 30;
          case F -> this.preciobase = preciobase+ 10;
      }
      if (this.peso < 30 && this.peso > 0){
          this.preciobase = preciobase+ 10;
      } else if (this.peso < 50 && this.peso > 30){
          this.preciobase = preciobase+ 60;
      } else if ( this.peso <80 && this.peso > 50){
          this.preciobase = preciobase+80;
      } else if (this.peso > 80){
          this.preciobase = preciobase+ 100;
      }
    return preciobase;
  }

    @Override
    public String toString() {
        return "Televison{" +
                "preciobase=" + preciobase +
                ", color=" + color +
                ", consumo=" + consumo +
                ", peso=" + peso +
                ", pulgadas=" + pulgadas +
                ", TDT=" + TDT +
                '}';
    }
}
