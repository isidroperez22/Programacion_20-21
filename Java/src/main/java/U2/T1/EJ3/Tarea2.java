package U2.T1.EJ3;

import java.util.Scanner;

public class Tarea2 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Escribe dos numeros para calcular la media: ");
    int x = teclado.nextInt();
    int n = teclado.nextInt();
    System.out.println((n + x) / 2);
  }
}
