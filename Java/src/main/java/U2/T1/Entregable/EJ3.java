package U2.T1.Entregable;
// Escribe un programa que sea capaz de insertar un dígito dentro de un número
// indicando la posición. El nuevo dígito se colocará en la posición indicada y el
// resto de dígitos se desplazará hacia la derecha. Las posiciones se cuentan de
// izquierda a derecha empezando por el 1. Suponemos que el usuario introduce
// correctamente los datos. Se recomienda usar long en lugar de int ya que el
// primero admite números más largos.
import java.util.Scanner;

public class EJ3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Escribe un numero:");
    String n = sc.next();
    System.out.println("Escribe la posicion");
    int x = sc.nextInt();
    System.out.println("Escribe el numero a insertar");
    String j = sc.next();
    System.out.println("El número resultante es " + n.substring(0, x) + j + n.substring(x));
  }
}
