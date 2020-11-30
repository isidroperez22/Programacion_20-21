package U3.EJ3_1;

import java.util.Scanner;

public class Tarea4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduzca la posicion: ");
    String pos = sc.nextLine();
    int columnas = columna(pos);
    int filas = Integer.parseInt(String.valueOf(pos.charAt(1)));
    System.out.println(columnas);
    System.out.println(filas);
    String resultado = "";
    int[][] tabla = new int[8][8];
    for (int i = 0; i < tabla.length; i++) {
      for (int j = 1; j < tabla.length; j++) {
        tabla[i][j] = i;
        System.out.print(tabla[i][j] + " ");
      }
      System.out.println();
    }

    while ((columnas != 0 && columnas != 7) && (filas != 0 && filas != 7)) {
      resultado = columna_in(columnas) + (filas + 1) + " ";
      columnas++;
      filas++;
      System.out.print(resultado);
    }
  }

  static int columna(String pos) {
    String letras = "abcdefgh";
    return letras.indexOf(pos.charAt(0));
  }

  static String columna_in(int columnas) {
    String resultado = "";
    if (columnas == 0) {
      resultado = "a";
    }

    if (columnas == 1) {
      resultado = "b";
    }
    if (columnas == 2) {
      resultado = "c";
    }
    if (columnas == 3) {
      resultado = "d";
    }
    if (columnas == 4) {
      resultado = "e";
    }
    if (columnas == 5) {
      resultado = "f";
    }
    if (columnas == 6) {
      resultado = "g";
    }
    if (columnas == 7) {
      resultado = "h";
    }
    System.out.print(resultado);
    return resultado;
  }
}
