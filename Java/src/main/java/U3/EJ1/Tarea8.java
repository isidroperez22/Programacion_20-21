package U3.T1.EJ1;

import java.util.Scanner;

public class Tarea8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Escribe un numero: ");
    int n = sc.nextInt();
    System.out.println("La cantidad de numeros primos que tiene " + n + " es: " + div_primo(n));
  }

  static Boolean es_primo(int n) {
    int cont = 0;
    boolean primo;
    for (int i = 1; i <= n; i++) {
      if (n % i == 0) {
        cont++;
      }
    }
    primo = cont <= 2;
    return primo;
  }

  public static int div_primo(int n) {
    int cont = 0;
    for (int i = 1; i <= n; i++) {
      if (n % i == 0 && es_primo(i)) {
        cont++;
      }
    }
    System.out.println(cont);
    return cont;
  }
}
