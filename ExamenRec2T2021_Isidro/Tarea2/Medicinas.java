package ExamenRec2T2021_Isidro.Tarea2;

public class Medicinas {
  private String nombre;
  private int cantidad;
  private double precio;

  public Medicinas(String nombre, int cantidad, double precio) {
    this.nombre = nombre;
    this.cantidad = cantidad;
    this.precio = precio;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getCantidad() {
    return cantidad;
  }

  public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  @Override
  public String toString() {
    return "Medicinas{"
        + "nombre='"
        + nombre
        + '\''
        + ", cantidad="
        + cantidad
        + ", precio="
        + precio
        + '}';
  }
}
