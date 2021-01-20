package U4.Tarea1.EJ9;

import U4.Tarea1.EJ9.Empleado.jefe;
import U4.Tarea1.EJ9.Empleado.maquinistas;
import U4.Tarea1.EJ9.Empleado.mecanicos;

public class main {
  public static void main(String[] args) {
    // Empleados
    maquinistas m1 = new maquinistas("Manolo Lama", "12345678A", 1300, 1);
    maquinistas m2 = new maquinistas("Paco Gonzalez", "87654321S", 2300, 2);
    mecanicos me1 = new mecanicos("Sergio Leon", 982989891, "hidraulica");
    mecanicos me2 = new mecanicos("Leo Messi", 982989891, "frenos");
    jefe j1 = new jefe("Manuel Pelegrini", "29012189C");
    // Maquinaria
    locomotora l1 = new locomotora("2345AAAA", 8000, 2015);
    vagon v1 = new vagon(100, 50, "Comida");
  }
}
