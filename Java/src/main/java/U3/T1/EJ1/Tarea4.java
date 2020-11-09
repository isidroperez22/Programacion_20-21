package U3.T1.EJ1;
// Diseñar una función que reciba como parámetros dos números enteros y que devuelva el mayor de los
// dos.
import java.util.Scanner;

public class Tarea4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Escribe dos numeros: ");
    int n = sc.nextInt();
    int x = sc.nextInt();
    mayor(n, x);
  }

  static void mayor(int n, int x) {
    if (n < x) {
      System.out.println(x + " es el mayor");
    } else if (n > x) {
      System.out.println(n + " es el mayor");
    } else {
      System.out.println("Son iguales");
    }
  }
}
