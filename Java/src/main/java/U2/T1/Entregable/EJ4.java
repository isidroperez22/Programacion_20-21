package U2.T1.Entregable;

import java.util.Scanner;

// Escribe un programa que pida un número entero positivo por teclado y que
// muestre a continuación los 5 números consecutivos a partir del número
// introducido (incluyendo él mismo). Al lado de cada número se debe indicar
// si se trata de un primo o no.
public class EJ4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Escribe un numero positivo");
    int n = sc.nextInt();
    int cont = 0;
    int es_primo = 0;
    for (int x = n; x < n + 5; x++) {
      int contador = 0;

      for (int i = 1; i <= x; i++) {
        if ((x % i) == 0) {
          contador++;
        }
      }
      if (contador <= 2) {
        System.out.println(x + "-> primo");
        es_primo++;
      } else {
        System.out.println(x + "-> no es primo");
      }
    }
  }
}
