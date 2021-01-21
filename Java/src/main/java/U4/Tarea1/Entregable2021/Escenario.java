package U4.Tarea1.Entregable2021;

import java.util.Arrays;

public class Escenario {
  private int altura;
  private int longitud;
  private int n_anillos;
  private int n_gemas;
  private ListaEnemigo[] Lista_enemigos;
  private Enemigo[] Tipo_enemigos;

  public Escenario() {
    Enemigo[] enemigos = new Enemigo[10];
    Enemigo buzzBomber = new Enemigo(ListaEnemigo.BUZZ_BOMBER);
    Enemigo coconuts = new Enemigo(ListaEnemigo.COCONUTS);
    enemigos[0] = buzzBomber;
    enemigos[1] = coconuts;
    this.altura = 100;
    this.longitud = 100;
    this.n_anillos = 500;
    this.n_gemas = 2;
  }

  public Escenario(
      int altura,
      int longitud,
      int n_anillos,
      int n_gemas,
      ListaEnemigo[] lista_enemigos,
      Enemigo[] tipo_enemigos) {
    this.altura = altura;
    this.longitud = longitud;
    this.n_anillos = n_anillos;
    this.n_gemas = n_gemas;
    Lista_enemigos = lista_enemigos;
    Tipo_enemigos = tipo_enemigos;
  }

  public ListaEnemigo[] getLista_enemigos() {
    return Lista_enemigos;
  }

  public void setLista_enemigos(ListaEnemigo[] lista_enemigos) {
    Lista_enemigos = lista_enemigos;
  }

  void add_enemigo(ListaEnemigo Lista) {
    int num_enemigos = 0;
    if (num_enemigos < 10) {
      Tipo_enemigos[num_enemigos++] = new Enemigo(Lista);
    }
  }

  @Override
  public String toString() {
    return "Escenario{"
        + "altura="
        + altura
        + ", longitud="
        + longitud
        + ", n_anillos="
        + n_anillos
        + ", n_gemas="
        + n_gemas
        + ", Lista_enemigos="
        + Arrays.toString(Lista_enemigos)
        + ", Tipo_enemigos="
        + Arrays.toString(Tipo_enemigos)
        + '}';
  }
}
