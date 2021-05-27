package ExamenRec2T2021_Isidro.Tarea1;

import java.util.Arrays;

public class AltavozTrasero extends AltavozCoche implements Grave {
  private int potecia;
  private Boolean elementos_decorativos;
  private Revision[] revision = new Revision[1];

  public Boolean getElementos_decorativos() {
    return elementos_decorativos;
  }

  public void setElementos_decorativos(Boolean elementos_decorativos) {
    this.elementos_decorativos = elementos_decorativos;
  }

  public Revision[] getRevision() {
    return revision;
  }

  public void setRevision(Revision[] revision) {
    this.revision = revision;
  }

  public AltavozTrasero(
      int n_serie, double altura, double anchura, int potecia, Revision revision) {
    super(n_serie, altura, anchura);
    this.potecia = potecia;
  }

  public int getPotecia() {
    return potecia;
  }

  public void setPotecia(int potecia) {
    this.potecia = potecia;
  }

  public void addReview(Revision revision) {
    /*for (int i = 0; i < getRevision().length; i++) {
      if (revision.getFecha().equals(getRevision()[i].getFecha())) {
        System.out.println("Ese dia ya se hizo revision");
        break;
      } else if (i + 1 == getRevision().length) {
        setRevision(Arrays.copyOf(getRevision(), getRevision().length + 1));
        getRevision()[getRevision().length - 1] = revision;
        break;
      }
    }*/
    setRevision(Arrays.copyOf(getRevision(), getRevision().length + 1));
    getRevision()[getRevision().length - 1] = revision;
    System.out.println("Se ha añadido la revision");
  }

  public void delReview(Revision revision) {
    String res = "false";
    for (int i = 0; i < getRevision().length; i++) {
      if (revision.getFecha().equals(getRevision()[i].getFecha())) {
        for (int j = 0; j < getRevision().length; j++) {
          this.getRevision()[i] = getRevision()[j];
        }
        setRevision(Arrays.copyOf(getRevision(), getRevision().length - 1));
        res = "true";
        ;
        break;
      }
    }
    System.out.println(res);
  }

  public void mostrarRevisiones() {
    for (int i = 0; i < getRevision().length; i++) {
      System.out.println(getRevision()[i]);
    }
  }

  @Override
  public void activarGraves() {
    System.out.println("Graves del altovoz trasero");
  }
}
