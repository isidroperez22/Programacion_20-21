package U3.EJ2;

import java.util.Scanner;

public class Tarea2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce una frase");
    String frase = sc.nextLine();
    String espacio = " ";
    int cont = 0;
    for (int i = 1; i < frase.length(); i++) {
      if (frase.substring(i - 1, i).equals(espacio)) {
        cont++;
      }
    }
    System.out.println("Hay " + cont + " espacios en la frase");
  }
}
