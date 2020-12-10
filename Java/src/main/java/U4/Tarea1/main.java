package U4.Tarea1;

public class main {
  public static void main(String[] args) {
    CuentaCorriente c1 = new CuentaCorriente();

    c1.crear_cuenta("Manolo Lama", "12345678A");
    if (c1.sacar_dinero(30)) {
      System.out.println("Ha sacado dinero");
    } else {
      System.out.println("Lo siento no puede sacar ese dinero");
    }
    c1.ingresar_saldo(300);
    c1.mostrar_informacion();
  }
}
