package U3.EJ3;
// Escribir una aplicación que solicite al usuario cuántos números desea introducir. A continuación,
// se introducirá por teclado esa cantidad de números enteros, y por último, los mostrará en el
// orden inverso al introducido.
import java.util.Scanner;

public class Tarea2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Cuantos numeros quieres introducir: ");
    int n = sc.nextInt();
    int[] a = new int[n];
    System.out.println("Introduce los numeros ");
    for (int i = 0; i < a.length; i++) {
      a[i] = sc.nextInt();
    }
    System.out.print("Los numeros son: ");
    for (int i = n - 1; i <= 0; i--) {
      System.out.println(a[i] + " ");
    }
  }
}
