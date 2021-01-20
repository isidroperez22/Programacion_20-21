package U4.Tarea1.EJ5;

public class Texto {
  String cadena;
  String texto;
  int long_max = 10;
  String vocal = "aeiouáéíóú";

  public void addtexto(String texto) {
    if (texto.length() > long_max) {
      cadena = cadena + texto;
    }
  }

  public void add_car(char cad) {
    if (texto.length() < long_max) {
      cadena = cadena + cad;
    }
  }

  public void add_str(String cad) {
    if (texto.length() + cad.length() <= long_max) {
      cadena = cadena + cad;
    }
  }

  public void add_carf(char cad) {
    if (cadena.length() < long_max) {
      cadena = cad + cadena;
    }
  }

  public void add_strf(String cad) {
    if (cadena.length() + cad.length() <= long_max) {
      cadena = cad + cadena;
    }
  }

  public int numVocal() {
    int voc = 0;
    for (int i = 0; i < cadena.length(); i++) {
      for (int j = 0; j < vocal.length(); j++) {}
    }
    return voc;
  }

  public void mostrar() {
    System.out.println(cadena);
  }
}
