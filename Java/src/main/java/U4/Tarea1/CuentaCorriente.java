package U4.Tarea1;

public class CuentaCorriente {
  private long saldo;
  private long limite;
  private String nombre;
  private String dni;

  void crear_cuenta(String titular, String identificacion) {
    nombre = titular;
    dni = identificacion;
    saldo = 0;
    limite = -50;
  }

  boolean sacar_dinero(long dinero) {
    boolean confirma = false;
    if (saldo - dinero <= limite) {
      saldo = saldo - dinero;
      confirma = true;
    }
    return confirma;
  }

  void ingresar_saldo(long dinero) {
    if (dinero > 0) {
      saldo = saldo + dinero;
    }
  }

  void mostrar_informacion() {
    System.out.println(nombre);
    System.out.println(dni);
    System.out.println(saldo + "€");
    System.out.println(limite + "€");
  }
}
