package U3.EJ3;
// Escribir la función rellenaPares() a la que se le pasa como parámetro una tabla unidimensional
// que debe rellenar de la
// siguiente forma: se leerá por teclado una serie de números, guardando en la tabla los pares hasta
// que esté llena,
// e ignorando los impares. La función tiene que devolver la cantidad de impares desechados.

import java.util.Arrays;
import java.util.Scanner;

public class Tarea10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] a = {1, 4, 6, 7, 9, 11, 14};
    rellenaPares(a);
  }

  static int[] rellenaPares(int[] a) {
    int[] res = new int[1];
    int cont = 0;
    for (int j : a) {
      if (j % 2 == 0) {
        res[cont] = j;
        res = Arrays.copyOf(res, res.length + 1);
        cont++;
      }
    }
    if (res[cont] == 0) {
      res = Arrays.copyOf(res, res.length - 1);
    }
    System.out.println(Arrays.toString(res));
    return res;
  }
}
