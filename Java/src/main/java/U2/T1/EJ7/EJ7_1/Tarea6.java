package U2.T1.EJ7.EJ7_1;

import java.util.Scanner;

public class Tarea6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Escribe la altura: ");
    int altura = sc.nextInt();
    System.out.println("Escribe el caracter: ");
    String relleno = sc.next();
    int espacioP = altura - 1;
    int espaciosM = 0;
    for (int i = 1; i <= altura - 1; i++) {
      for (int j = 0; j < espacioP; j++) {
        System.out.print(" ");
      }
      System.out.print(relleno);
      for (int j = 1; j < espaciosM; j++) {
        System.out.print(" ");
      }
      if (i > 1) {
        System.out.print(relleno);
      }
      System.out.println();
      espacioP--;
      espaciosM = espaciosM + 2;
    }
    for (int j = 1; j <= espaciosM + 1; j++) {
      System.out.print(relleno);
    }
  }
}
