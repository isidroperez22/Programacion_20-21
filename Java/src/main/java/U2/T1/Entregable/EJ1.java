package U2.T1.Entregable;
// Realiza un programa que pinte por pantalla un rombo hueco hecho con
// asteriscos. El programa debe pedir la altura. Se debe comprobar que la altura
// sea un número impar mayor o igual a 3, en caso contrario se debe mostrar un
// mensaje de error y volverlo a pedir hasta que sea correcto.
// Ejemplo:
// Por favor, introduzca la altura del rombo: 5
//   *
//  * *
// *   *
//  * *
//   *
import java.util.Scanner;

public class EJ1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int altura = sc.nextInt();
    int espacioP = altura - 1;
    int espaciosM = 0;
    for (int i = 1; i <= altura / 2; i++) {
      for (int j = 0; j < espacioP; j++) {
        System.out.print(" ");
      }
      System.out.print("*");
      for (int j = 1; j < espaciosM; j++) {
        System.out.print(" ");
      }
      if (i > 1) {
        System.out.print("*");
      }
      System.out.println();
      espacioP--;
      espaciosM = espaciosM + 2;
    }
    for (int i = altura; i >= (altura / 2) + 1; i--) {
      for (int j = 0; j < espacioP; j++) {
        System.out.print(" ");
      }
      System.out.print("*");
      for (int j = 1; j < espaciosM; j++) {
        System.out.print(" ");
      }
      if (i >= altura - 1) {
        System.out.print("*");
      }
      System.out.println();
      espacioP++;
      espaciosM = espaciosM - 2;
    }
  }
}
