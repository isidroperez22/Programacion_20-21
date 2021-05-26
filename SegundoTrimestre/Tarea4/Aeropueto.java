package SegundoTrimestre.Tarea4;

import java.util.Arrays;

// Crear una clase Aereopuerto para gestionar los vuelos. De los
// aeropuertos necesitamos guardar (al menos):
//  El nombre del aeropuerto.
//  La lista de vuelos del aeropuerto.
// Necesitare además, para definir el comportamiento:
// método para añadir vuelos al aeropuerto (debemos comprobar
// que el vuelo sale del mismo aeropuerto al que los estamos
// añadiendo)
//  Método para eliminar vuelos de un aeropuerto. Debera comprobar
// que el vuelo existe
//  Metodo para mostrar los vuelos de una determinada fecha que
// pasare como parámetro. Si no hay vuelos ese día mostrará un
// mensaje con esa informacion.
// Crear en un Main.java dos vuelos con 2 aeropuertos cada uno con 2
// vuelos con 2 pasajeros cada uno. Utilizar al menos una vez los métodos
// solicitados para aeropuerto
public class Aeropueto {
  private String nombre;
  private Vuelo[] vuelos;

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public Vuelo[] getVuelos() {
    return vuelos;
  }

  public void setVuelos(Vuelo[] vuelos) {
    this.vuelos = vuelos;
  }

  public Aeropueto(String nombre) {
    this.nombre = nombre;
    this.vuelos = new Vuelo[0];
  }

  public void addVuelos(Vuelo vuelo) {
    if (vuelo.getAirport_o().equals(getNombre())) {
      setVuelos(Arrays.copyOf(getVuelos(), getVuelos().length + 1));
      getVuelos()[getVuelos().length - 1] = vuelo;
      System.out.println("Vuelo añadido");
    } else {
      System.out.println("Error ese vuelo no sale de este aeropuerto");
    }
  }

  public void delVuelos(Vuelo vuelo) {
    for (int i = 0; i < getVuelos().length; i++) {
      if (getVuelos()[i].equals(vuelo)) {
        for (int j = 0; j < getVuelos().length; j++) {
          getVuelos()[i] = getVuelos()[j];
        }
        setVuelos(Arrays.copyOf(getVuelos(), getVuelos().length - 1));
        System.out.println("Vuelo eliminado");
        break;
      } else {
        System.out.println("Ese vuelo no esta en la lista");
        break;
      }
    }
  }

  public void mostrarVuelos(String fecha) {
    Vuelo[] vueloFecha = new Vuelo[0];
    for (int i = 0; i < getVuelos().length; i++) {
      if (getVuelos()[i].getFecha().equals(fecha)) {
        vueloFecha = Arrays.copyOf(vueloFecha, vueloFecha.length + 1);
        vueloFecha[vueloFecha.length - 1] = getVuelos()[i];
      }
    }
    System.out.println(Arrays.toString(vueloFecha));
  }

  @Override
  public String toString() {
    return "Aeropueto{" + "nombre='" + nombre + '\'' + ", vuelos=" + Arrays.toString(vuelos) + '}';
  }
}
