package SegundoTrimestre.Tarea1;
// Implementar la siguientes clases decidiendo los tipos de datos
// correctos, con lo métodos solicitados e implementando los métodos
// como consideres oportuno (puede ser simplemente un mostrar un
// mensaje). Reflexiona y repasa los conceptos Clase, Objeto, Atributos,
// Visibilidad de Atributos.
// Deberéis explicar en los comentarios todas las decisiones tomadas.
// Clase Avión:
// Propiedades: Aerolinea, Longitud, Modelo, ModoVuelo que podra
// tomar los siguiente valores (MANUAL, CRUCERO,
// PILOTO_AUTOMATICO)
//  Comportamiento: despegar(), aterrizar(), volar()
// Clase Pasajero:
//  Propiedades: Nombre,Dirección y número de pasaporte y estado
// (EMBARCADO, PENDIENTE)
//  Comportamiento: embarcar() , sonreir() , andar()
// Además de los métodos solicitados deberéis implementar los
// constructores que consideréis oportunos, los getter/setter, equals y el
// método toString() para ambas clases.
// Crear en un Main.java dos objetos de la clase avión y 5 objetos de la
// clase Pasajero. Utilizar para cada objeto algún método de los
// implementados.
public class main {
  public static void main(String[] args) {
    Avion a = new Avion("Iberia", 20.0, "Uno", ModoVuelo.MANUAL);
    Avion a1 = new Avion("Otra", 31.2, "AH1", ModoVuelo.PILOTO_AUTOMATICO);
    Pasajero p1 = new Pasajero("Isidro", "Rotonda N1", 12345690);
    System.out.println(p1.toString());
    p1.andar();
    p1.embarcar(a1);
    System.out.println(p1.toString());
    p1.sonrie();
    a.despegar();
    a.volar();
    a.aterrizar();
  }
}
