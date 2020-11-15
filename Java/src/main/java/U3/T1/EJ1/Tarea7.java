package U3.T1.EJ1;

import java.util.Scanner;

public class Tarea7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Escribe un numero y te dice si es primo: ");
    int n = sc.nextInt();
    es_primo(n);
  }

  static String es_primo(int n) {
    int cont = 0;
    String primo;
    for (int i = 1; i <= n; i++) {
      if (n % i == 0) {
        cont++;
      }
    }
    if (cont > 2) {
      primo = "No es primo";
    } else {
      primo = "Es primo";
    }
    System.out.println(primo);
    return primo;
  }
}
