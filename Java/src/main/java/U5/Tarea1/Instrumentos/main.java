package U5.Tarea1.Instrumentos;

public class main {
  public static void main(String[] args) {
    Piano p = new Piano();
    p.add(Nota.DO);
    p.add(Nota.FA);
    p.add(Nota.SOL);
    p.interpretar();
  }
}
