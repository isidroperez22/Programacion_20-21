package U3.Entregable_T3;

import java.util.Arrays;
import java.util.Scanner;

// Crea la función filtraPrimos que:
//
// Recibe un array de enteros
// Devuelve un array de enteros con todos los primos que se encuentran en el array origen
// Obviamente el tamaño del array  que se devuelve será de una longitud menor o igual al que se pasa
// como parámetro. Para facilitar el ejercicio aunque un número primo se repita lo añadiremos al
// vector. Si no existe ningún número primo en el vector original, se devuelve un array con el
// número -1 como único elemento.
public class Tarea1 {
  public static void main(String[] args) {
    int[] a = new int[10];
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < a.length; i++) {
      a[i] = sc.nextInt();
    }
    filtraPrimos(a);
  }

  static int[] filtraPrimos(int[] a) {
    int[] resultado = new int[1];
    int res = 0;
    for (int i = 0; i < a.length; i++) {
      int cont = 0;
      int n = a[i];
      System.out.println(n);
      for (int j = 1; j <= n; j++) {
        if (n % j == 0) {
          cont++;
        }
      }
      if (cont <= 2) {
        resultado = Arrays.copyOf(resultado, resultado.length + 1);
        resultado[res] = a[i];
        res++;
      }
    }
    if (res == 0) {
      resultado = Arrays.copyOf(resultado, resultado.length + 1);
      resultado[res] = -1;
    }
    if (resultado[resultado.length - 1] == 0) {
      resultado = Arrays.copyOf(resultado, resultado.length - 1);
    }
    System.out.println(Arrays.toString(resultado));
    return resultado;
  }
}
