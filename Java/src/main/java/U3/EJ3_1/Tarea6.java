package U3.EJ3_1;
// Realiza un programa que rellene un array de 6 filas por 10 columnas con números enteros positivos
// comprendidos entre 0
// y 1000 (ambos incluidos). A continuación, el programa deberá dar la posición tanto del máximo
// como del mínimo.
public class Tarea6 {
  public static void main(String[] args) {
    int[][] a = new int[6][10];
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a.length; j++) {
        a[i][j] = (int) (Math.random() * 1001);
      }
    }
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a.length; j++) {
        System.out.print(a[i][j] + " ");
      }
      System.out.println();
    }
    int max = 0;
    int min = 1000;
    String posMax = "";
    String posMin = "";
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a.length; j++) {
        if (a[i][j] < min) {
          min = a[i][j];
          posMin = "La posicion del numero minimo es: a[" + i + "][" + j + "]";
        }
        if (a[i][j] > min) {
          max = a[i][j];
          posMax = "La posicion del numero minimo es: a[" + i + "][" + j + "]";
        }
      }
    }
    System.out.println(posMax);
    System.out.println("Numero: " + max);
    System.out.println(posMin);
    System.out.println("Numero: " + min);
  }
}
