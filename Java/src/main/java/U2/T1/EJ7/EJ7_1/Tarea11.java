package U2.T1.EJ7.EJ7_1;

import java.util.Scanner;

public class Tarea11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Escribe la altura de la X");
    int h = sc.nextInt();
    int espacio_m = h - 2;
    int espacio_p = 0;
    for (int i = 1; i <= h; i++) {
      if (i <= h / 2) {
        for (int j = 1; j <= espacio_p; j++) {
          System.out.print(" ");
        }
        System.out.print("*");
        for (int j = 1; j <= espacio_m; j++) {
          System.out.print(" ");
        }
        System.out.print("*");
        System.out.println();
        espacio_m -= 2;
        espacio_p++;
      }
      if (i == (h / 2) + 1) {
        for (int j = 1; j <= espacio_p; j++) {
          System.out.print(" ");
        }
        System.out.println("*");
      }
      if (i > ((h / 2) + 1)) {
        espacio_m += 2;
        espacio_p--;
        for (int j = 1; j <= espacio_p; j++) {
          System.out.print(" ");
        }
        System.out.print("*");
        for (int j = 1; j <= espacio_m; j++) {
          System.out.print(" ");
        }
        System.out.print("*");
        System.out.println();
      }
    }
  }
}
