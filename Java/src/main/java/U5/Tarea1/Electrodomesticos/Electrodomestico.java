package U5.Tarea1.Electrodomesticos;

public class Electrodomestico {
  double preciobase;
  Color color;
  ConsumoEnergetico consumo;
  double peso;

  public Electrodomestico() {
    this.preciobase = 100;
    this.color = Color.BLANCO;
    this.consumo = ConsumoEnergetico.F;
    this.peso = 5;
  }

  public Electrodomestico(double preciobase, double peso) {
    this.preciobase = preciobase;
    this.color = Color.BLANCO;
    this.consumo = ConsumoEnergetico.F;
    this.peso = peso;
  }

  public Electrodomestico(double preciobase, Color color, ConsumoEnergetico consumo, double peso) {
    this.preciobase = preciobase;
    this.color = color;
    this.consumo = consumo;
    this.peso = peso;
  }

  public double getPreciobase() {
    return preciobase;
  }

  public Color getColor() {
    return color;
  }

  public ConsumoEnergetico getConsumo() {
    return consumo;
  }

  public double getPeso() {
    return peso;
  }

  public double getPrecioFinal() {

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
    } else if (this.peso < 50 && this.peso > 29){
      this.preciobase = preciobase+ 60;
    } else if ( this.peso <80 && this.peso > 50){
      this.preciobase = preciobase+80;
    } else if (this.peso > 80){
      this.preciobase = preciobase+ 100;
    }
    return this.preciobase;
  }

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "precioFinal=" + preciobase +
                ", color=" + color +
                ", consumo=" + consumo +
                ", peso=" + peso +
                '}';
    }
}
