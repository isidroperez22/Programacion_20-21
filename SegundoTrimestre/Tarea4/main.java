package SegundoTrimestre.Tarea4;
// Crear una clase Aereopuerto para gestionar los vuelos. De los
// aeropuertos necesitamos guardar (al menos):
//  El nombre del aeropuerto.
//  La lista de vuelos del aeropuerto.
// Necesitaré además, para definir el comportamiento:
//  método para añadir vuelos al aeropuerto (debemos comprobar
// que el vuelo sale del mismo aeropuerto al que los estamos
// añadiendo)
//  Método para eliminar vuelos de un aeropuerto. Deberá comprobar
// que el vuelo existe
//  Método para mostrar los vuelos de una determinada fecha que
// pasaré como parámetro. Si no hay vuelos ese día mostrará un
// mensaje con esa información.
// Crear en un Main.java dos vuelos con 2 aeropuertos cada uno con 2
// vuelos con 2 pasajeros cada uno. Utilizar al menos una vez los métodos
// solicitados para aeropuerto
public class main {
  public static void main(String[] args) {
    Avion a1 = new Avion("Iberia", 89.0, "Uno grande", ModoVuelo.MANUAL);
    Avion a2 = new Avion("Iberia", 56.0, "Uno grande", ModoVuelo.PILOTO_AUTOMATICO);
    Pasajero p1 = new Pasajero("Rolando", "alli", 879798749);
    Pasajero p3 = new Pasajero("Kristiano", "palla", 875555555);
    Pasajero p2 = new Pasajero("Mesi", "no esta", 877777777);
    Vuelo v1 = new Vuelo(a2, "22/10/2021", "Sevilla", "Barcelona", p1);
    Vuelo v2 = new Vuelo(a1, "2/1/2022", "Sevilla", "Londres", p3);
    Aeropueto air1 = new Aeropueto("Sevilla");
    Aeropueto air2 = new Aeropueto("Madrid");
    air1.addVuelos(v2);
    air1.addVuelos(v1);
    air1.mostrarVuelos("22/10/2021");
    air1.delVuelos(v2);
    System.out.println(air1.toString());
  }
}
