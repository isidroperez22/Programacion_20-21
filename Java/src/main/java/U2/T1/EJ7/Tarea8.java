package U2.T1.EJ7;

import java.util.Scanner;

public class Tarea8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Escribe un numero: ");
    int n = sc.nextInt();
    int f = 1;
    while (n != 0) {
      f = f * n;
      n--;
    }
    System.out.println(f);
  }
}
