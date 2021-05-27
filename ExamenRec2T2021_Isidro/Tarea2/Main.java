package ExamenRec2T2021_Isidro.Tarea2;

public class Main {
  public static void main(String[] args) {
    Medicinas medicinas = new Medicinas("Uno", 5, 30);
    Consultas consultas = new Consultas("22-1-2009", "Esta mu malo");
    Consultas consultas1 = new Consultas("22-1-2019", "Esta mu bien");
    Perro perro = new Perro(1234, "21-1-2015", "Luis", 20);
    Clinica clinica = new Clinica();

    consultas.addMedicinas(medicinas);
    perro.addConsulta(consultas);
    clinica.addPerro(perro);
    clinica.addConsulta(perro, consultas1);
    clinica.listaPerrosMedicina(medicinas);
    clinica.cargaFichero();
    clinica.guardaFichero();
  }
}
