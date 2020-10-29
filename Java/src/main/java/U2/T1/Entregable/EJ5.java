package U2.T1.Entregable;

import java.util.Scanner;

public class EJ5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Escribe una frase: ");
    String frase = sc.nextLine();
    int contador = 0;
    String a = "a";
    String e = "e";
    String o = "o";
    String h = "h";
    for (int i = 0; i <= frase.length(); i++) {
      for (int j = 0; j <= i; j++) {
        String car = frase.substring(j, i);

        if (car.equals(h)) {
          contador++;
        } else if (car.equals(o)) {
          contador++;
        } else if (car.equals(a)) {
          contador++;
        } else if (car.equals(e)) {
          contador++;
        } else if (car.equals(" ")) {
          contador++;
        }
      }
    }
    System.out.println("La cantidad de espacios, haches y vocales abiertas es " + contador);
  }
}
