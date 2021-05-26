package SegundoTrimestre.Tarea8;

import java.io.Serializable;
import java.util.Objects;

public class Oferta implements Serializable, Comparable<Oferta> {
  private Persona persona;
  private double importe;

  public Oferta(Persona persona, double importe) {
    this.persona = persona;
    this.importe = importe;
  }

  public Persona getPersona() {
    return persona;
  }

  public void setPersona(Persona persona) {
    this.persona = persona;
  }

  public double getImporte() {
    return importe;
  }

  public void setImporte(double importe) {
    this.importe = importe;
  }

  @Override
  public String toString() {
    return "Oferta{" + "persona=" + persona + ", importe=" + importe + '}';
  }

  @Override
  public int compareTo(Oferta o) {
    return compareTo(o);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Oferta)) return false;
    Oferta oferta = (Oferta) o;
    return Double.compare(oferta.importe, importe) == 0 && Objects.equals(persona, oferta.persona);
  }
}
