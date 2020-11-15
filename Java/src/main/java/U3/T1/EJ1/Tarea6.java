package U3.T1.EJ1;

import java.util.Scanner;

public class Tarea6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Escribe un caracter: ");
    String vocal = sc.nextLine();
    es_vocal(vocal);
  }

  static boolean es_vocal(String vocal) {
    boolean vo;
    if (vocal.equals("a")
        || vocal.equals("e")
        || vocal.equals("i")
        || vocal.equals("o")
        || vocal.equals("u")
        || vocal.equals("A")
        || vocal.equals("E")
        || vocal.equals("I")
        || vocal.equals("O")
        || vocal.equals("U")
        || vocal.equals("á")
        || vocal.equals("é")
        || vocal.equals("í")
        || vocal.equals("ó")
        || vocal.equals("ú")) {
      vo = true;
    } else {
      vo = false;
    }
    System.out.println(vo);
    return vo;
  }
}
