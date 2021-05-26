package SegundoTrimestre.Tarea2;
// Modificar las clases del ejercicio uno añadiendo los atributos y
// métodos de clase necesarios para controlar en todo momento el
// número de aviones y pasajeros que se han creado.
// Demostrar la utilización de estos atributos y/o métodos en un Main
// donde se creen 5 aviones y 10 pasajeros.
// Debemos mostrar el mensaje que nos indique cuántos objetos de cada
// clase hemos creado cada vez que creemos un objeto nuevo.
public class main {
  public static void main(String[] args) {
    Avion a1 = new Avion("Iberia", 89.0, "Uno grande", ModoVuelo.MANUAL);
    Avion a2 = new Avion("Iberia", 56.0, "Uno grande", ModoVuelo.PILOTO_AUTOMATICO);
    Pasajero p1 = new Pasajero("Rolando", "alli", 879798749);
    Pasajero p3 = new Pasajero("Kristiano", "palla", 875555555);
    Pasajero p2 = new Pasajero("Mesi", "no esta", 877777777);

    System.out.println("Hay " + Avion.getNum_aviones() + " aviones");
    System.out.println("Hay " + Pasajero.getNum_pasajeros() + " pasajeros");
  }
}
