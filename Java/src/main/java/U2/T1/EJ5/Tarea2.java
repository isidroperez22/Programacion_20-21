package U2.T1.EJ5;
// Crea un programa que escriba como texto cualquier número del 1 al 10 que introduzca el usuario.
// Por ejemplo,
// si el usuario introduce 3, deberá escribir "tres".
import java.util.Scanner;

public class Tarea2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.printf("Escribe un numero del 1 al 10: ");
    int x = sc.nextInt();
    switch (x) {
      case 1:
        System.out.printf("Uno");
        break;
      case 2:
        System.out.printf("Dos");
        break;
      case 3:
        System.out.printf("Tres");
        break;
      case 4:
        System.out.printf("Cuatro");
        break;
      case 5:
        System.out.printf("Cinco");
        break;
      case 6:
        System.out.printf("Seis");
        break;
      case 7:
        System.out.printf("Siete");
        break;
      case 8:
        System.out.printf("Ocho");
        break;
      case 9:
        System.out.printf("Nueve");
        break;
      case 10:
        System.out.printf("Diez");
        break;
      default:
        System.out.printf("No existe");
        break;
    }
  }
}
