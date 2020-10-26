package U2.T1.EJ9;
// Introducir por teclado dos palabras e indicar cuál de
// ellas es la más corta.

import java.util.Scanner;

public class Tarea1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.printf("Escribe dos palabras: ");
    String t1 = sc.next();
    String t2 = sc.next();
    if (t1.length() > t2.length()) {
      System.out.printf(t1 + " es mas larga");
    } else if (t1.length() < t2.length()) {
      System.out.printf(t2 + " es mas larga");
    } else {
      System.out.printf("Son igual de largas");
    }
  }
}
