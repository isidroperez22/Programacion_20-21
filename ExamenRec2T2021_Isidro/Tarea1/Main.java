package ExamenRec2T2021_Isidro.Tarea1;

public class Main {
  public static void main(String[] args) {
    Revision revision = new Revision("22-10-2020", true, 10.0);
    AltavozTV altavozTV = new AltavozTV(1, 1.5, 2, Interfaz.BlueTooth);
    AltavozTV altavozTV2 = new AltavozTV(1, 1.5, 2, Interfaz.BlueTooth);
    AltavozMovil altavozMovil = new AltavozMovil(2, 0.01, 0.01, 3, revision);
    AltavozEmpotrable altavozEmpotrable =
        new AltavozEmpotrable(3, 3, 5, Instalado.Puerta, revision);
    AltavozTrasero altavozTrasero = new AltavozTrasero(4, 3, 3, 600, revision);

    altavozTV.addReview(revision);
    altavozTV.delReview(revision);
    System.out.println("Hay " + Altavoz.getNum_alatvoces() + " altavoces");

    altavozTV.mostrarRevisiones();
  }
}
