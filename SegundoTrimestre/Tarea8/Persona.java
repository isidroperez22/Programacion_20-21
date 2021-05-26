package SegundoTrimestre.Tarea8;

public class Persona {
  String NIF;
  String Nombre;

  public Persona(String NIF, String nombre) {
    this.NIF = NIF;
    Nombre = nombre;
  }

  public String getNIF() {
    return NIF;
  }

  public void setNIF(String NIF) {
    this.NIF = NIF;
  }

  public String getNombre() {
    return Nombre;
  }

  public void setNombre(String nombre) {
    Nombre = nombre;
  }

  @Override
  public String toString() {
    return "Persona{" + "NIF='" + NIF + '\'' + ", Nombre='" + Nombre + '\'' + '}';
  }
}
