package U2.T1.EJ7;
// Un centro educativo nos ha pedido que diseñemos una aplicación para calcular datos estadísticos
// de los alumnos.
// Se introducirán las edades de los elumnos hasta que una de ellas sea negativa. La aplicación
// mostrará la
// suma de las edades, la media, de cuántos alumnos hemos introducido su edad, y cuántos alumnos son
// mayores de edad
import java.util.Scanner;

public class Tarea2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.printf("Introduce la edad: ");
    int edad = sc.nextInt();
    int contador = 0;
    int media = 0;
    int mayor = 0;

    while (edad > 0) {
      if (edad >= 18) {
        media = media + edad;
        contador++;
        mayor++;
      } else {
        media = media + edad;
        contador++;
      }
      edad = sc.nextInt();
    }
    System.out.println("Mayores de edad: " + mayor);
    System.out.print("Media: " + media / contador + "," + media % contador);
  }
}
