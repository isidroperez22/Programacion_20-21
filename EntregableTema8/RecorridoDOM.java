package U8.EntregableTema8;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

// Crear una clase RecorridoDOM donde desde el método Main se llama a los siguientes métodos (que
// deberán ser estáticos):
//
// mostrarXML que partiendo del nodo raíz mostrará por pantalla el menú.
// cantidadDePlatos que mostrará por pantalla el número de platos de la carta.
// platoMasCaro que mostrará por pantalla el nombre y el precio del plato más caro.
public class RecorridoDOM {
  public static void main(String[] args) {
    parse(new File("Fichero\\breakfast.xml"));
  }

  public static void parse(File nomFile) {
    try {
      DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
      DocumentBuilder db = dbf.newDocumentBuilder();
      Document doc = (Document) db.parse(nomFile);
      NodeList nl = doc.getElementsByTagName("breakfast_menu");
      Element root = doc.getDocumentElement();

      for (int i = 0; i < nl.getLength(); i++) {
        System.out.println(nl.item(i).getNodeName());
        System.out.println(nl.item(i).getTextContent());
      }
      NodeList platos = doc.getElementsByTagName("food");
      System.out.println(
          "Hay " + platos.getLength() + " platos distintos"); // Cantidad de platos que hay
      System.out.println();

      // Plato mas caro
      for (int i = 0; i < nl.getLength(); i++) {}

    } catch (ParserConfigurationException | SAXException | IOException e) {
      e.printStackTrace();
    }
  }
}
