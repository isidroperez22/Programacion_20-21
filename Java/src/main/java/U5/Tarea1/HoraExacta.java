package U5.Tarea1;

import java.util.Objects;

public class HoraExacta extends Hora {
  int segundo;

  public HoraExacta(int hora, int minuto, int segundo) {
    super(hora, minuto);
    this.segundo = segundo;
  }

  public void setSegundo(int segundo) {
    if (this.segundo < 59) {
      this.segundo = segundo;
    }
  }

  void inc() {
    if (this.segundo > 59) {
      this.minuto++;
      this.segundo = 0;
    } else {
      this.segundo++;
    }
    if (this.minuto > 59) {
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
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof HoraExacta)) return false;
    HoraExacta that = (HoraExacta) o;
    return this.segundo == that.segundo
        && this.hora == ((HoraExacta) o).hora
        && this.minuto == ((HoraExacta) o).minuto;
  }

  @Override
  public int hashCode() {
    return Objects.hash(segundo);
  }

  @Override
  public String toString() {
    return "hora=" + hora + ", minuto=" + minuto + ", segundo=" + segundo + '}';
  }
}
