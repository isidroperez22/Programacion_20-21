package SegundoTrimestre.Tarea3;

// Crear una clase Vuelo:
// Para dicha clase deberemos guardar (al menos):
//  El avión con el que se realiza el vuelo.
//  La fecha del vuelo.
//  El nombre del aeropuerto de origen
//  El nombre del aeropuerto de destino
//  La lista de pasajeros del vuelo.
// Además de los métodos básicos (constructores, getter / setters / equals)
// que consideréis oportunos debéis implementar el siguiente
// comportamiento:
//  Un método para añadir un pasajero al vuelo. addPassenger(). Se
// le pasará como parámetro un objeto pasajero. Si el pasajero ya
// estaba en la lista de pasajeros deberá mostrar un mensaje de
// error.
//  Un método para borrar un pasajero. delPassenger(). Se le pasará
// como parámetro el número de pasaporte del pasajero. Si el
// pasajero no estaba en la lista de pasajeros deberá mostrar un
// mensaje de error.
//  Un método que listPassengers() que muestre por pantalla la lista
// de pasajeros.
// Crear en un Main.java dos vuelos con 5 pasajeros cada uno. Utilizar al
// menos una vez los métodos solicitados para cada vuelo.
public class main {
  public static void main(String[] args) {
    Avion a1 = new Avion("Iberia", 89.0, "Uno grande", ModoVuelo.MANUAL);
    Avion a2 = new Avion("Iberia", 56.0, "Uno grande", ModoVuelo.PILOTO_AUTOMATICO);
    Pasajero p1 = new Pasajero("Rolando", "alli", 879798749);
    Pasajero p2 = new Pasajero("Kristiano", "palla", 875555555);
    Pasajero p3 = new Pasajero("Mesi", "no esta", 877777777);

    Vuelo v1 = new Vuelo(a2, "22/10/21", "Sevilla", "Londres", p1);
    v1.addPassenger(p2);
    v1.addPassenger(p3);
    v1.delPassenger(p2.n_pasaporte);
    v1.listPassengers();
  }
}
