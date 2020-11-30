package U3.EJ3_1;

import java.util.Arrays;
import java.util.Scanner;

// Escribe un programa que rellene un array de 100 elementos con números en-teros aleatorios
// comprendidos entre 0 y 500 (ambos incluidos). A continuaciónel programa mostrará el array y
// preguntará si el usuario quiere destacar elmáximo o el mínimo. Seguidamente se volverá a mostrar
// el array escribiendoel número destacado entre dobles asteriscos.
public class Tarea1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] a = new int[100];
    for (int i = 0; i < a.length; i++) {
      a[i] = (int) (Math.random() * 500 + 1);
    }
    System.out.println(Arrays.toString(a));
    System.out.println("¿Que numero quieres destacar? El maximo (Escribe 1) o el minimo 2");
    int m = sc.nextInt();
    while ((m != 1) && (m != 2)) {
      System.out.println("Por favor escribe 1 o 2");
      m = sc.nextInt();
    }
    System.out.println(Arrays.toString(a));
    int max = 0;
    int min = 500;
    if (m == 1) {
      for (int i = 0; i < a.length; i++) {
        if (a[i] > max) {
          max = a[i];
        }
      }
      for (int i = 0; i < a.length; i++) {
        System.out.print(a[i] + " ");
        if (a[i] == max) {
          System.out.print("**" + max + "** ");
        }
      }
    }
    if (m == 2) {
      for (int i = 0; i < a.length; i++) {
        if (a[i] < min) {
          min = a[i];
        }
      }
      for (int i = 0; i < a.length; i++) {
        System.out.print(a[i] + " ");
        if (a[i] == min) {
          System.out.print("**" + min + "** ");
        }
      }
    }
  }
}
