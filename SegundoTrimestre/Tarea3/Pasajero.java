package SegundoTrimestre.Tarea3;

public class Pasajero {
  String Nombre;
  String Direeccion;
  int n_pasaporte;
  Estado estado;
  private static int num_pasajeros = 0;

  public static int getNum_pasajeros() {
    return num_pasajeros;
  }

  public static void setNum_pasajeros(int num_pasajeros) {
    Pasajero.num_pasajeros = num_pasajeros;
  }

  public String getNombre() {
    return Nombre;
  }

  public void setNombre(String nombre) {
    Nombre = nombre;
  }

  public String getDireeccion() {
    return Direeccion;
  }

  public void setDireeccion(String direeccion) {
    Direeccion = direeccion;
  }

  public int getN_pasaporte() {
    return n_pasaporte;
  }

  public void setN_pasaporte(int n_pasaporte) {
    this.n_pasaporte = n_pasaporte;
  }

  public Estado getEstado() {
    return estado;
  }

  public void setEstado(Estado estado) {
    this.estado = estado;
  }

  public Pasajero(String nombre, String direeccion, int n_pasaporte) {
    setNombre(nombre);
    setDireeccion(direeccion);
    setN_pasaporte(n_pasaporte);
    setEstado(estado.PENDIENTE);
    num_pasajeros++;
  }

  public void sonrie() {
    System.out.println("jajajaja");
  }

  public void embarcar(Avion avion) {
    System.out.println("Estoy montando en el avion " + avion);
    setEstado(estado.EMBARCADO);
  }

  public void andar() {
    System.out.println("Voy para alla");
  }

  public void n_pasajeros() {
    System.out.println("Hay " + num_pasajeros + " pasajeros");
  }

  @Override
  public String toString() {
    return "Pasajero{"
        + "Nombre='"
        + Nombre
        + '\''
        + ", Direeccion='"
        + Direeccion
        + '\''
        + ", n_pasaporte="
        + n_pasaporte
        + ", estado="
        + estado
        + '}';
  }
}
