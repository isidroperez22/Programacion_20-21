package SegundoTrimestre.Tarea6;

public class Libro extends Publicacion implements Prestable {
  Boolean prestado;

  public Boolean getPrestado() {
    return prestado;
  }

  public void setPrestado(Boolean prestado) {
    this.prestado = prestado;
  }

  public Libro(String ISBN, String titulo, int publicacion) {
    super(ISBN, titulo, publicacion);
    this.prestado = false;
  }

  @Override
  public void presta() {
    System.out.println("Se esta prestando " + getTitulo());
    setPrestado(true);
  }

  @Override
  public void devuelve() {
    System.out.println("Se esta devolviendo " + getTitulo());
  }

  @Override
  public void estaPrestado() {
    System.out.println(getTitulo() + " esta prestado");
    setPrestado(true);
  }

  @Override
  public String toString() {
    return "Libro{" + "prestado=" + prestado + '}';
  }
}
