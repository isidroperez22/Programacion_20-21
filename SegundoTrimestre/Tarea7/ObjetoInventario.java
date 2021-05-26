package SegundoTrimestre.Tarea7;

public abstract class ObjetoInventario {
  String fechaCompra;

  public String getFechaCompra() {
    return fechaCompra;
  }

  public void setFechaCompra(String fechaCompra) {
    this.fechaCompra = fechaCompra;
  }

  public ObjetoInventario(String fechaCompra) {
    this.fechaCompra = fechaCompra;
  }
}
