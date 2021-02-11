package U5.Entregable2021;

public abstract class Participante {
  String nombre;
  int edad;
  Pais Pais;

  public Participante(String nombre, int edad, Pais Pais) {}

  abstract void hacerjuramento();
}
