package U2.T1.EJ7;
// Diseñar un programa que muestre, para cada número introducido por teclado, si es par, si es
// positivo, y su cuadrado.
// El proceso terminará cuando el número introducido por teclado sea 0.
import java.util.Scanner;

public class Tarea1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.printf("Introduce un numero: ");
    int n = sc.nextInt();
    while (n != 0) {
      if (n % 2 == 0) {
        System.out.println("Es par");
        System.out.println(n * n);
      } else {
        System.out.println("Es impar");
        System.out.println(n * n);
      }
      System.out.printf("Introduce otro numero: ");
      n = sc.nextInt();
    }
  }
}
