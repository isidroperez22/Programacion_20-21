package U5.Entregable2021;

public class main {
  public static void main(String[] args) {
    Juego j = new Juego(2021, "Madrid");
    Pais Esp = new Pais("Espania");
    Pais Fra = new Pais("Francia");
    Deporte d = new Atletismo("100M", "Holas 2", 1);
    Atleta a = new Atleta("Manolo", 33, Esp, "100M");
    a.correr();
    j.add_pais(Esp);
    j.add_pais(Fra);
  }
}
