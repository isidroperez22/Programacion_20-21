package U2.T1.EJ9;
// Diseñar un programa que pida una frase al usuario, e indique si el carácter de la
// posición central es o no un espacio.
import java.util.Scanner;

public class Tarea4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Escribe una frase ");
    String frase = sc.nextLine();
    int mitad = frase.length() / 2;
    String espacio = frase.substring(mitad, mitad + 1);
    if (espacio.equals(" ")) {
      System.out.println("Es un espacio");
    } else {
      System.out.println("No es un espacio");
    }
  }
}
