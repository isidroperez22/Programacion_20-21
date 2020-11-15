package U3.T1.EJ1;

import java.util.Scanner;

public class Tarea11R {
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
    int positivo = 0;
    double resultado = Math.pow(a, n);

    if (n <= 0) {
      elevado(a, n - 1);
    }

    System.out.println(resultado);
  }
}
