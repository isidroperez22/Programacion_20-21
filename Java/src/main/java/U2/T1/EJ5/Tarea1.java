package U2.T1.EJ5;
// Crea un programa que pida al usuario el número de un mes y escriba el nombre de ese mes. Por
// ejemplo, si el usuario introduce 9, deberá escribir "septiembre".
import java.util.Scanner;

public class Tarea1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.printf("Introduce un numero: ");
    int x = sc.nextInt();

    switch (x) {
      case 1:
        System.out.printf("Enero");
        break;
      case 2:
        System.out.printf("Febrero");
        break;
      case 3:
        System.out.printf("Marzo");
        break;
      case 4:
        System.out.printf("Abril");
        break;
      case 5:
        System.out.printf("Mayo");
        break;
      case 6:
        System.out.printf("Junio");
        break;
      case 7:
        System.out.printf("Julio");
        break;
      case 8:
        System.out.printf("Agosto");
        break;
      case 9:
        System.out.printf("Septiembre");
        break;
      case 10:
        System.out.printf("Octubre");
        break;
      case 11:
        System.out.printf("Noviembre");
        break;
      case 12:
        System.out.printf("Diciembre");
        break;
      default:
        System.out.printf("No existe");
        break;
    }
  }
}
