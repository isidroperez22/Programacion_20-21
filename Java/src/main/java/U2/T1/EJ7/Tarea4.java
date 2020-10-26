package U2.T1.EJ7;
// Escribir una aplicación que pida un número n, y escriba los números desde 1 hasta n.
import java.util.Scanner;

public class Tarea4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Escribe un numero: ");
    int n = sc.nextInt();
    int i;
    for (i = 1; i < n + 1; i++) {
      System.out.print(i + " ");
    }
  }
}
