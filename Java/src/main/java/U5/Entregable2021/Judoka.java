package U5.Entregable2021;

public class Judoka extends Participante implements Luchar {
  int peso;

  public int getPeso() {
    return peso;
  }

  public void setPeso(int peso) {
    this.peso = peso;
  }

  public Judoka(String nombre, int edad, Pais Pais, int peso) {
    super(nombre, edad, Pais);
    setPeso(peso);
  }

  @Override
  void hacerjuramento() {
    System.out.println(
        "Yo " + this.nombre + ", como judoka, juro los valores deportivos mundiales");
  }

  @Override
  public void luchar() {
    System.out.println("Voy a luchar");
  }
}
