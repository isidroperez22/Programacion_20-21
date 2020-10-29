package U2.T1.Entregable;
// Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares
// hay dentro de un número. Se recomienda usar long en lugar de int ya que el
// primero admite números más largos.
import java.util.Scanner;

public class EJ2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Escribe un numero: ");
    int n = sc.nextInt();
    int nf = n;
    int par = 0;
    int impar = 0;
    int n1 = 0;
    while (n != 0) {
      n1 = n % 10;
      if (n1 % 2 == 0) {
        par++;
      } else {
        impar++;
      }
      n = n / 10;
    }
    System.out.println(
        "El " + nf + " contiene " + par + " dígitos pares y " + impar + " dígitos impares.");
  }
}
