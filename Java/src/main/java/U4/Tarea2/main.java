package U4.Tarea2;

public class main {
  public static void main(String[] args) {
    Lista l = new Lista();
    l.insertar(33);
    l.insertar(3);
    l.insertar(4);
    l.insertar(2);
    l.insertar(1);
    l.mostrarNum(0);
    System.out.println(l.getNum());
  }
}
