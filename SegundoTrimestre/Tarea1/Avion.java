package SegundoTrimestre.Tarea1;

public class Avion {
  private String Aerolinea;
  private Double Longitud;
  private String Modelo;
  private ModoVuelo modoVuelo;

  public String getAerolinea() {
    return Aerolinea;
  }

  public void setAerolinea(String aerolinea) {
    Aerolinea = aerolinea;
  }

  public Double getLongitud() {
    return Longitud;
  }

  public void setLongitud(Double longitud) {
    Longitud = longitud;
  }

  public String getModelo() {
    return Modelo;
  }

  public void setModelo(String modelo) {
    Modelo = modelo;
  }

  public ModoVuelo getModoVuelo() {
    return modoVuelo;
  }

  public void setModoVuelo(ModoVuelo modoVuelo) {
    this.modoVuelo = modoVuelo;
  }

  public Avion(String aerolinea, Double longitud, String modelo, ModoVuelo modoVuelo) {
    setAerolinea(aerolinea);
    setLongitud(longitud);
    setModelo(modelo);
    setModoVuelo(modoVuelo);
  }

  public void despegar() {
    System.out.println("El avion va a despegar");
  }

  public void aterrizar() {
    System.out.println("El avion va a aterreziar");
  }

  public void volar() {
    System.out.println("El avion esta volando");
  }

  @Override
  public String toString() {
    return "Avion{"
        + "Aerolinea='"
        + Aerolinea
        + '\''
        + ", Longitud="
        + Longitud
        + ", Modelo='"
        + Modelo
        + '\''
        + ", modoVuelo="
        + modoVuelo
        + '}';
  }
}
