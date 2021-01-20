package U4.Tarea1.EJ8;

public class bombilla {
  private boolean interruptor;
  public static boolean intGeneral = true;

  public bombilla() {
    this.interruptor = false;
  }

  public void encendido() {
    this.interruptor = true;
  }

  public void apagado() {
    this.interruptor = false;
  }

  public boolean estado() {
    boolean estado;
    if (interruptor == true && intGeneral == true) {
      estado = true;
    } else {
      estado = false;
    }
    return estado;
  }

  public String MostrarEstado() {
    String est;
    if (estado() == true) {
      est = "Encendido";
    } else {
      est = "apagado";
    }
    System.out.println(est);
    return (est);
  }
}
