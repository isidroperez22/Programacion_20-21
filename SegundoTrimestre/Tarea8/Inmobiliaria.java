package SegundoTrimestre.Tarea8;

import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Inmobiliaria {
  Map<Vivienda, TreeSet<Oferta>> ListaViviendas = new TreeMap<>();

  public Inmobiliaria() {}

  public Map<Vivienda, TreeSet<Oferta>> getListaViviendas() {
    return ListaViviendas;
  }

  public void setListaViviendas(Map<Vivienda, TreeSet<Oferta>> listaViviendas) {
    ListaViviendas = listaViviendas;
  }

  public void AltaVivienda(Vivienda vivienda) {
    if (getListaViviendas().containsKey(vivienda)) {
      System.out.println("Esta vivienda ya esta dada de alta");
    } else {
      getListaViviendas().put(vivienda, null);
      System.out.println("La vivienda ahora esta disponible");
    }
  }

  public void AltaOferta(Vivienda vivienda, Oferta oferta) {
    Vivienda busca = new Vivienda(vivienda);
    if (ListaViviendas.containsKey(busca)) {
      for (Map.Entry<Vivienda, TreeSet<Oferta>> entry : getListaViviendas().entrySet()) {
        if (entry.getKey().getR_catastral().equals(vivienda.getR_catastral())) {
          entry.getValue().add(oferta);
          System.out.println("se ha realizado la oferta");
        }
      }
    }
  }

  public void bajaVivienda(Vivienda vivienda) {
    if (getListaViviendas().containsKey(vivienda)) {
      getListaViviendas().remove(vivienda);
      System.out.println("La vivienda ya no esta disponible");
    } else {
      System.out.println("Esa vivienda ya esta disponible");
    }
  }

  @Override
  public String toString() {
    return "Inmobiliaria{" + "ListaViviendas=" + ListaViviendas + '}';
  }
}
