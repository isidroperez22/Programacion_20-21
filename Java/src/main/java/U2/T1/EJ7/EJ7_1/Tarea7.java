package U2.T1.EJ7.EJ7_1;
// Realiza un programa que pida un número por teclado y que luego muestre ese número al revés.
import java.util.Scanner;

public class Tarea7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.printf("Escribe un numero por teclado: ");
    int n = sc.nextInt();
    int al_reves = 0;
    int resto = 0;
    while (n > 0) {
      resto = n % 10;
      al_reves = al_reves * 10 + resto;
      n = n / 10;
      System.out.println(al_reves);
      System.out.println(n);
    }
    System.out.println(al_reves);
  }
}
