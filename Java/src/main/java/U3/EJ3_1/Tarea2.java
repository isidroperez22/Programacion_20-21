package U3.EJ3_1;
// Escribe un programa que pida 8 palabras y las almacene en un array. Acontinuación, las palabras
// correspondientes a
// colores se deben almacenar al comienzo y las que no son colores a continuación.
// Puedes utilizar tantos arrays auxiliares como quieras. Los colores que conoce el programa deben
// estar enotro array
// y son los siguientes: verde, rojo, azul, amarillo, naranja, rosa, negro,blanco y morado.

import java.util.Arrays;

public class Tarea2 {
  public static void main(String[] args) {
    String[] palabras = {"casa", "azul", "verde", "orden", "morado", "bombilla", "bici", "rosa"};
    String[] resultado = new String[palabras.length];
    String[] colores = {
      "verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"
    };
    int cont = 0;
    for (String palabra : palabras) {
      for (String color : colores) {
        if (palabra.equals(color)) {
          resultado[cont++] = palabra;
        }
      }
    }
    System.out.println(Arrays.toString(resultado));
    for (String palabra : palabras) {
      boolean es_color = false;
      for (String color : colores) {
        if (palabra.equals(color)) {
          es_color = true;
          break;
        }
      }
      if (!es_color) {
        resultado[cont++] = palabra;
      }
    }
    System.out.println(Arrays.toString(resultado));
  }
}
