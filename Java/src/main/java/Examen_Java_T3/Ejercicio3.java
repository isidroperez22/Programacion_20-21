package Examen_Java_T3;

import java.util.Arrays;

// Implementa una función con nombre corteza que sea capaz de extraer la capa exterior de un array
// bidimensional. Esta capa se extrae en forma de array de una dimensión. La extracción de números
// comienza en la esquina superior izquierda y continúa en el sentido de las agujas del reloj. Se
// debe entregar tanto el código de la función como el código de prueba que la usa. La cabecera de
// la función es la siguiente:
//
// public static int[] corteza(int[][] n)
public class Ejercicio3 {
  public static void main(String[] args) {
    int[][] a = new int[4][6];
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[3].length; j++) {
        a[i][j] = (int) (Math.random() * 9 + 1);
      }
    }
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[3].length; j++) {
        System.out.print(a[i][j] + " ");
      }
      System.out.println();
    }
    corteza(a);
  }

  public static int[] corteza(int[][] n) {
    int[] resultado = new int[1];
    int cont = 0;

    for (int j = 0; j < n[3].length; j++) {
      resultado[cont] = n[0][j];
      resultado = Arrays.copyOf(resultado, resultado.length + 1);
      cont++;
    }
    for (int j = 0; j < n.length; j++) {
      if (j > 0) {
        resultado[cont] = n[j][n.length + 1];
        resultado = Arrays.copyOf(resultado, resultado.length + 1);
        cont++;
      }
    }
    int cont1 = n.length + 1;
    for (int j = 0; j < n[3].length; j++) {
      if (j > 0) {
        resultado[cont] = n[n.length - 1][cont1--];
        resultado = Arrays.copyOf(resultado, resultado.length + 1);
        cont++;
      }
    }
    int cont2 = 3;
    for (int j = 0; j < 4; j++) {
      if (j > 0) {
        resultado[cont] = n[cont2][0];
        resultado = Arrays.copyOf(resultado, resultado.length + 1);
        cont++;
        cont--;
      }
    }
    if (resultado[resultado.length - 1] == 0) {
      resultado = Arrays.copyOf(resultado, resultado.length - 1);
    }
    System.out.println(Arrays.toString(resultado));
    return resultado;
  }
}
