package U8.EntregableTema8;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.Scanner;

// Partiendo el ejercicio1.xml crear una clase ModificacionDOM que:
//
// Añada una nueva comida al menú solicitando los datos al usuario.
// Inserte al final de cada nodo food (incluido el nuevo) la siguiente etiqueta
// <healthy>true</healthy>
// Escriba todo esto en un fichero llamado ejercicio2.xml
public class ModificacionDOM {
  public static void main(String[] args)
      throws IOException, SAXException, ParserConfigurationException {
    Scanner sc = new Scanner(System.in);
    System.out.println("Nombre del plato");
    String nombre = sc.nextLine();
    System.out.println("precio");
    double precio = sc.nextDouble();
    System.out.println("Cuantas calorias tiene");
    double calorias = sc.nextDouble();
    sc.nextLine();
    System.out.println("descripcion");
    String desc = sc.nextLine();

    DOM documento = new DOM("Fichero\\breakfast.xml");
    documento.andiadirplato(nombre, precio, desc, calorias);
    documento.volcado();
    documento.parse();
  }
}
