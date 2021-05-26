package SegundoTrimestre.Tarea6;

public class Revistas extends Publicacion {
  private int num;

  public Revistas(String ISBN, String titulo, int publicacion, int num) {
    super(ISBN, titulo, publicacion);
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
    return "Revistas{" + "num=" + num + '}';
  }
}
