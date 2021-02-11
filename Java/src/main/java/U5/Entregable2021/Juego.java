package U5.Entregable2021;

import java.util.Arrays;

public class Juego {
  int anioCelebracion;
  String sede;
  Pais[] ListaPaises;
  int n_pais = 0;
  Deporte[] Deportes;
  int n_deportes = 0;

  public int getAnioCelebracion() {
    return anioCelebracion;
  }

  public void setAnioCelebracion(int anioCelebracion) {
    this.anioCelebracion = anioCelebracion;
  }

  public String getSede() {
    return sede;
  }

  public void setSede(String sede) {
    this.sede = sede;
  }

  public Pais[] getListaPaises() {
    return ListaPaises;
  }

  public void setListaPaises(Pais[] listaPaises) {
    ListaPaises = listaPaises;
  }

  public Deporte[] getDeportes() {
    return Deportes;
  }

  public void setDeportes(Deporte[] deportes) {
    Deportes = deportes;
  }

  public Juego(int anioCelebracion, String sede) {
    this.anioCelebracion = anioCelebracion;
    this.sede = sede;
    ListaPaises = new Pais[n_pais];
    Deportes = new Deporte[n_deportes];
  }

  void add_pais(Object o) {
    ListaPaises = Arrays.copyOf(ListaPaises, ListaPaises.length + 1);
    ListaPaises[n_pais++] = (Pais) o;
  }

  void add_deportes(Deporte nombreDeporte) {
    Deportes = Arrays.copyOf(Deportes, Deportes.length + 1);
    Deportes[n_deportes] = nombreDeporte;
  }
}
