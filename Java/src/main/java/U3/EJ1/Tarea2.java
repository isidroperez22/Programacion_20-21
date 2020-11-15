package U3.T1.EJ1;

import java.util.Scanner;

// Diseñar una  función a la que se le pasen dos enteros y muestre todos los números comprendidos
// entre ellos.
public class Tarea2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Escribe dos numeros: ");
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();

    entre(n1, n2);
  }

  public static void entre(int n, int n1) {
    for (int i = n; i <= n1; i++) {
      System.out.print(i + " ");
    }
  }
}
