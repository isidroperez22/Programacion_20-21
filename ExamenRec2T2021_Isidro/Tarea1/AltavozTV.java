package ExamenRec2T2021_Isidro.Tarea1;

import java.util.Arrays;

public class AltavozTV extends Altavoz {
  private Interfaz interfaz;
  private Revision[] revision = new Revision[0];

  public AltavozTV(int n_serie, double altura, double anchura, Interfaz interfaz) {
    super(n_serie, altura, anchura);
    this.interfaz = interfaz;
    setNum_alatvoces(getNum_alatvoces() + 1);
  }

  public Revision[] getRevision() {
    return revision;
  }

  public void setRevision(Revision[] revision) {
    this.revision = revision;
  }

  public Interfaz getInterfaz() {
    return interfaz;
  }

  public void setInterfaz(Interfaz interfaz) {
    this.interfaz = interfaz;
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
    System.out.println(Arrays.toString(getRevision()));
  }

  @Override
  public String toString() {
    return "AltavozTV{" + "interfaz=" + interfaz + ", revision=" + Arrays.toString(revision) + '}';
  }
}
