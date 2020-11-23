package U3.EJ2;
// Introducir por teclado una frase palabra a palabra, y mostrar la frase completa separando las
// palabras introducidas
// con espacios en blanco. Terminar de leer la frase cuando la palabra introducida sea "fin" escrita
// con cualquier combinación de mayúsculas/minúsculas. La cadena "fin" no aparecerá en la frase
// final.
import java.util.Scanner;

public class Tarea1 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce una palabra");
    String palabra = sc.nextLine();
    String fin = "fin";
    String frase = "";
    String espacio = " ";
    do {
      frase = frase + palabra + espacio;
      palabra = sc.nextLine();
    } while (palabra.equalsIgnoreCase(fin) == false);
    System.out.println(frase);
  }
}
