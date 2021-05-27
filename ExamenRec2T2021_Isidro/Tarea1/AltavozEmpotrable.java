package ExamenRec2T2021_Isidro.Tarea1;

import java.util.Arrays;

public class AltavozEmpotrable extends AltavozCoche implements Grave {
  private Instalado instalado;
  private Revision[] revision = new Revision[1];

  public Revision[] getRevision() {
    return revision;
  }

  public void setRevision(Revision[] revision) {
    this.revision = revision;
  }

  public AltavozEmpotrable(
      int n_serie, double altura, double anchura, Instalado instalado, Revision revision) {
    super(n_serie, altura, anchura);
    this.instalado = instalado;
  }

  public Instalado getInstalado() {
    return instalado;
  }

  public void setInstalado(Instalado instalado) {
    this.instalado = instalado;
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
    System.out.println("Graves del altavoz emportrable");
  }
}
