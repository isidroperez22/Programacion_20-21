package U3.T1.EJ1;

import java.util.Scanner;
// Realizar una función que calcule y muestre el área o el volumen de un cilindro, según se
// especifique. Para distinguir
// un caso de otro se le pasará un número 1 (para área) o 2 (para volumen). Además, hemos de pasarle
// a la función el radio de la base y la altura.
public class Tarea3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Escribe número 1 (para área) o 2 (para volumen): ");
    int n = sc.nextInt();
    System.out.println("Escribe el radio: ");
    int radio = sc.nextInt();
    System.out.println("Escribe la altura: ");
    int altura = sc.nextInt();

    if (n == 1) {
      area(radio, altura);
    } else if (n == 2) {
      volumen(radio, altura);
    }
  }

  public static void area(int r, int h) {
    double resultado = 2 * (Math.PI) * r * (h + r);
    System.out.println("El area es " + resultado);
  }

  public static void volumen(int r, int h) {
    double resultado = Math.PI * Math.pow(r, 2) * h;
    System.out.println("El volumen es " + resultado);
  }
}
