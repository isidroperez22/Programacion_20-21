package Tema8JSON;

import com.google.gson.Gson;

import java.util.ArrayList;

// Se desea generar una cadena en formato json que contenga la alineación de la selección española
// que ganó el mundial de Fútbol.
//
// Se tiene por tanto, que implementar una clase Futbolista, que contenga un entero para el dorsal,
// un String para el nombre y una lista de dermacaciones posibles en las que puede jugar. También se
// tendrá un atributo (un String) para el equipo del que procede.
//
// Los datos son los siguientes:
//
// 1, "Casillas", ["Portero"], "Real Madrid"
// 15, "Ramos", ["Lateral derecho", "Medio centro"], "Real Madrid"
// 3, "Pique", ["Central"], "FC Barcelona"
// 5, "Puyol", ["Central"], "FC Barcelona"
// 11, "Capdevila", ["Lateral izquierdo"] "Villareal"
// 14, "Xabi Alonso", ["Defensa mediocampo", "Mediocampo"], "Real Madrid"
// 16, "Busquets", ["Defensa mediocampo"], "FC Barcelona"
// 8, "Xavi Hernandez", ["Mediocampo"], "FC Barcelona"
// 18, "Pedrito", ["Extremo izquierdo", "Falso extremo"], "FC Barcelona
// 6, "Iniesta", ["Extremo derecho", "Mediocampo"], "FC Barcelona"
// 7, "Villa", ["Delantero centro"], "FC Barcelona"
//
// En el fichero principal por tanto, se debe crear un ArrayList de Futbolistas con la información
// anterior, y a partir de él y utilizando Gson generar una única String en formato Json que se
// deberá mostrar por pantalla.
public class Tarea5 {
  public static void main(String[] args) {
    Gson gson =new Gson();
    Futbolista casillas = new Futbolista("Casillas", 1, "Real Madrid");
    Futbolista ramos = new Futbolista("Ramos", 15, "Real Madrid");
    Futbolista pique = new Futbolista("Puyol", 3, "Barcelona ");
    Futbolista puyol = new Futbolista("Pique", 5, "Real Madrid");
    Futbolista capdevila = new Futbolista("Capdevila", 11, "Villareal");
    Futbolista xabi = new Futbolista("Xabi Alonso", 14, "Real Madrid");
    Futbolista busi = new Futbolista("Busquets", 16, "Barcelona");
    Futbolista xavi = new Futbolista("Xavi", 8, "Barcelona");
    Futbolista pedro = new Futbolista("Pedrito", 18, "Barcelona");
    Futbolista iniesta = new Futbolista("Iniesta", 6, "Barcelona");
    Futbolista villa = new Futbolista("Villa", 7, "Barcelona");
    casillas.posicion(Posicion.POR);
    ramos.posicion(Posicion.LD);
    ramos.posicion(Posicion.MC);
    puyol.posicion(Posicion.DFC);
    pique.posicion(Posicion.DFC);
    capdevila.posicion(Posicion.LI);
    xabi.posicion(Posicion.MCD);
    xabi.posicion(Posicion.MC);
    busi.posicion(Posicion.MCD);
    xavi.posicion(Posicion.MC);
    pedro.posicion(Posicion.EI);
    pedro.posicion(Posicion.SDI);
    iniesta.posicion(Posicion.MCO);
    iniesta.posicion(Posicion.ED);
    villa.posicion(Posicion.DC);

    System.out.println(gson.toJson(casillas));
    System.out.println(gson.toJson(ramos));
    System.out.println(gson.toJson(pique));
    System.out.println(gson.toJson(puyol));
    System.out.println(gson.toJson(capdevila));
    System.out.println(gson.toJson(xabi));
    System.out.println(gson.toJson(busi));
    System.out.println(gson.toJson(xavi));
    System.out.println(gson.toJson(pedro));
    System.out.println(gson.toJson(iniesta));
    System.out.println(gson.toJson(villa));

    System.out.println();
      // Utilizando de inicio el String en formato Json generado en el ejercicio anterior, componer el
      // código necesario para a partir de él, obtener un ArrayList de Futbolista con la información
      // del String.
    String json_ramos = gson.toJson(ramos);
    Futbolista ramos2 = gson.fromJson(json_ramos, Futbolista.class);
    System.out.println(ramos2);
    System.out.println();
    // Obtener en un ArrayList independiente, la lista de dermacaciones posibles de "Ramos" e
    // imprimirla por pantalla.
      ArrayList<Posicion> posicions = new ArrayList<>(ramos2.getPosicion());
    System.out.println(posicions);
    // Teniendo en cuenta el JSON que se adjunta, siguiendo la temática futbolística, intenta
    // modelar las clases necesarias, modificando las que ya tenías en ejercicios anteriores para
    // realizar una petición Retrofit a la siguiente URL:
    //
    // baseUrl: https://my-json-server.typicode.com/chemaduran/futbolistas_api_demo/
    //
    // listFutbolistas: (baseUrl) + jugadores
    //
    // El ejercicio deberá ser similar al del vídeo que se adjunta, y se deberá sacar por pantalla
    // el objeto final con los jugadores rellenos de la petición HTTP.


  }
}
