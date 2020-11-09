package U3.T1.EJ1;

import java.util.Scanner;

public class Tarea1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Escribe cuantas veces quieres que poner Eco");
    int n = sc.nextInt();
    Eco(n);
  }

  static void Eco(int n) {
    for (int i = 1; i <= n; i++) {
      System.out.print("Eco ");
    }
  }
}
