package U3.EJ3;

import java.util.Arrays;
import java.util.Scanner;

public class Tarea5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] a = {1, 3, 2, 10, 4, 7};
    int[] b = {8, 9, 0, 6, 5, 11};
    Arrays.sort(a);
    Arrays.sort(b);
    System.out.println(Arrays.toString(a));
    System.out.println(Arrays.toString(b));
    int[] c = new int[a.length + b.length];
    int cont_a = 0;
    int cont_b = 0;
    for (int i = 0; i < c.length; i++) {
      if (a[cont_a] < b[cont_b]) {
        c[i] = a[cont_a];
        cont_a++;
      } else if (a[cont_a] > b[cont_b]) {
        c[i] = b[cont_b];
        cont_b++;
      }
      if (cont_a == a.length) {
        for (int j = cont_b; j < b.length; j++) {
          c[++i] = b[j];
        }
      }
      if (cont_b == b.length) {
        for (int j = cont_a; j < a.length; j++) {
          c[++i] = b[j];
        }
      }
    }
    System.out.println(Arrays.toString(c));
  }
}
