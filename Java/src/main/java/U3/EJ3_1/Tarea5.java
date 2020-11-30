package U3.EJ3_1;

// Realiza un programa que muestre por pantalla un array de 10 filas por 10columnas relleno con
// números aleatorios entre 200 y 300. A continuación, el programa debe mostrar los números de la
// diagonal que va desde la esquinas uperior izquierda a la esquina inferior derecha, así como el
// máximo, el mínimo y la media de los números que hay en esa diagonal.
public class Tarea5 {
  public static void main(String[] args) {
    int[][] a = new int[10][10];
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a.length; j++) {
        a[i][j] = (int) (Math.random() * 100 + 200);
      }
    }
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a.length; j++) {
        System.out.print(a[i][j] + " ");
      }
      System.out.println();
    }
    int media = 0;
    int max = 0;
    int min = 300;
    int nizq = a[0][0];
    int nder = a[9][9];
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a.length; j++) {
        if (i == j) {
          if (a[i][j] < min) {
            min = a[i][j];
          }
          if (a[i][j] > min) {
            max = a[i][j];
          }
          media = media + a[i][j];
        }
      }
    }
    System.out.println("Media: " + media / 10);
    System.out.println("Numero maximo: " + max);
    System.out.println("Numero minimo: " + min);
    System.out.println("Numero arriba Izq: " + nizq);
    System.out.println("Numero abajo Der: " + nder);
  }
}
