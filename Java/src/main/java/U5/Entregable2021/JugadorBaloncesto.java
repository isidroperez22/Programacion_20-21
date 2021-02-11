package U5.Entregable2021;

public class JugadorBaloncesto extends Participante implements Encestar {
  double altura;

  public double getAltura() {
    return altura;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }

  public JugadorBaloncesto(String nombre, int edad, Pais Pais, double altura) {
    super(nombre, edad, Pais);
    setAltura(altura);
  }

  @Override
  void hacerjuramento() {
    System.out.println(
        "Yo "
            + this.nombre
            + ", como jugador de baloncesto, juro los valores deportivos mundiales");
  }

  @Override
  public void encestar() {
    System.out.println("2 puntos!!!!!");
  }
}
