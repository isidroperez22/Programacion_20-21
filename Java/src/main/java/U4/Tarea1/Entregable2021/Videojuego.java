package U4.Tarea1.Entregable2021;

import java.util.Date;

public class Videojuego {
  private Personaje personajes;
  private Escenario escenarios;
  private Date d = new Date();
  private String ip = "192.168.0.1";

  public Videojuego(Personaje personajes, Escenario escenarios, Date d) {
    this.personajes = personajes;
    this.escenarios = escenarios;
    this.d = d;
    this.ip = ip;
  }

  @Override
  public String toString() {
    return "Videojuego{"
        + "personajes="
        + personajes
        + ", escenarios="
        + escenarios
        + ", d="
        + d
        + ", ip="
        + ip
        + '}';
  }
}
