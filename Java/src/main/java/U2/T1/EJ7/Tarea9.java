package U2.T1.EJ7;
// Un centro de investigación de la flora urbana necesita una aplicación que muestre cual es el
// árbol más alto.
// Para ello se introducirán por teclado las alturas en cms de cada árbol, terminando cuando se
// introduzca -1.
// Los árboles se identifican mediante etiquetas con números correlativos, comenzando en 0.

import java.util.Scanner;

public class Tarea9 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Escribe la altura de los arboles:");
    int altura = sc.nextInt();
    int h = 0;
    while (altura > 0) {
      if (altura > h) {
        h = altura;
      }
      altura = sc.nextInt();
    }
    System.out.println("EL arbol mas alto mide: " + h + " cm");
  }
}
