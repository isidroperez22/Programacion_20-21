package U3.Pruebas;
// Hacer una algoritmo que solicite al usuario una cifra N y rellene un array bidimensional de N
// filas y N columnas con número aleatorios entre 100 y 200.
//
// Mostrar dicho array y a continuación rotarlo 90 grados:
//
// Ejemplo:
//
// Introduce la dimensión del Array: 5

import java.util.Scanner;

public class t1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.printf("dimension del arrays: ");
    int dimension = sc.nextInt();
    int[][] a = new int[dimension][dimension];
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a.length; j++) {
        a[i][j] = (int) (Math.random() * 100 + 100);
      }
    }
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a.length; j++) {
        System.out.print(a[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println("El arrays girado noventa grados es: ");
    int[][] resultado = new int[dimension][dimension];
    int cont = 0;
    int cont1 = a.length - 1;
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a.length; j++) {
        resultado[i][j] = a[cont1][cont];
        cont1--;
      }
      cont++;
      cont1 = a.length - 1;
    }
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a.length; j++) {
        System.out.print(resultado[i][j] + " ");
      }
      System.out.println();
    }
  }
}
