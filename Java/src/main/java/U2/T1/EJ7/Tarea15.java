package U2.T1.EJ7;
// Realizar un programa que nos pida un número n, y nos diga cuantos números hay entre 1 y n que
// sean primos. Un número primo es aquel que sólo es divisible por 1 y por él mismo. Ejemplo: Para
// n=8:
// 1-> primo
// 2->primo
// 3->primo
// 4->no primo
// 5->primo
// 6->no primo
// 7->primo
// 8->no primo
// Resultado del programa: Entre 1 y 8 hay 5 números primos.
import java.util.Scanner;

public class Tarea15 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingresa un numero: ");
    int n = sc.nextInt();
    int es_primo = 0;
    for (int x = 1; x < n + 1; x++) {
      int cont = 0;

      for (int i = 1; i <= x; i++) {
        if ((x % i) == 0) {
          cont++;
        }
      }
      if (cont <= 2) {
        System.out.println(x + "-> primo");
        es_primo++;
      } else {
        System.out.println(x + "-> no primo");
      }
    }
    System.out.println("Entre 1 y " + n + " hay " + es_primo + " numeros primos");
  }
}
