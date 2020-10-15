package U2.T1.EJ2;

import java.util.Scanner;

// Ejercicio3-3: Crea un programa que calcule y muestre la división de dos números reales de doble
// precisión
// introducidos por el usuario.
public class Tarea3 {
  public static void main(String[] args) {
    Scanner tecaldo = new Scanner(System.in);
    double x = tecaldo.nextDouble();
    double i = tecaldo.nextDouble();
    System.out.println(x / i);
  }
}
