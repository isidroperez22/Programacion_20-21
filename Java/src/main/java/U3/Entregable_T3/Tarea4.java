package U3.Entregable_T3;

import java.util.Scanner;

// Juego del buscaminas
//
// Solicitando al usuario una dimensión N crear una vector bidimensional que tenga N filas y N
// columnas.
//
// A continuación rellenar todo el vector colocando en cada casilla de manera aleatoria:
//
// O bien un carácter X que significa que hay una bomba.
// O bien un carácter - que significa que esa casilla no nada.
// A continuación solicitar al jugador una posición hasta que el usuario encuentre una bomba.
//
// En caso de que la casilla del usuario solicitada al usuario no sea una bomba se debe mostrar por
// pantalla la cantidad de bombas que hay en las casillas de alrededor.
//
// Para comprobar que el juego está correcto se mostrar el tablero del juego cada vez (hasta que el
// usuario encuentre una bomba).
public class Tarea4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String t = "x-";
    System.out.println("Escribe el tamaño del buscaminas: ");
    int n = sc.nextInt();
    String[][] a = new String[n][n];
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a.length; j++) {
        a[i][j] = String.valueOf(t.charAt((int) (Math.random() * 2)));
      }
    }
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a.length; j++) {
        System.out.print(a[i][j]);
      }
      System.out.println();
    }
    System.out.println("Introduca una posicion;");
  }
}
