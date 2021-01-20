package U4.Tarea1.EJ2;

public class main {
  public static void main(String[] args) {
    CuentaCorriente c1 = new CuentaCorriente(50);
    CuentaCorriente c2 = new CuentaCorriente(100, -10, "12334567C");
    c1.mostrar_informacion();
    System.out.println("---------------");
    c2.mostrar_informacion();
  }
}
