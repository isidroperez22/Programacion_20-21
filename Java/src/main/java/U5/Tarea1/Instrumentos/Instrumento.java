package U5.Tarea1.Instrumentos;

public abstract class Instrumento {
  Nota notas[];
  int n_nota;
  int max_tabla = 100;

  public Instrumento() {
    this.notas = new Nota[max_tabla];
    this.n_nota = 0;
  }

  public void add(Nota n) {
    if (notas.length > n_nota) {
      notas[n_nota] = n;
      n_nota++;
    }
  }

  abstract void interpretar();
}
