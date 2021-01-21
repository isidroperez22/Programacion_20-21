package U4.Tarea1.Pizzeria;

public class Ingrendiente {
  private String nombre;
  private int calorias;

  public Ingrendiente() {
    this.nombre = "Queso";
    this.calorias = 250;
  }

  public Ingrendiente(String nombre, int calorias) {
    this.nombre = nombre;
    this.calorias = calorias;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getCalorias() {
    return calorias;
  }

  public void setCalorias(int calorias) {
    this.calorias = calorias;
  }

  @Override
  public String toString() {
    return "Ingrendiente{" + "nombre='" + nombre + '\'' + ", calorias=" + calorias + '}';
  }
}
