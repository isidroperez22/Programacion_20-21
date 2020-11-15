package U3.T1.EJ1;
// Realizar una función que calcule a elevado a n, donde a es real, y n entero no negativo. Realizar
// una versión iterativa y otra recursiva.
import java.util.Scanner;

public class Tarea11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Escribe un numero: ");
    double a = sc.nextInt();
    System.out.print("Escribe el numero al que va a estar elevado");
    int n = sc.nextInt();
    while (n <= 0) {
      n = sc.nextInt();
    }
    elevado(a, n);
  }

  static void elevado(double a, int n) {
    double resultado = Math.pow(a, n);

    System.out.println(resultado);
  }
}
