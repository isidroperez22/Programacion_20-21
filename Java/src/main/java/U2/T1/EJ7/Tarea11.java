package U2.T1.EJ7;
// Diseñar una aplicación que muestre las tablas de multiplicar del 1 al 10.

public class Tarea11 {
  public static void main(String[] args) {
    for (int j = 1; j <= 10; j++) {
      for (int i = 1; i <= 10; i++) {
        System.out.println(j + "*" + i + "=" + i * j);
      }
    }
  }
}
