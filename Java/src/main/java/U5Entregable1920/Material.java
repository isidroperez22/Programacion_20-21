package U5Entregable1920;

public class Material {
  String nombre;
  int masa;
  int quemarse;
  int diluirse;
  boolean movil;

  public Material() {}

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getMasa() {
    return masa;
  }

  public void setMasa(int masa) {
    this.masa = masa;
  }

  public int getQuemarse() {
    return quemarse;
  }

  public void setQuemarse(int quemarse) {
    this.quemarse = quemarse;
  }

  public int getDiluirse() {
    return diluirse;
  }

  public Material(String nombre, int masa, int quemarse, int diluirse, boolean movil) {
    setNombre(nombre);
    setMasa(masa);
    setQuemarse(quemarse);
    setDiluirse(diluirse);
    setMovil(movil);
  }

  public void setDiluirse(int diluirse) {
    this.diluirse = diluirse;
  }

  public boolean isMovil() {
    return movil;
  }

  public void setMovil(boolean movil) {
    this.movil = movil;
  }
}
