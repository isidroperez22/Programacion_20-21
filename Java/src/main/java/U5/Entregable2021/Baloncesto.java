package U5.Entregable2021;

public class Baloncesto extends Deporte {
  int n_equipos;

  public int getN_equipos() {
    return n_equipos;
  }

  public void setN_equipos(int n_equipos) {
    this.n_equipos = n_equipos;
  }

  public Baloncesto(String nombre, String pabellon, Participante[] participantes, int n_equipos) {
    super(nombre, pabellon, participantes);
    setN_equipos(n_equipos);
  }
}
