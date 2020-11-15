package U3.T1.EJ1;

import java.util.Scanner;

// Escribir una función que decida si dos números enteros positivos son amigos. Dos números son
// amigos si la suma de los
// divisores propios (distinto de él mismo) del primer número es igual al segundo número, y
// viceversa.
// Ejemplos: (220 - 284), (1184 - 1210)
public class Tarea10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.printf("Escribe dos numero: ");
    int x = sc.nextInt();
    int n = sc.nextInt();
    son_amigos(x, n);
  }

  static void son_amigos(int n, int x) {
    int total_x = 0;
    int total_n = 0;
    for (int i = 1; i < n; i++) {
      if (n % i == 0) {
        total_n = total_n + i;
      }
    }
    for (int i = 1; i < x; i++) {
      if (x % i == 0) {
        total_x = total_x + i;
      }
    }
    if (total_x == n && total_n == x) {
      System.out.print(total_n + " " + total_x + " son amigos");
    } else {
      System.out.print(total_n + " " + total_x + " no son amigos");
    }
  }
}
