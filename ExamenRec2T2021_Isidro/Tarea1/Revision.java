package ExamenRec2T2021_Isidro.Tarea1;

import java.util.Objects;

public class Revision {
  private String fecha;
  private Boolean buen_estado;
  private double precio;

  public Revision(String fecha, Boolean buen_estado, double precio) {
    this.fecha = fecha;
    this.buen_estado = buen_estado;
    this.precio = precio;
  }

  public String getFecha() {
    return fecha;
  }

  public void setFecha(String fecha) {
    this.fecha = fecha;
  }

  public Boolean getBuen_estado() {
    return buen_estado;
  }

  public void setBuen_estado(Boolean buen_estado) {
    this.buen_estado = buen_estado;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Revision)) return false;
    Revision revision = (Revision) o;
    return Double.compare(revision.precio, precio) == 0;
  }

  @Override
  public String toString() {
    return "Revision{"
        + "fecha='"
        + fecha
        + '\''
        + ", buen_estado="
        + buen_estado
        + ", precio="
        + precio
        + '}';
  }

  @Override
  public int hashCode() {
    return Objects.hash(precio);
  }
}
