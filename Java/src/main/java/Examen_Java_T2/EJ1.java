package Examen_Java_T2;

import java.util.Scanner;

public class EJ1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Escribe la altura: ");
    int altura = sc.nextInt();
    int espacioP = altura - 1;
    int espaciosM = 0;
    int n = 2;
    int nbase = 1;
    for (int i = 1; i <= altura - 1; i++) {
      for (int j = 0; j < espacioP; j++) {
        System.out.print(" ");
      }
      System.out.print(1);
      for (int j = 1; j < espaciosM; j++) {
        System.out.print(n);
        if (j > (espaciosM - 1) / 2) {
          n--;
        } else {
          n++;
        }
      }
      if (i > 1) {
        System.out.print(n);
      }
      n = 2;
      System.out.println();
      espacioP--;
      espaciosM = espaciosM + 2;
    }
    for (int j = 1; j <= espaciosM + 1; j++) {

      System.out.print(nbase);
      if (j >= (espaciosM + 2) / 2) {
        nbase--;
      } else {
        nbase++;
      }
    }
  }
}
