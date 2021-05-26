package SegundoTrimestre.Tarea7;

public class Publicacion extends ObjetoInventario {
  private String ISBN;
  private String titulo;
  private int publicacion;

  public Publicacion(String fechaCompra, String ISBN, String titulo, int publicacion) {
    super(fechaCompra);
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

  @Override
  public String toString() {
    return "Publicacion{"
        + "fechaCompra='"
        + fechaCompra
        + '\''
        + ", ISBN='"
        + ISBN
        + '\''
        + ", titulo='"
        + titulo
        + '\''
        + ", publicacion="
        + publicacion
        + '}';
  }
}
