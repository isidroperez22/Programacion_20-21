package U4.Tarea1.Entregable2021;

public class Enemigo {
  private ListaEnemigo enemigos;
  private int Punto_vida;
  private int Punto_danio;

  public Enemigo(ListaEnemigo enemigos) {
    this.enemigos = enemigos;
    this.Punto_vida = 100;
    this.Punto_danio = 70;
  }

  int patada(Personaje personajes) {
    Punto_vida = 100;
    Punto_vida = Punto_vida - personajes.getDanio_patada();
    if (Punto_vida < 0) {
      Punto_vida = 0;
    }
    return Punto_vida;
  }

  int punio(Personaje personajes) {
    Punto_vida = 100;
    Punto_vida = Punto_vida - personajes.getDanio_punio();
    if (Punto_vida < 0) {
      Punto_vida = 0;
    }
    return Punto_vida;
  }

  @Override
  public String toString() {
    return "Enemigo{" + "Punto_vida=" + Punto_vida + '}';
  }
}
