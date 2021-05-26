package SegundoTrimestre.Tarea8;

import java.util.Comparator;

public class ComparaOfertas implements Comparator<Oferta> {

  @Override
  public int compare(Oferta o1, Oferta o2) {
    return (int) (o1.getImporte() - o2.getImporte());
  }
}
