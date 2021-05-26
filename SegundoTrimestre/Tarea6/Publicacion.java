package SegundoTrimestre.Tarea6;

public class Publicacion {
  private String ISBN;
  private String titulo;
  private int publicacion;

  public Publicacion(String ISBN, String titulo, int publicacion) {
    this.ISBN = ISBN;
    this.titulo = titulo;
    this.publicacion = publicacion;
  }

  public String getISBN() {
    return ISBN;
  }

  public void setISBN(String ISBN) {
    this.ISBN = ISBN;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public int getPublicacion() {
    return publicacion;
  }

  public void setPublicacion(int publicacion) {
    this.publicacion = publicacion;
  }
}
