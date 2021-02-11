package U5.Tarea1.Caja;

public class main {
  public static void main(String[] args) {
    Caja c = new Caja(100, 100, 100, Unidades.M);
    c.etiqueta = "Calle de abajo Nº33, Don Ramon";
    System.out.println(c.getVolumen());
    System.out.println(c.toString());
    CajaCarton cc = new CajaCarton(50, 10, 1);
    cc.etiqueta = 1;
    System.out.println(cc.toString());
  }
}
