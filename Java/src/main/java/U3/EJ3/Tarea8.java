package U3.EJ3;
// Crear una tabla bidimensional de tamaño 5x5 y rellenarla de la siguiente forma: la posición [n,m]
// debe contener n+m.
// Después, se debe mostrar su contenido.
import java.util.Arrays;
import java.util.Scanner;

public class Tarea8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[][] a = new int[5][5];
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        a[i][j] = i + j;
      }
    }
    System.out.println(Arrays.deepToString(a));
  }
}
