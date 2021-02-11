package U5.Tarea1.Instrumentos;

public class Piano extends Instrumento {
  public Piano() {
    super();
  }

  @Override
  public void interpretar() {
    for (int i = 0; i < n_nota; i++) {
      System.out.println(notas[i]);
    }
  }
}
