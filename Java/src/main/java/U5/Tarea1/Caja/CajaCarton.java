package U5.Tarea1.Caja;

public class CajaCarton extends Caja {
  double volumenCajaCarton;
  int etiqueta;
  double superficie;

  public CajaCarton(double ancho, double alto, double fondo) {
    super(ancho, alto, fondo);
    this.u = Unidades.CM;
    volumenCajaCarton = (ancho * alto * fondo);
    superficie = 2 * (ancho * alto * fondo);
  }

  public double getVolumenCajaCarton() {
    return volumenCajaCarton * 0.8;
  }

  @Override
  public String toString() {
    return "CajaCarton{"
        + "Superficie "
        + superficie
        + " volumenCajaCarton="
        + getVolumenCajaCarton()
        + ", etiqueta="
        + etiqueta
        + '}';
  }
}
