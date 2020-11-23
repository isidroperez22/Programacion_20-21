package U3.EJ3;
// Implementar una función sinRepetidos() con el prototipo:
//
// int[] sinRepetidos(int t[])
//
// que construye y devuelve una tabla del tamaño apropiado, con los elementos de t, donde se han
// eliminado los datos repetidos.
import java.util.Arrays;
import java.util.Scanner;

public class Tarea6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //    int[] a = new int[7];
    int[] a = {2, 2, 4, 9, 7, 1, 8, 9};
    System.out.println("Introduce los valores: ");
    //  for (int i = 0; i < a.length; i++) {
    //   a[i] = sc.nextInt();
    // }
    System.out.println(Arrays.toString(a));
    sinRepetidos(a);
  }

  static int[] sinRepetidos(int[] a) {
    Arrays.sort(a);
    int[] b = new int[1];
    int cont = 0;
    for (int i = 0; i < a.length; i++) {
      if (b[0] == 0) {
        b[0] = a[i];
      } else if (a[i] != b[cont]) {
        b = Arrays.copyOf(b, b.length + 1);
        b[++cont] = a[i];
      }
    }
    System.out.println(Arrays.toString(b));
    return b;
  }
}
