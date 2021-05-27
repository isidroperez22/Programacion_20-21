package ExamenRec2T2021_Isidro.Tarea2;

import java.util.LinkedList;
import java.util.List;

public class Perro {
  private Integer pin;
  private String f_nacimineto;
  private String nombre;
  private int peso;
  List<Consultas> ListaConsultas = new LinkedList<>();

  public Perro(int pin, String f_nacimineto, String nombre, int peso) {
    this.pin = pin;
    this.f_nacimineto = f_nacimineto;
    this.nombre = nombre;
    this.peso = peso;
  }

  public int getPin() {
    return pin;
  }

  public void setPin(int pin) {
    this.pin = pin;
  }

  public String getF_nacimineto() {
    return f_nacimineto;
  }

  public void setF_nacimineto(String f_nacimineto) {
    this.f_nacimineto = f_nacimineto;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getPeso() {
    return peso;
  }

  public void setPeso(int peso) {
    this.peso = peso;
  }

  public List<Consultas> getListaConsultas() {
    return ListaConsultas;
  }

  public void setListaConsultas(List<Consultas> listaConsultas) {
    ListaConsultas = listaConsultas;
  }

  public void addConsulta(Consultas consultas) {
    getListaConsultas().add(consultas);
    System.out.println("Consulta añadida");
  }

  public void delConsultas(Consultas consultas) {
    getListaConsultas().remove(consultas);
    System.out.println("Consulta eliminada");
  }

  @Override
  public String toString() {
    return "Perro{"
        + "pin="
        + pin
        + ", f_nacimineto='"
        + f_nacimineto
        + '\''
        + ", nombre='"
        + nombre
        + '\''
        + ", peso="
        + peso
        + ", ListaConsultas="
        + ListaConsultas
        + '}';
  }
}
