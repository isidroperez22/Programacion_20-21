package U5.Entregable2021;

public class Judo extends Deporte {
  int n_tatamis;

  public int getN_tatamis() {
    return n_tatamis;
  }

  public void setN_tatamis(int n_tatamis) {
    this.n_tatamis = n_tatamis;
  }

  public Judo(String nombre, String pabellon, Participante[] participantes, int n_tatamis) {
    super(nombre, pabellon, participantes);
    setN_tatamis(n_tatamis);
  }
}
