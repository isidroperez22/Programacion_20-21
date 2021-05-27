package ExamenRec2T2021_Isidro.Tarea2;

import java.util.HashSet;
import java.util.Set;

public class Consultas {
  private String fecha;
  private String diagnostico;
  Set<Medicinas> medicinas = new HashSet<>();

  public Consultas(String fecha, String diagnostico) {
    this.fecha = fecha;
    this.diagnostico = diagnostico;
  }

  public String getFecha() {
    return fecha;
  }

  public void setFecha(String fecha) {
    this.fecha = fecha;
  }

  public String getDiagnostico() {
    return diagnostico;
  }

  public void setDiagnostico(String diagnostico) {
    this.diagnostico = diagnostico;
  }

  public Set<Medicinas> getMedicinas() {
    return medicinas;
  }

  public void setMedicinas(Set<Medicinas> medicinas) {
    this.medicinas = medicinas;
  }

  public void addMedicinas(Medicinas medicinas) {
    getMedicinas().add(medicinas);
    System.out.println("Medicina añadida");
  }

  public void delMedicinas(Medicinas medicinas) {
    getMedicinas().add(medicinas);
    System.out.println("Medicina eliminada");
  }

  @Override
  public String toString() {
    return "Consultas{"
        + "fecha='"
        + fecha
        + '\''
        + ", diagnostico='"
        + diagnostico
        + '\''
        + ", medicinas="
        + medicinas
        + '}';
  }
}
