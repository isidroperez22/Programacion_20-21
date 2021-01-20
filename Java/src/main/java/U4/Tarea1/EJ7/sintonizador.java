package U4.Tarea1.EJ7;

public class sintonizador {
  double frecuencia = 80;

  public void up() {
    if (frecuencia > 107.5) {
      this.frecuencia = 80;
    } else {
      this.frecuencia = frecuencia + 0.5;
    }
  }

  public void down() {
    if (frecuencia < 80.5) {
      this.frecuencia = 108;
    } else {
      this.frecuencia = frecuencia - 0.5;
    }
  }

  public double display() {
    System.out.println(frecuencia);
    return frecuencia;
  }
}
