package U2.T1.EJ3;

import java.util.Scanner;

public class Tarea4 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Escribe un numero decimal:");
    double n = teclado.nextDouble();
    System.out.println(Math.round(n));
  }
}
