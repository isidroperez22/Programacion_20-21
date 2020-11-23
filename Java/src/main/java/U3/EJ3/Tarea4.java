package U3.EJ3;
// Juego: La cámara secreta. El jugador especifica el número de dígitos de la clave secreta. La
// aplicación genera de forma aleatoria, una combinación secreta de n dígitos del 1 al 5 (siendo n
// la longitud indicada anteriormente por el usuario). El jugador introduce ahora una combinación de
// prueba. En cada intento se mostrará como pista, para cada dígito, si es mayor menor o igual que
// el correspondiente de la combinación secreta.
// Ejemplo:
// -Introduzca longitud de la clave
// -3
// (se genera la clave secreta, por ejemplo 152)
// -Intente acertarla
// -351
// -3 es mayor,
// 5 es igual,
// 1 es menor
// - Intente acertarla de nuevo
import java.util.Arrays;
import java.util.Scanner;

public class Tarea4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Cuantos numeros va a tener la contrasenia: ");
    int n = sc.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < a.length; i++) {
      a[i] = (int) (Math.random() * 5 + 1);
    }
    for (int i : a) {
      System.out.print(i);
    }
    System.out.println("Escribe los digitos de la contraseña: ");
    int[] resultado = new int[n];
    for (int i = 0; i < resultado.length; i++) {
      resultado[i] = sc.nextInt();
    }
    while (!Arrays.equals(a, resultado)) {
      for (int i = 0; i < a.length; i++) {
        if (a[i] > resultado[i]) {
          System.out.println(resultado[i] + " es menor");
        } else if (a[i] < resultado[i]) {
          System.out.println(resultado[i] + " es mayor");
        } else {
          System.out.println(resultado[i] + " es igual");
        }
      }
      System.out.println("Intente acertarla de nuevo");
      for (int i = 0; i < resultado.length; i++) {
        resultado[i] = sc.nextInt();
      }
    }
    System.out.println("¡¡Has acertado!!");
  }
}
