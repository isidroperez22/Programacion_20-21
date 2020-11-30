package U3.EJ3;

import java.util.Arrays;

// Queremos desarrollar una aplicación que nos ayude a gestionar las notas de un centro educativo.
// Cada clase está compuesta por 5 alumnos. Se pide leer las notas (números enteros) de cada uno de
// los alumnos en el primer trimestre, luego, las del segundo, y luego, las del tercero. Debemos
// mostrar, al final, la nota media del grupo en cada trimestre, y la media del alumno que se
// encuentra en la posición pos (que se lee por teclado). (Podéis hacerlo usando 3 vectores -uno por
// trimestre-, o usando una matriz bidimensional en la que las filas sean los trimestres y las
// columnas los alumnos).
public class Tarea7 {
  public static void main(String[] args) {
    System.out.println("Escribe las notas: ");
    int[][] notas = new int[3][5];
    for (int i = 0; i < notas.length; i++) {
      for (int j = 0; j < notas[i].length; j++) {
        notas[i][j] = (int) (Math.random() * 10 + 1);
      }
    }
    for (int[] nota : notas) {
      for (int j = 0; j < notas[2].length; j++) {
        System.out.print(nota[j] + " ");
      }
      System.out.println();
    }

    int suma = 0;
    int[] media = new int[5];
    System.out.println("Media:");
    int cont = 0;
    for (int i = 0; i < media.length; i++) {
      for (int j = 0; j < 3; j++) {
        suma = suma + notas[cont++][i];
      }
      media[i] = suma / 3;
      suma = 0;
      cont = 0;
    }
    System.out.println(Arrays.toString(media));
  }
}
