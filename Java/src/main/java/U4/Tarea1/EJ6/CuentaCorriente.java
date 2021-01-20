package U4.Tarea1.EJ6;

class CuentaCorriente {

  // Atributos
  banco banco;
  private long saldo;
  private long limite;
  private String nombre;
  private String dni;
  // Set
  public void setSaldo(long saldo) {
    this.saldo = saldo;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setLimite(long limite) {
    this.limite = limite;
  }

  public void setDni(String dni) {
    this.dni = dni;
  }
  // Get
  private long getSaldo() {
    return saldo;
  }

  private long getLimite() {
    return limite;
  }

  String getNombre() {
    return nombre;
  }

  public String getDni() {
    return dni;
  }
  // Constructores
  public CuentaCorriente(long saldo) {
    setSaldo(saldo);
    this.limite = 0;
  }

  public CuentaCorriente(long saldo, long limite, String dni) {
    this.saldo = saldo;
    this.limite = 0;
    setDni(dni);
  }
  // Metodo
  void cambiarbanco(banco banco) {
    this.banco = banco;
  }

  void mostrar_informacion() {
    System.out.println(banco);
    System.out.println(this.nombre);
    System.out.println(this.dni);
    System.out.println(this.saldo + "€");
    System.out.println(this.limite + "€");
  }
}

class banco {
  String nombre;
  int capital;
  String direccion;

  public banco(String nombre) {
    this.nombre = nombre;
  }

  public void banco(String nombre, int capital, String direccion) {
    this.nombre = nombre;
    this.capital = capital;
    this.direccion = direccion;
  }
}
