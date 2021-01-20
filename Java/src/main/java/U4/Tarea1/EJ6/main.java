package U4.Tarea1.EJ6;

public class main {
  public static void main(String[] args) {
    banco b = new banco("Caixa");
    CuentaCorriente c1 = new CuentaCorriente(50);
    CuentaCorriente c2 = new CuentaCorriente(100, -10, "12334567C");
    CuentaCorriente c3 = new CuentaCorriente(200, -50, "12334547X");
    c1.mostrar_informacion();
    System.out.println("---------------");
    c2.mostrar_informacion();
    System.out.println("---------------");
    c3.mostrar_informacion();
    System.out.println("---------------");
    c1.mostrar_informacion();
  }
}
