package U2.T1.EJ2;

import java.util.Scanner;

// Ejercicio3-2: Crea un programa que pida al usuario su año de nacimiento y el año actual (usando
// datos de tipo short) y
// halle la diferencia de ambos para obtener su edad.
public class Tarea2 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce tu fecha de nacimiento");
    short x = teclado.nextShort();
    System.out.println("Introduce el año actual");
    short i = teclado.nextShort();
    System.out.println("Tu edad es " + (i - x) + " años");
  }
}
