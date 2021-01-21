package U4.Tarea1.Entregable2021;

public class Personaje {
  private ListaPersonaje personajes;
  private double velocidad;
  private int danio_punio;
  private int danio_patada;

  public ListaPersonaje getPersonajes() {
    return personajes;
  }

  public void setPersonajes(ListaPersonaje personajes) {
    this.personajes = personajes;
  }

  public double getVelocidad() {
    return velocidad;
  }

  public void setVelocidad(double velocidad) {
    this.velocidad = velocidad;
  }

  public int getDanio_punio() {
    return danio_punio;
  }

  public void setDanio_punio(int danio_punio) {
    this.danio_punio = danio_punio;
  }

  public int getDanio_patada() {
    return danio_patada;
  }

  public void setDanio_patada(int danio_patada) {
    this.danio_patada = danio_patada;
  }

  public Personaje() {
    setPersonajes(ListaPersonaje.SONIC);
    setVelocidad(100.0);
    setDanio_punio(100);
    setDanio_patada(200);
  }

  public Personaje(ListaPersonaje personajes, double velocidad, int danio_punio, int danio_patada) {
    this.personajes = personajes;
    this.velocidad = velocidad;
    this.danio_punio = danio_punio;
    this.danio_patada = danio_patada;
  }

  @Override
  public String toString() {
    return "Personaje{"
        + "personajes="
        + personajes
        + ", velocidad="
        + velocidad
        + ", daño_punio="
        + danio_punio
        + ", daño_patada="
        + danio_patada
        + '}';
  }
}
