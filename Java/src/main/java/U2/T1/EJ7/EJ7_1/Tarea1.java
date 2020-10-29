package U2.T1.EJ7.EJ7_1;

import java.util.Scanner;

public class Tarea1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce la contraseña de 4 cifras");
    int contrasnia = sc.nextInt();
    int respuesta;
    System.out.println("Escribe la contraseña correcta: ");
    for (int i = 3; i >= 0; i--) {
      respuesta = sc.nextInt();
      if (contrasnia != respuesta) {
        System.out.println(
            "Lo siento, esa no es la combinación" + ", " + i + " intentos restantes");
      } else {
        System.out.println("La caja fuerte se ha abierto satisfactoriamente");
        break;
      }
    }
  }
}
