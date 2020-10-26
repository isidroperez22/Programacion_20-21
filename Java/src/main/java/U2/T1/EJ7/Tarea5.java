package U2.T1.EJ7;
// Desarrollar un programa que solicite los valores mínimo y máximo de un rango. A continuación,
// solicitará por teclado un valor que debe estar dentro del rango. Si no es asi, volverá a
// solicitar un número, y así repetidas veces hasta que el valor esté dentro del rango.

import java.util.Scanner;

public class Tarea5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce el valor maximo y el valor minimo");
    int min = sc.nextInt();
    int max = sc.nextInt();
    System.out.println("Introduce un valor en el rango: ");
    int n = sc.nextInt();
    while (min < n && n > max) {
      System.out.println("Por favor dentro del rango");
      n = sc.nextInt();
    }
  }
}
