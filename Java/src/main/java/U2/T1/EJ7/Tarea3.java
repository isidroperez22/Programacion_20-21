package U2.T1.EJ7;
// Realizar un aplicación que genere un número aleatorio entre 1 y 100. El jugador debe ir probando
// números tratando de
// acertarlo. El programa debe indicar "mayor" o "menor" según el número secreto sea mayor o menor
// que
// el introducido por el usuario. El proceso finaliza cuando el usuario acierta o cuando se rinde
// (introduciendo un -1).
import java.util.Scanner;

public class Tarea3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = (int) (Math.random() * 100 + 1);
    System.out.println("Introduce numeros hasta acertar: ");
    int i = sc.nextInt();
    System.out.println(n);
    while (n != i && i > -1) {
      if (n > i) {
        System.out.println("es mayor");
      } else {
        System.out.println("Es menor");
      }
      i = sc.nextInt();
    }
  }
}
