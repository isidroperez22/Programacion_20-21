package U3.EJ3;

import java.util.Scanner;

public class Tarea1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce 5 numeros");
    double[] a = new double[5];
    for (int i = 0; i <= a.length - 1; i++) {
      a[i] = sc.nextDouble();
    }
    System.out.print("Los numeros son ");
    for (int i = 0; i <= a.length - 1; i++) {
      System.out.print(a[i] + " ");
    }
  }
}
