package SegundoTrimestre.Tarea4;

import java.util.Arrays;
import java.util.Objects;

public class Vuelo {
  private Avion avion;
  private String fecha;
  private String airport_o;
  private String airport_d;
  private static Pasajero[] pasajeros = new Pasajero[1];

  public Vuelo(Avion avion, String fecha, String airport_o, String airport_d, Pasajero pasajeros) {
    this.avion = avion;
    this.fecha = fecha;
    this.airport_o = airport_o;
    this.airport_d = airport_d;
    getPasajeros()[0] = pasajeros;
  }

  public Avion getAvion() {
    return avion;
  }

  public void setAvion(Avion avion) {
    this.avion = avion;
  }

  public String getFecha() {
    return fecha;
  }

  public void setFecha(String fecha) {
    this.fecha = fecha;
  }

  public String getAirport_o() {
    return airport_o;
  }

  public void setAirport_o(String airport_o) {
    this.airport_o = airport_o;
  }

  public String getAirport_d() {
    return airport_d;
  }

  public void setAirport_d(String airport_d) {
    this.airport_d = airport_d;
  }

  public Pasajero[] getPasajeros() {
    return pasajeros;
  }

  public void setPasajeros(Pasajero[] pasajeros) {
    this.pasajeros = pasajeros;
  }

  public void addPassenger(Pasajero pasajero) {
    for (int i = 0; i < getPasajeros().length; i++) {
      if (pasajero.equals(getPasajeros()[i])) {
        System.out.println("Error, ese pasajero ya esta listado");
        break;
      } else if (i + 1 == getPasajeros().length) {
        setPasajeros(Arrays.copyOf(getPasajeros(), getPasajeros().length + 1));
        getPasajeros()[getPasajeros().length - 1] = pasajero;
        System.out.println("Pasajero añadido");
        break;
      }
    }
  }

  public void delPassenger(int pasporte) {
    for (int i = 0; i < getPasajeros().length; i++) {
      if (pasporte == getPasajeros()[i].getN_pasaporte()) {
        for (int j = i + 1; j < getPasajeros().length; j++) {
          getPasajeros()[i] = getPasajeros()[j];
        }
      }
    }
    System.out.println("Pasajero eliminado");
    setPasajeros(Arrays.copyOf(getPasajeros(), getPasajeros().length - 1));
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Vuelo)) return false;
    Vuelo vuelo = (Vuelo) o;
    return Objects.equals(avion, vuelo.avion)
        && Objects.equals(fecha, vuelo.fecha)
        && Objects.equals(airport_o, vuelo.airport_o)
        && Objects.equals(airport_d, vuelo.airport_d);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avion, fecha, airport_o, airport_d);
  }

  public void listPassengers() {
    System.out.println(Arrays.toString(getPasajeros()));
  }
}
