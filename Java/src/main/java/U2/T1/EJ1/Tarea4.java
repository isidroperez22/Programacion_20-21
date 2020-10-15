package U2.T1.EJ1;

import java.util.Scanner;

// Ejercicio2-4: Crea un programa que pida al usuario una longitud en millas (por ejemplo, 3) y
// calcule su equivalencia en metros (1 milla = 1609 m).
public class Tarea4 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Dime la longitud en milla");
    int x = teclado.nextInt();
    System.out.println("el resultado es " + (x * 1609));
  }
}
