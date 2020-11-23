package U3.EJ3;
// Introducir por teclado un número n; a continuación solicitar al usuario que teclee n números.
// Realizar la media de los números positivos, la media de los negativos, y contar el número de
// ceros introducidos.
import java.util.Scanner;

public class Tarea3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Cuantos numeros quieres introducir: ");
    int n = sc.nextInt();
    int[] a = new int[n];
    int pos = 0;
    int c_pos = 0;
    int neg = 0;
    int c_neg = 0;
    int zero = 0;
    for (int i = 0; i < a.length; i++) {
      a[i] = sc.nextInt();
      if (a[i] > 0) {
        pos = pos + a[i];
        c_pos++;

      } else if (a[i] < 0) {
        neg = neg + a[i];
        c_neg++;
      } else if (a[i] == 0) {
        zero++;
      }
    }
    System.out.println("La media de numeros positivos es: " + pos / c_pos);
    System.out.println("La media de numeros negativos es: " + neg / c_neg);
    System.out.println("La cantidad de ceros es: " + zero);
  }
}
