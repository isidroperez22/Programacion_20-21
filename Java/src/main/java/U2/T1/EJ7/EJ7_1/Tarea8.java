package U2.T1.EJ7.EJ7_1;
// Realiza una programa que calcule las horas transcurridas entre dos horas de dos días de la
// semana. No se tendrán en
// cuenta los minutos ni los segundos. El día de la semana se puede pedir como un número (del 1 al
// 7) o como una cadena
// (de lunes a domingo). Se debe comprobar que el usuario introduce los datos correctamente y
// que el segundo día es
// posterior al primero.
import java.util.Scanner;

public class Tarea8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Que dia es (Pon lo con numeros)");
    int dia = sc.nextInt();
    System.out.println("Dime la hora: ");
    int hora = sc.nextInt();
    System.out.println("Dime otro dia");
    int dia_f = sc.nextInt();
    System.out.println("Escribe otro dia ");
    int hora_f = sc.nextInt();
    int hora_m = 0;
    int dias_m = 0;
    while (dia != dia_f) {
      for (int i = hora; i <= 24; i++) {
        hora++;
      }
      dias_m++;
      dia++;
    }
    System.out.println("hay " + dias_m * hora);
  }
}
