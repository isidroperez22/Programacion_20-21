package SegundoTrimestre.Tarea8;

public class Domicilio {
  String nom_via;
  int numero;
  String otros_datos;
  int c_postal;

  public Domicilio(String nom_via, int numero, String otros_datos, int c_postal) {
    this.nom_via = nom_via;
    this.numero = numero;
    this.otros_datos = otros_datos;
    this.c_postal = c_postal;
  }

  public String getNom_via() {
    return nom_via;
  }

  public void setNom_via(String nom_via) {
    this.nom_via = nom_via;
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public String getOtros_datos() {
    return otros_datos;
  }

  public void setOtros_datos(String otros_datos) {
    this.otros_datos = otros_datos;
  }

  public int getC_postal() {
    return c_postal;
  }

  public void setC_postal(int c_postal) {
    this.c_postal = c_postal;
  }

  @Override
  public String toString() {
    return "Domicilio{"
        + "nom_via='"
        + nom_via
        + '\''
        + ", numero="
        + numero
        + ", otros_datos='"
        + otros_datos
        + '\''
        + ", c_postal="
        + c_postal
        + '}';
  }
}
