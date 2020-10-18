package U2.T1.EJ3;

import java.util.Scanner;

public class Tarea3 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Escribe tres numeros para calcular la media:");
    double n = teclado.nextDouble();
    double x = teclado.nextDouble();
    double i = teclado.nextDouble();
    double med = (n + x + i) / 3;

    System.out.println(med);
  }
}
