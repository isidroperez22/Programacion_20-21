package U2.T1.EJ9;
// Diseñar el juego "Acierta la contraseña". El primer jugador introduce una contraseña, el segundo,
// debe insertar otra
// intentando acertarla con las pistas que le dará el programa: número de caracteres, primera y
// última letra. El programa debe escribir "Acertaste" o "Fallaste".
import java.util.Scanner;

public class Tarea2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.printf("Escribe la contraseña: ");
    String contra = sc.next();
    System.out.printf(
        "Empieza por "
            + String.valueOf(contra.charAt(0))
            + " acaba por "
            + contra.charAt(contra.length() - 1)
            + " y tiene "
            + contra.length()
            + " palabras");
    System.out.printf("Escribe la respuesta: ");
    String res = sc.next();
    if (res == contra) {
      System.out.printf("Acertaste");
    } else {
      System.out.printf("Fallaste");
    }
  }
}
