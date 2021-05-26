package SegundoTrimestre.Tarea8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Vivienda extends Inmueble implements Comparable<Vivienda> {
  private Persona propietario;
  private Tipo_vivienda tipoVivienda;
  private Boolean vendida;
  private ArrayList<Oferta> ListaOfertas = new ArrayList<>();

  public Vivienda(
      String r_catastral,
      int anio_construccion,
      Domicilio domicilio,
      Persona propietario,
      Tipo_vivienda tipoVivienda) {
    super(r_catastral, anio_construccion, domicilio);
    this.propietario = propietario;
    this.tipoVivienda = tipoVivienda;
    this.vendida = false;
  }

  public Vivienda(Vivienda vivienda) {
    super(vivienda);
  }

  public Persona getPropietario() {
    return propietario;
  }

  public void setPropietario(Persona propietario) {
    this.propietario = propietario;
  }

  public Tipo_vivienda getTipoVivienda() {
    return tipoVivienda;
  }

  public void setTipoVivienda(Tipo_vivienda tipoVivienda) {
    this.tipoVivienda = tipoVivienda;
  }

  public Boolean getVendida() {
    return vendida;
  }

  public void setVendida(Boolean vendida) {
    this.vendida = vendida;
  }

  public ArrayList<Oferta> getListaOfertas() {
    return ListaOfertas;
  }

  public void setListaOfertas(ArrayList<Oferta> listaOfertas) {
    ListaOfertas = listaOfertas;
  }

  public void addOferta(Oferta oferta) {
    this.ListaOfertas.add(oferta);
    System.out.println("Se ha añadido la oferta");
  }

  public void delOferta(Oferta oferta) {
    getListaOfertas().remove(oferta);
    System.out.println("Se ha retirado la oferta");
  }

  public void ordenaOfertas(boolean ascendente) {
    if (!ascendente) {
      Comparator<Oferta> comparator = Collections.reverseOrder();
      getListaOfertas().sort(comparator);
    } else {
      Collections.sort(getListaOfertas());
    }
  }

  @Override
  public int compareTo(Vivienda o) {
    return 0;
  }
}
