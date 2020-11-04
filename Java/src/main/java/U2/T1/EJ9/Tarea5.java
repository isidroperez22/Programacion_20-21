package U2.T1.EJ9;

import java.util.Scanner;

public class Tarea5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String muletilla_inicio = "Javalín, javalón";
    String muletilla_final = "javalén, len, len";

    System.out.println("Introduzca la frase para traducir: ");
    String frase = sc.nextLine();

    String mul_i_frase = frase.substring(0, muletilla_inicio.length());
    if (mul_i_frase.equals(muletilla_inicio)) {
      System.out.println("Pertenece al primer dialecto.");
      String sin_muletillas = frase.substring(muletilla_inicio.length(), frase.length());
      System.out.println("Traducido: " + sin_muletillas);
    }

    int pos_inicio_mfinal = frase.length() - muletilla_final.length();
    String mul_f_frase = frase.substring(pos_inicio_mfinal, frase.length());
    if (mul_f_frase.equals(muletilla_final)) {
      System.out.println("Pertenece al segundo dialecto.");
      String sin_muletillas = frase.substring(0, pos_inicio_mfinal);
      System.out.println("Traducido: " + sin_muletillas);
    }
  }
}
