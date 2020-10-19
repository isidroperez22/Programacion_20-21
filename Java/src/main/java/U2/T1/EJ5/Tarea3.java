package U2.T1.EJ5;

import java.util.Scanner;

public class Tarea3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.printf("Dime un numero: ");
    int x = sc.nextInt();
    int i;
    if (x % 2 == 0) {
      i = 1;
      System.out.printf("Es par por tanto i vale " + i);
    } else {
      i = 0;
      System.out.printf("Es impar por tanto i vale " + i);
    }
  }
}

class tarea3_2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.printf("Dime un numero: ");
    int x = sc.nextInt();
    int i = (x % 2 == 0) ? 1 : 0;
    System.out.printf("i vale " + i);
  }
}
