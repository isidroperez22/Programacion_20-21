package U5.Tarea1;

public class Hora12 {
  int hora;
  int minuto;
  String Maniana_Tarde;

  public void setHora(int hora) {
    this.hora = hora;
  }

  public void setMinuto(int minuto) {
    this.minuto = minuto;
  }

  public void setManiana_Tarde(String maniana_Tarde) {
    Maniana_Tarde = maniana_Tarde;
  }

  public Hora12(int hora, int minutos, String Maniana_Tarde) {
    this.hora = hora;
    this.minuto = minutos;
    this.Maniana_Tarde = Maniana_Tarde;
  }

  void inc() {
    if (this.minuto == 59) {
      this.minuto = 0;
      this.hora++;
    } else {
      this.minuto++;
    }
    if (hora > 12) {
      this.hora = 1;
    }
    if (this.Maniana_Tarde.equals("PM")) {
      this.Maniana_Tarde = "AM";
    } else if (this.Maniana_Tarde.equals("AM")) {
      this.Maniana_Tarde = "PM";
    }
  }

  @Override
  public String toString() {
    return "hora=" + hora + ", minuto=" + minuto + ", Maniana_Tarde='" + Maniana_Tarde;
  }
}
