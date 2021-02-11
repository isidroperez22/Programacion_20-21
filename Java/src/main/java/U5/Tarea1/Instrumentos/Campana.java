package U5.Tarea1.Instrumentos;

public class Campana extends Instrumento {
  public Campana() {
    super();
  }

  public void interpretar() {
    for (int i = 0; i < n_nota; i++) {
      if (notas[i] == Nota.DO) {
        System.out.println("do ");
      } else if (notas[i] == Nota.RE) {
        System.out.println("re ");
      } else if (notas[i] == Nota.MI) {
        System.out.println("mi ");
      } else if (notas[i] == Nota.FA) {
        System.out.println("fa ");
      } else if (notas[i] == Nota.SOL) {
        System.out.println("sol ");
      } else if (notas[i] == Nota.LA) {
        System.out.println("la ");
      } else if (notas[i] == Nota.SI) {
        System.out.println("si ");
      }
    }
  }
}
