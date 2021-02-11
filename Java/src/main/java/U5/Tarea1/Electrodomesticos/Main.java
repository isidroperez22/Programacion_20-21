package U5.Tarea1.Electrodomesticos;

public class Main {
  public static void main(String[] args) {
    Lavadora e = new Lavadora(60);
    Lavadora L = new Lavadora(50, Color.BLANCO, ConsumoEnergetico.A, 40);
    Lavadora u = new Lavadora(50, Color.BLANCO, ConsumoEnergetico.F, 80);
    Televison t = new Televison(100, Color.NEGRO, ConsumoEnergetico.A, 25, 90, true);

    System.out.println(L.compareTo(e));
    System.out.println(L.compareTo(u));
    System.out.println(e.compareTo(u));
    System.out.println(e.toString());
    System.out.println(t.toString());
  }
}
