package U3.Entregable_T3;

import java.util.Scanner;

// Crea una función con la siguiente cabecera:
//
// public String convierteEnMorse(int n)
//
// Esta función convierte el número n al sistema Morse y lo devuelve en una
// cadena de caracteres. Por ejemplo, el 213 es el . . _ _ _ . _ _ _ _ . . . _ _ en
// Morse. Utiliza esta función en un programa para comprobar que funciona bien.
// Desde la función no se debe mostrar nada por pantalla, solo se debe usar print
// desde el programa principal.
public class Tarea2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Escribe un numero: ");
    int n = sc.nextInt();
    System.out.println(convierteEnMorse(n));
  }

  static String convierteEnMorse(int n) {
    String resultado = "";
    int num = 0;
    while (n != 0) {
      num = n % 10;
      n = n / 10;
      if (num == 1) {
        resultado = ". _ _ _ _ " + resultado;
      } else if (num == 2) {
        resultado = ". . _ _ _ " + resultado;
      } else if (num == 3) {
        resultado = ". . . _ _ " + resultado;
      } else if (num == 4) {
        resultado = ". . . . _ " + resultado;
      } else if (num == 5) {
        resultado = ". . . . . " + resultado;
      } else if (num == 6) {
        resultado = "_ . . . . " + resultado;
      } else if (num == 7) {
        resultado = "_ _ . . . " + resultado;
      } else if (num == 8) {
        resultado = "_ _ _ . . " + resultado;
      } else if (num == 9) {
        resultado = "_ _ _ _ . " + resultado;
      } else if (num == 0) {
        resultado = "_ _ _ _ _ " + resultado;
      }
    }
    return resultado;
  }
}
