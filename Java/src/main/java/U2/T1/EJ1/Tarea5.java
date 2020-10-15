package U2.T1.EJ1;

import java.util.Scanner;
// Ejercicio2-5: Crea un programa que pida al usuario una temperatura en grados centígrados y
// calcule (y muestre) a
// cuántos grados Fahrenheit equivalen (F = 9*C/5 + 32).
public class Tarea5 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    float x = teclado.nextFloat();
    System.out.print("Introduce la temperatura: ");
    System.out.println();
    System.out.println("Equivale a: " + (9 * x / 5 + 32) + " ºF");
  }
}
