package ExamenRec2T2021_Isidro.Tarea1;

public abstract class Altavoz {
  private int n_serie;
  private double altura;
  private double anchura;
  // private Revision[] revision;
  private static int num_alatvoces;

  public Altavoz(int n_serie, double altura, double anchura) {
    this.n_serie = n_serie;
    this.altura = altura;
    this.anchura = anchura;
    num_alatvoces++;
  }

  public static int getNum_alatvoces() {
    return num_alatvoces;
  }

  public static void setNum_alatvoces(int num_alatvoces) {
    Altavoz.num_alatvoces = num_alatvoces;
  }

  public int getN_serie() {
    return n_serie;
  }

  public void setN_serie(int n_serie) {
    this.n_serie = n_serie;
  }

  public double getAltura() {
    return altura;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }

  public double getAnchura() {
    return anchura;
  }

  public void setAnchura(double anchura) {
    this.anchura = anchura;
  }

  @Override
  public String toString() {
    return "Altavoz{" + "n_serie=" + n_serie + ", altura=" + altura + ", anchura=" + anchura + '}';
  }
}
