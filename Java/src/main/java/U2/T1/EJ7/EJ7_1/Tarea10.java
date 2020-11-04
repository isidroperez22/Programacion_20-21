package U2.T1.EJ7.EJ7_1;

import java.util.Scanner;

public class Tarea10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Escibre la altura de la barra");
    int n = sc.nextInt();
    for (int i = 1; i < n; i++) {
      for (int j = 1; j <= n; j++) {
        if ((j == 1) || (j == n)) {
          System.out.print("*");
        } else {
          System.out.printf(" ");
        }
      }
      System.out.println("");
    }
    for (int i = 1; i <= n; i++) {
      if ((i == 1) || (i == n)) {
        System.out.printf(" ");
      } else {
        System.out.printf("*");
      }
    }
  }
}
