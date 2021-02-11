package U5.Entregable2021;

import java.util.Arrays;

public abstract class Deporte {
  String nombre;
  String pabellon;
  Participante[] Participantes;
  int n_participante = 0;

  public Deporte(String nombre, String pabellon) {
    this.nombre = nombre;
    this.pabellon = pabellon;
    Participantes = new Participante[n_participante];
  }

  void add_participante(Object o) {
    Participantes = Arrays.copyOf(Participantes, Participantes.length + 1);
    Participantes[++n_participante] = (Participante) o;
  }

  void del_participante(Object o) {
    for (int i = 0; i < Participantes.length; i++) {}
  }
}
