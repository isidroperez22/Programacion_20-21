package U4.Tarea1.EJ1;

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

  void ingresar_saldo(long dinero) {
    if (dinero > 0) {
      this.saldo = saldo + dinero;
    }
  }

  boolean sacar_dinero(long dinero) {
    boolean confirma = false;
    if (saldo - dinero >= limite) {
      this.saldo = saldo - dinero;
      confirma = true;
    }
    return confirma;
  }

  void mostrar_informacion() {
    System.out.println(this.nombre);
    System.out.println(this.dni);
    System.out.println(this.saldo + "€");
    System.out.println(this.limite + "€");
  }
}
