package U3.Entregable_T3;
// Hacer una algoritmo que solicite al usuario una cifra N y rellene un array bidimensional de N
// filas y N columnas con número aleatorios entre 100 y 200.
//
// Mostrar dicho array y a continuación rotarlo 90 grados:
//
// Ejemplo:
//
// Introduce la dimensión del Array: 5

import java.util.Scanner;

public class Tarea3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce la longitud del arrays:");
    int n = sc.nextInt();
    int[][] a = new int[n][n];
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a.length; j++) {
        a[i][j] = (int) (Math.random() * 100 + 100);
      }
    }
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a.length; j++) {
        System.out.print(a[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println("Arrays 90 grados ");
    int[][] res = new int[n][n];
    int col = 0, fil = 0;
    for (int i = 0; i < res.length; i++) {
      for (int j = 0; j < res.length; j++) {
        res[j][i] = a[i][j];
        if (col == n - 1) {
          res[i][j] = a[j][i];
        }
      }
    }

    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a.length; j++) {
        System.out.print(res[i][j] + " ");
      }
      System.out.println();
    }
  }
}
