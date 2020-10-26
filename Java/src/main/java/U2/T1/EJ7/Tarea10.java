package U2.T1.EJ7;

import java.util.Scanner;

// Implementar una aplicación que pida un número al usuario entre el 1 y el 10, y calcule su tabla
// de multiplicar.
// El código debe asegurarse de que el número introducido está entre 1 y 10, y si no es así, volver
// a pedirlo hasta que lo cumpla.
public class Tarea10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.printf("Dime un numero entre el 1 y el 10");
    int n = sc.nextInt();
    while (n <= 0 || n >= 11) {
      n = sc.nextInt();
    }
    for (int i = 1; i <= 10; i++) {
      System.out.println(n + " x " + i + " = " + n * i);
    }
  }
}
