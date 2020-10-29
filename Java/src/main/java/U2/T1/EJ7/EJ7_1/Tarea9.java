package U2.T1.EJ7.EJ7_1;

import java.util.Scanner;

public class Tarea9 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= (n + 1) / 2; j++) {
        if (i == n) {
          System.out.printf("*");
        }
      }
      System.out.println("*");
    }
  }
}
