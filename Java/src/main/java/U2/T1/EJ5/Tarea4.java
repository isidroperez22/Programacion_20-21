package U2.T1.EJ5;

import java.util.Scanner;

public class Tarea4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.printf("Dime dos numeros ");
    byte c = sc.nextByte();
    byte x = sc.nextByte();
    int menor;
    if (x < c) {
      menor = x;
      System.out.printf("El menor es " + menor);
    } else if (c < x) {
      menor = c;
      System.out.printf("El menor es " + menor);
    } else {
      System.out.printf("Ninguno es menor que el otro");
    }
  }
}

class tarea4_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.printf("Dime dos numeros ");
    byte c = sc.nextByte();
    byte x = sc.nextByte();
    byte menor = c < x ? c : x;
    System.out.printf(menor + " es el menor");
  }
}
