package U5.Entregable2021;

public class Atletismo extends Deporte {
  int n_pruebas = 0;

  public int getN_pruebas() {
    return n_pruebas;
  }

  public void setN_pruebas(int n_pruebas) {
    this.n_pruebas = n_pruebas;
  }

  void add_prueba() {}

  public Atletismo(String nombre, String pabellon, int n_pruebas) {
    super(nombre, pabellon);
    setN_pruebas(n_pruebas);
  }
}
