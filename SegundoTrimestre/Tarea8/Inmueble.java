package SegundoTrimestre.Tarea8;

public class Inmueble {
  String r_catastral;
  int anio_construccion;
  Domicilio domicilio;

  public Inmueble(String r_catastral, int anio_construccion, Domicilio domicilio) {
    this.r_catastral = r_catastral;
    this.anio_construccion = anio_construccion;
    this.domicilio = domicilio;
  }

  public Inmueble(Vivienda vivienda) {}

  public String getR_catastral() {
    return r_catastral;
  }

  public void setR_catastral(String r_catastral) {
    this.r_catastral = r_catastral;
  }

  public int getAnio_construccion() {
    return anio_construccion;
  }

  public void setAnio_construccion(int anio_construccion) {
    this.anio_construccion = anio_construccion;
  }

  public Domicilio getDomicilio() {
    return domicilio;
  }

  public void setDomicilio(Domicilio domicilio) {
    this.domicilio = domicilio;
  }

  @Override
  public String toString() {
    return "Inmueble{"
        + "r_catastral='"
        + r_catastral
        + '\''
        + ", anio_construccion="
        + anio_construccion
        + ", domicilio="
        + domicilio
        + '}';
  }
}
