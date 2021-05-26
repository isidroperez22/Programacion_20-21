package SegundoTrimestre.Tarea7;

public class Revistas extends Publicacion {
  private int num;

  public Revistas(String fechaCompra, String ISBN, String titulo, int publicacion, int num) {
    super(fechaCompra, ISBN, titulo, publicacion);
    this.num = num;
  }

  public int getNum() {
    return num;
  }

  public void setNum(int num) {
    this.num = num;
  }

  @Override
  public String toString() {
    return "Revistas{" + "fechaCompra='" + fechaCompra + '\'' + ", num=" + num + '}';
  }
}
