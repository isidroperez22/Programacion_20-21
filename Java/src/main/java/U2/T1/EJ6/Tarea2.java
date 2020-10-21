package U2.T1.EJ6;

import java.util.Scanner;

public class Tarea2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.printf("Escribe la edad: ");
    int edad = sc.nextInt();
    System.out.printf("Escribe el nivel de estudios: ");
    int nivel_de_estudios = sc.nextInt();
    System.out.printf("Escribe los ingresos: ");
    int ingresos = sc.nextInt();
    boolean jasp;
    jasp = false;
    jasp = ((edad <= 28) && (nivel_de_estudios > 3) && (ingresos > 28000));
    System.out.print(jasp);
  }
}
