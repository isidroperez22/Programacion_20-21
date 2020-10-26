package U2.T1.EJ7;
// Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4) y suspensos.
import java.util.Scanner;

public class Tarea13 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = 0;
    int cont = 0;
    int suspensos = 0;
    int aprobados = 0;
    int condicion = 0;
    while (cont != 6) {
      n = sc.nextInt();
      if (n < 4) {
        suspensos++;
      } else if (n == 4) {
        condicion++;
      } else {
        aprobados++;
      }
      cont++;
    }
    System.out.println("Hay " + suspensos + " suspensos");
    System.out.println("Hay " + aprobados + " aprobados");
    System.out.println("Hay " + condicion + " condicionales");
  }
}
