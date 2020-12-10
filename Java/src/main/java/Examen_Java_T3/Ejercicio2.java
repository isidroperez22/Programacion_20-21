package Examen_Java_T3;

import java.util.Arrays;
import java.util.Scanner;

// Escribe un programa que pida 20 números enteros. Estos números se deben introducir en un array de
// 4 filas por 5 columnas. El programa mostrará las sumas parciales de filas y columnas igual que si
// de una hoja de cálculo se tratara. La suma total debe aparecer en la esquina inferior derecha.
public class Ejercicio2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[][] a = new int[4][5];
    System.out.println("Introduce los valores: ");
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        a[i][j] = sc.nextInt();
      }
    }
    System.out.println(Arrays.deepToString(a));
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[3].length; j++) {
        System.out.print(a[i][j] + " ");
      }
      System.out.println();
    }
    int suma = 0;
    int total = 0;
    int cont_col = 0;
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[3].length; j++) {
        suma = suma + a[i][j];
      }
      suma = 0;
    }

    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[3].length; j++) {
        total = total + a[i][j];
      }
      suma = 0;
    }
    System.out.println("Total: " + total);
  }
}
