package U3.Pruebas;
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
import java.util.Scanner;

public class t2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Dimension del tablero: ");
    int dimension = sc.nextInt();
    String bombas = "-X";
    String[][] tablero = new String[dimension][dimension];
    for (int i = 0; i < tablero.length; i++) {
      for (int j = 0; j < tablero.length; j++) {
        tablero[i][j] = String.valueOf(bombas.charAt((int) (Math.random() * 2)));
      }
    }
    for (int i = 0; i < tablero.length; i++) {
      for (int j = 0; j < tablero.length; j++) {
        System.out.print(tablero[i][j]);
      }
      System.out.println();
    }
    System.out.println("EScribe una posicion: ");
    int x = sc.nextInt();
    int y = sc.nextInt();
    int cont_bombas = 0;
    do {
      while (x >= 0 && x < tablero.length || y >= 0 && y < tablero.length) {
        if (tablero[x][y].equals("X")) {
          cont_bombas++;
        }
        x++;
        y++;
      }
      //      if (x >= 0 && x < tablero.length || y >= 0 && y < tablero.length) {
      //        if (x + 1 >= 0 && x + 1 < tablero.length || y + 1 >= 0 && y + 1 < tablero.length) {
      //          cont_bombas++;
      //        }
      //      }
      System.out.println("Hay " + cont_bombas + " minas");
      x = sc.nextInt();
      y = sc.nextInt();
    } while (tablero[x][y].equals("X"));
  }
}
