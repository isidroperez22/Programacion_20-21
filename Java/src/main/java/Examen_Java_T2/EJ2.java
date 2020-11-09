package Examen_Java_T2;
// Realiza un programa que pinte por pantalla diez líneas formadas por carac-
// teres. El carácter con el que se pinta cada línea se elige de forma aleatoria
// entre uno de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud
// aleatoria entre 1 y 40 caracteres.
import java.util.Scanner;

public class EJ2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String car = "*-=.|@";
    int x = (int) (Math.random() * 40 + 1);
    for (int i = 1; i <= 10; i++) {
      for (int j = 0; j <= x; j++) {
        int n = (int) (Math.random() * 6 + 1);
        System.out.print(car.substring(n - 1, n));
      }
      x = (int) (Math.random() * 40 + 1);
      System.out.println();
    }
  }
}
