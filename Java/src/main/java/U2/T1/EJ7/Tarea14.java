package U2.T1.EJ7;
// Pedir un número n y dibujar un triángulo rectángulo de n elementos de lado, utilizando para ello
// asteriscos (*).
// Por ejemplo, para n=4:
import java.util.Scanner;

public class Tarea14 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Escribe un numero");
    int n = sc.nextInt();
    for (int i = 1; i <= n; i++) {
      for (int j = n; j >= i; j--) {
        System.out.print("*");
      }
      System.out.println(" ");
    }
  }
}
