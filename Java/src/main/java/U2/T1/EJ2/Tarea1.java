package U2.T1.EJ2;

import java.util.Scanner;
// Ejercicio3-1: Crea un programa que calcule y muestre la suma de dos números de dos cifras (de
// tipo byte) que introduzca el usuario.
public class Tarea1 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    byte x = teclado.nextByte();
    byte i = teclado.nextByte();
    System.out.println(x + i);
  }
}
