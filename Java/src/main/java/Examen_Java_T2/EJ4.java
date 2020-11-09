package Examen_Java_T2;

import java.util.Scanner;

public class EJ4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String notas = "doremifasollasi";

    int n = (int) (Math.random() * 24 + 4);
    while (n / 4 == 0) {
      n = (int) (Math.random() * 24 + 4);
    }
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= 4; j++) {
        int nota = (int) (Math.random() * 14 + 2);
        System.out.print(notas);
      }

      System.out.print(" | ");
    }
  }
}
