package U3.EJ2;

import java.util.Scanner;

public class Tarea3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String vocales = "aeiouáéíóú";
    System.out.println("Introduce una frase: ");
    String frase = sc.nextLine();
    String frase_f = "";
    for (int i = 1; i < frase.length(); i++) {
      for (int j = 1; j < vocales.length(); j++) {
        if (frase.substring(i - 1, i).equalsIgnoreCase(vocales.substring(j - 1, j))) {
          frase_f = frase_f + frase.substring(i - 1, i);
        }
      }
    }
    System.out.println(frase_f);
  }
}
