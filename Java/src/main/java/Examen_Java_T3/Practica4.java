package Examen_Java_T3;

public class Practica4 {
  public static void main(String[] args) {
    int[] a = {1, 2, 3};

    convierteArrayEnString(a);
  }

  public static String convierteArrayEnString(int[] a) {
    String cadena = "";
    String[] array = new String[a.length];
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i]);
    }
    System.out.println(cadena);
    return cadena;
  }
}
