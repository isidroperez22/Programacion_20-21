package U4.Tarea1.Entregable2021;

import java.util.Date;

public class main {
  public static void main(String[] args) {
    ListaEnemigo[] listaEnemigos =
        new ListaEnemigo[] {
          ListaEnemigo.BUZZ_BOMBER,
          ListaEnemigo.MOTOBUG,
          ListaEnemigo.CHOPPER,
          ListaEnemigo.CRABMEAT,
          ListaEnemigo.MOTOBUG
        };
    Personaje p = new Personaje();
    Personaje p1 = new Personaje(ListaPersonaje.KNUCKLES, 80, 70, 20);
    System.out.println(p);
    Enemigo en = new Enemigo(ListaEnemigo.COCONUTS);
    System.out.println(en);
    en.patada(p1);
    System.out.println(en);
    Escenario e = new Escenario();
    Escenario e1 = new Escenario(100, 200, 500, 3, listaEnemigos, null);
    e1.add_enemigo(ListaEnemigo.BUZZ_BOMBER);
    e.setLista_enemigos(listaEnemigos);
    System.out.println(e);
    Videojuego v = new Videojuego(p, e, new Date());
    Videojuego v1 = new Videojuego(p1, e1, new Date());
    System.out.println(v);
    System.out.println(v1);
  }
}
