package U2.T1.EJ2;
// Ejercicio3-4: Crea un programa que pida al usuario una longitud en millas (por ejemplo, 3) y
// calcule su equivalencia
// en kilómetros, usando datos de tipo float (1 milla = 1.609 km).
import java.util.Scanner;

public class Tarea4 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Dime la longitud en milla");
    double x = teclado.nextFloat();
    System.out.println("el resultado es " + (x * 1609));
  }
}
