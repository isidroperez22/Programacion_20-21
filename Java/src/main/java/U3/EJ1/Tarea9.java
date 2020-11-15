package U3.T1.EJ1;
// Implementar la función divisoresPrimos() que muestra, por consola, todos los divisores primos del
// número que se le pasa como parámetro
import java.util.Scanner;

public class Tarea9 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce un numero");
    int n = sc.nextInt();
    System.out.printf("Los divisores primos son: ");
    divisoresPrimos(n);
  }

  static Boolean es_primo(int n) {
    int cont = 0;
    boolean primo;
    for (int i = 1; i <= n; i++) {
      if (n % i == 0) {
        cont++;
      }
    }
    primo = cont <= 2;
    return primo;
  }

  static void divisoresPrimos(int n) {

    for (int i = 1; i <= n; i++) {
      if (n % i == 0 && es_primo(i)) {
        System.out.print(i + " ");
      }
    }
  }
}
