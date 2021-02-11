package U5.Entregable2021;

public class Atleta extends Participante implements Correr {
  String prueba;

  public String getPrueba() {
    return prueba;
  }

  public void setPrueba(String prueba) {
    this.prueba = prueba;
  }

  public Atleta(String nombre, int edad, Pais Pais, String prueba) {
    super(nombre, edad, Pais);
    setPrueba(prueba);
  }

  @Override
  void hacerjuramento() {
    System.out.println(
        "Yo " + this.nombre + ", como atleta, juro los valores deportivos mundiales");
  }

  @Override
  public void correr() {
    System.out.println("Voy a correr");
  }
}
