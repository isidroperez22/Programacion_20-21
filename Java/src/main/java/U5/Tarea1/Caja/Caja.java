package U5.Tarea1.Caja;

public class Caja {
  double ancho;
  double alto;
  double fondo;
  Unidades u;
  String etiqueta;
  double volumen;

  public Caja(double ancho, double alto, double fondo, Unidades u) {
    this.ancho = ancho;
    this.alto = alto;
    this.fondo = fondo;
    this.u = u;
    if (u == Unidades.CM) {
      volumen = ancho * alto * fondo;
    } else if (u == Unidades.M) {
      volumen = (ancho / 100) * (alto / 100) * (fondo / 100);
    }
  }

  public Caja(double ancho, double alto, double fondo) {}

  public double getVolumen() {
    return volumen;
  }

  @Override
  public String toString() {
    return "Caja{"
        + "ancho="
        + ancho
        + ", alto="
        + alto
        + ", fondo="
        + fondo
        + ", u="
        + u
        + ", volumen="
        + volumen
        + '\''
        + ", etiqueta='"
        + etiqueta
        + '}';
  }
}
