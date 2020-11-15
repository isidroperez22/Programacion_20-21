package U3.T1.EJ1;
// Calcular el factorial de n recursivamente. Recordar que por definición, el factorial de 0 es 1.
import java.util.Scanner;

public class Tarea12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Escribe un numero: ");
    int n = sc.nextInt();
    factorial(n);
  }

  public static int factorial(int n) {
    int resultado = n;
    if (n > 1) {
      resultado = resultado * factorial((n - 1));
    }
    System.out.println(resultado);
    return resultado;
  }
}
