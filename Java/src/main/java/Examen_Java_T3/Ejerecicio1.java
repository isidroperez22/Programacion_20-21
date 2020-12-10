package Examen_Java_T3;

import java.util.Arrays;

// Define la función mezcla con la siguiente cabecera:
//
// public static int[] mezcla(int[] a, int[] b)
//
// Esta función toma dos vectores como parámetros y devuelve un array que es el resultado de mezclar
// los números de ambos de forma alterna, se coge unnúmero de a, luego de b, luego de a, etc. Los
// vectores y b pueden tener longitudes diferentes; por tanto, si se terminan los números de un
// array se terminan de coger todos los que quedan del otro.
//
// Ejemplos:
//
// Si a = {8, 9, 0} y b = {1, 2, 3}, mezcla(a, b) devuelve {8, 1, 9, 2, 0, 3 }
//
// Si a = {4, 3} y b = {7, 8, 9, 10}, mezcla(a, b) devuelve {4, 7, 3, 8, 9, 10}
//
// Si a = {8, 9, 0, 3} y b = {1}, mezcla(a, b) devuelve {8, 1, 9, 0, 3}
//
// Si a = { } y b = {1, 2, 3}, mezcla(a, b) devuelve {1, 2, 3}
public class Ejerecicio1 {
  public static void main(String[] args) {
    int[] a = {8, 9, 0};
    int[] b = {1, 2, 3};
    mezcla(a, b);
  }

  public static int[] mezcla(int[] a, int[] b) {
    int[] resultado = new int[1];
    int n_a = 0;
    int cont_a = 0;
    int cont_b = 0;
    for (int i = 0; i < a.length + b.length; i++) {
      //      if (a[cont_a] == a.length - 1) {
      //        resultado[i] = b[cont_b];
      //        resultado = Arrays.copyOf(resultado, resultado.length + 1);
      //        cont_b++;
      //        break;
      //      }
      //      if (b[cont_b] == b.length - 1) {
      //        resultado[i] = a[cont_a];
      //        resultado = Arrays.copyOf(resultado, resultado.length + 1);
      //        cont_a++;
      //        break;
      //      }
      if (cont_a == a.length) {
        resultado[i] = b[cont_b];
        resultado = Arrays.copyOf(resultado, resultado.length + 1);
        cont_b++;
      }
      if (n_a == 0) {
        resultado[i] = a[cont_a];
        resultado = Arrays.copyOf(resultado, resultado.length + 1);
        cont_a++;
        n_a = 1;
      } else {
        resultado[i] = b[cont_b];
        resultado = Arrays.copyOf(resultado, resultado.length + 1);
        cont_b++;
        n_a = 0;
      }
    }
    System.out.println(Arrays.toString(resultado));
    return resultado;
  }
}
