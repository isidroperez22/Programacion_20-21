package U3.EJ3;

import java.util.Scanner;

// Queremos desarrollar una aplicación que nos ayude a gestionar las notas de un centro educativo.
// Cada clase está compuesta por 5 alumnos. Se pide leer las notas (números enteros) de cada uno de
// los alumnos en el primer trimestre, luego, las del segundo, y luego, las del tercero. Debemos
// mostrar, al final, la nota media del grupo en cada trimestre, y la media del alumno que se
// encuentra en la posición pos (que se lee por teclado). (Podéis hacerlo usando 3 vectores -uno por
// trimestre-, o usando una matriz bidimensional en la que las filas sean los trimestres y las
// columnas los alumnos).
public class Tarea7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Escribe las notas: ");
    int[][] notas = new int[5][3];
    for (int i = 0; i < notas.length; i++) {
      for (int j = 0; j < notas[i].length; j++) {
        notas[i][j] = sc.nextInt();
      }
    }
    for (int i = 0; i < notas.length; i++) {
      System.out.print("Notas del alumno " + (i + 1) + ": ");
      for (int j = 0; j < notas[2].length; j++) {
        System.out.print(notas[i][j] + " ");
      }
      System.out.println();
    }
  }
}
