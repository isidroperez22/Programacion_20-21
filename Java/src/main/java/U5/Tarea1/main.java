package U5.Tarea1;

public class main {
  public static void main(String[] args) {
    Hora h = new Hora(0, 23);
    h.setHora(22);
    h.setMinuto(59);
    h.inc();
    System.out.println(h.toString());
    /*------------------HORA12------------------*/
    Hora12 h1 = new Hora12(12, 59, "PM");
    System.out.println(h1.toString());
    h1.inc();
    System.out.println(h1.toString());
    /*-----------------HORA_EXACTA--------------*/
    HoraExacta h2 = new HoraExacta(12, 34, 45);
    HoraExacta h3 = new HoraExacta(12, 34, 45);
    System.out.println(h2.toString());
    System.out.println(h2.toString());
    if (h3.equals(h2)) {
      System.out.println("Son la misma hora");
    } else {
      System.out.println("Son horas distintas");
    }
  }
}
