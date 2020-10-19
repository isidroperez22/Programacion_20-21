package U2.T1.EJ5;
// Se nos pide hacer un programa que pida la usuario el valor del radio de una circunferencia, y a
// continuación muestre un pequeño menú con 3 opciones:
//
// 1.Calcular diámetro
//
// 2.Calcular perímetro
//
// 3.Calcular área
//
// Dependiendo del número que marque el usuario, deberemos mostrar el resultado correspondiente.
// (diametro=2 x radio) (perímetro=2 x pi x radio) (area=pi x radio x radio)
import java.util.Scanner;

public class Tarea5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.printf("Dime el radio de la circunferencia: ");
    double n = sc.nextDouble();
    System.out.printf("¿Que quieres calcular diámetro, perímetro, o área? ");
    String nombre = sc.next();
    switch (nombre) {
      case "diámetro":
        System.out.printf("El diametro es " + (2 * n));
        break;
      case "perímetro":
        System.out.printf("El perímetro es " + (2 * Math.PI * n));
        break;
      case "área":
        System.out.printf("El área es " + (Math.PI * n * n));
      default:
        System.out.printf("Comprueba si lo has escrito bien o existe");
    }
  }
}
