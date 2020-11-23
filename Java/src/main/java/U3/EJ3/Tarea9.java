package U3.EJ3;
// Definir una función que tome como parámetros dos tablas, la primera con 6 números de una apuesta
// de la primitiva,
// y la segunda con los 6 números de la combinación ganadora. La función devolverá el número de
// aciertos.
import java.util.Arrays;
import java.util.Scanner;

public class Tarea9 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] combi = {1, 89, 17, 45, 56, 11};
    System.out.println(Arrays.toString(combi));
    System.out.println("Escribe los 6 numeros");
    int[] apuesta = new int[6];
    for (int i = 0; i < apuesta.length; i++) {
      apuesta[i] = sc.nextInt();
    }
    ganadora(apuesta, combi);
  }

  static int ganadora(int[] a, int[] b) {
    int aciertos = 0;
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < b.length; j++) {
        if (a[i] == b[j]) {
          aciertos++;
        }
      }
    }
    System.out.println("El numero de aciertos es " + aciertos);
    return aciertos;
  }
}
