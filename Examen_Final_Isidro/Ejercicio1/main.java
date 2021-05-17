package Examen_Final_Isidro.Ejercicio1;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.Scanner;

public class main {
  public static void main(String[] args)
      throws ParserConfigurationException, IOException, SAXException {
    DOM doc = new DOM("Fichero\\libros.xml");
    Scanner sc = new Scanner(System.in);
    System.out.println("Escribe los datos del nuevo libro");
    System.out.println("titulo");
    String titulo = sc.nextLine();
    System.out.println("autor");
    String autor = sc.nextLine();
    System.out.println("editorial");
    String editorial = sc.nextLine();
    System.out.println("paginas");
    Integer paginas = sc.nextInt();
    doc.addLibros(titulo, autor, editorial, paginas);
    doc.EscribirFichero();
  }
}
