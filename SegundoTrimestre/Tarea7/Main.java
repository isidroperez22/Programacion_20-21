package SegundoTrimestre.Tarea7;

public class Main {
  public static void main(String[] args) {
    Libro l1 = new Libro("22/05/2021", "LIBRO123456", "Harry Potter y la piedra filosofal", 1999);
    Libro l2 =
        new Libro("27/03/2019", "LOIBRO09876", "Animales fantasticos y donde encontrarlos", 2001);
    Revistas r1 = new Revistas("08/12/2020", "REVIS456789", "Hola!", 2021, 30);

    l1.estaPrestado();
    l2.devuelve();
    System.out.println(l2.toString());
    l2.presta();

    System.out.println(l1.toString());
    System.out.println(l2.toString());
    System.out.println(r1.toString());
  }
}
