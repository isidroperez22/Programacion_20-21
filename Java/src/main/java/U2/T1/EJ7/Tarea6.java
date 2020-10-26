package U2.T1.EJ7;
// Escribir todos los múltiplos de 7 menores que 100.
import java.util.Scanner;

public class Tarea6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = 7;
    int r = 0;
    int i;
    for (i = 1; r <= 95; i++) {
      r = n * i;
      System.out.println(r);
    }
  }
}
