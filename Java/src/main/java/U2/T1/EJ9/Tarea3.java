package U2.T1.EJ9;
// En una segunda versión del programa anterior, se debe escribir "Acertaste" o "Menor" o "Mayor",
// según la palabra introducida sea menor alfabéticamente que la contraseña, o mayor.
import java.util.Scanner;

public class Tarea3 {
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
    System.out.println("Escribe la respuesta: ");
    String res = sc.next();
    if (res.equals(contra)) {
      System.out.print("Acertaste");
    } else if (res.charAt(0) > contra.charAt(0)) {
      System.out.print("Menor");
    } else {
      System.out.print("Mayor");
    }
  }
}
