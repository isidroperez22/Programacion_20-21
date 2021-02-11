package U5.Tarea1;

public class Hora {
  int hora;
  int minuto;

  public void setHora(int hora) {
    this.hora = hora;
  }

  public void setMinuto(int minuto) {
    this.minuto = minuto;
  }

  public Hora(int hora, int minuto) {
    this.hora = hora;
    this.minuto = minuto;
  }

  void inc() {
    if (this.minuto == 59) {
      this.minuto = 0;
      this.hora++;
    } else {
      this.minuto++;
    }
    if (hora > 23) {
      this.hora = 0;
    }
  }

  @Override
  public String toString() {
    return "Hora{" + "hora=" + hora + ", minuto=" + minuto + '}';
  }
}
