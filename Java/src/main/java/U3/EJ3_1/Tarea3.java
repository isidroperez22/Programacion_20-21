package U3.EJ3_1;

import java.util.Arrays;
import java.util.Scanner;

public class Tarea3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] nmesa = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int[] ocupado = new int[10];
    for (int i = 0; i < ocupado.length; i++) {
      ocupado[i] = (int) (Math.random() * 4);
    }
    System.out.println("Nº Mesa: " + Arrays.toString(nmesa));
    System.out.println("Ocupantes: " + Arrays.toString(ocupado));
    System.out.println("Cuantos ocupantes hay: ");
    int comensales = sc.nextInt();
    do {
      while (comensales > 4) {
        System.out.println(
            "Lo siento, no admitimos grupos de "
                + comensales
                + " haga grupos de 4 personas como  máximo e intente de nuevo");
        comensales = sc.nextInt();
      }
      int cont = 0;
      for (int j : ocupado) {
        if (j + comensales > 4) {
          cont++;
        }
      }
      if (cont == 10) {
        System.out.println("Lo siento en este momento no queda sitio");
      }
      for (int i = 0; i < ocupado.length; i++) {
        if (ocupado[i] == 0) {
          ocupado[i] = comensales;
          break;
        }
      }
      for (int i = 0; i < ocupado.length; i++) {
        if (ocupado[i] + comensales <= 4 && (ocupado[i] > 0)) {
          ocupado[i] = ocupado[i] + comensales;
          break;
        }
      }
      System.out.println("Nº Mesa: " + Arrays.toString(nmesa));
      System.out.println("Ocupantes: " + Arrays.toString(ocupado));
      comensales = sc.nextInt();
      while (comensales > 4) {
        System.out.println(
            "Lo siento, no admitimos grupos de "
                + comensales
                + " haga grupos de 4 personas como  máximo e intente de nuevo");
        comensales = sc.nextInt();
      }
    } while (comensales != -1);
    System.out.println("Gracias, hasta pronto");
  }
}
