package U2.T1.EJ7;

import java.util.Scanner;

// Pedir 5 calificaciones de alumnos. El programa debe decir, al final, si hay algún suspenso o no
// lo hay.
// Nota: cuidado, si hay 2 suspensos, no debe decirlo dos veces.
public class Tarea12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Escribe las 5 califiaciones: ");
    int n = sc.nextInt();
    int cont = 1;
    int suspensos = 0;
    while (cont != 5) {
      if (n <= 4) {
        suspensos++;
      }
      cont++;
      n = sc.nextInt();
    }
    System.out.println("Hay " + suspensos + " suspensos");
  }
}
