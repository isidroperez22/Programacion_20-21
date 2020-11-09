package U3.T1.EJ1;

import java.util.Scanner;
// Repetir el ejercicio anterior con una versión que calcule el máximo de 3 números. Piensa un poco,
// no hagas el
// algoritmo de comparación de los 3 números desde cero.
public class Tarea5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Escribe dos numeros: ");
    int n = sc.nextInt();
    int x = sc.nextInt();
    int i = sc.nextInt();
    mayor1(mayor(n, x), i);
  }

  static int mayor(int n, int x) {
    int resultado = 0;
    if (n < x) {
      resultado = x;
      ;
    } else if (n > x) {
      resultado = n;
    } else {
      System.out.println("Son iguales");
    }
    return resultado;
  }

  static void mayor1(int n, int x) {
    if (n < x) {
      System.out.println(x + " es el mayor");
    } else if (n > x) {
      System.out.println(n + " es el mayor");
    } else {
      System.out.println("Son iguales");
    }
  }
}
