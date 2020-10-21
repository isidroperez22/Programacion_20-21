package U2.T1.EJ6;

import java.util.Scanner;

public class Tarea1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.printf("Escribe dos numeros: ");
    int a = sc.nextInt();
    int b = sc.nextInt();

    System.out.printf("A vale " + ((b + a) - a));
    System.out.println("B vale " + ((b + a) - b));
  }
}
