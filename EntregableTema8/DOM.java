package U8.EntregableTema8;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

public class DOM {
  static Document doc;

  public DOM(String ruta) throws ParserConfigurationException, IOException, SAXException {
    DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
    DocumentBuilder db = dbf.newDocumentBuilder();
    setDoc(db.parse(ruta));
  }

  public static Document getDoc() {
    return doc;
  }

  public static void setDoc(Document doc) {
    DOM.doc = doc;
  }

  public static void parse() {
    try {
      DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
      DocumentBuilder db = dbf.newDocumentBuilder();
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

    } catch (ParserConfigurationException e) {
      e.printStackTrace();
    }
  }

  public static void andiadirplato(String name, double price, String description, double calories) {
    try {
      DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
      DocumentBuilder db = dbf.newDocumentBuilder();

      Node root = doc.getDocumentElement();
      Text saltolinea = doc.createTextNode("\n"); // nodo para salto de linea
      Element comida = doc.createElement("food"); // nodo del plato
      Element nom = doc.createElement("name");
      nom.setTextContent(name);
      Element precio = doc.createElement("price");
      precio.setTextContent(String.valueOf(price));
      Element desc = doc.createElement("description");
      desc.setTextContent(description);
      Element calorias = doc.createElement("calories");
      calorias.setTextContent(String.valueOf(calories));
      Element salud = doc.createElement("healthy");
      salud.setTextContent("true");

      comida.appendChild(nom);
      comida.appendChild(saltolinea);
      comida.appendChild(precio);
      comida.appendChild(saltolinea);
      comida.appendChild(desc);
      comida.appendChild(saltolinea);
      comida.appendChild(calorias);
      comida.appendChild(saltolinea);
      comida.appendChild(salud);

      root.appendChild(comida);

    } catch (DOMException | ParserConfigurationException e) {
      System.out.println("Error");
    }
  }

  public static void volcado() {
    try {
      TransformerFactory tf = TransformerFactory.newInstance();
      Transformer transformer = tf.newTransformer();
      transformer.setOutputProperty(OutputKeys.INDENT, "yes");
      transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
      transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
      transformer.setOutputProperty(OutputKeys.METHOD, "xml");
      transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

      Node root = doc.getDocumentElement();
      DOMSource origenDOM = new DOMSource(root);

      File nuevoPersonas = new File("Fichero\\ejercicio2.xml");
      StreamResult destino = new StreamResult(nuevoPersonas);

      transformer.transform(origenDOM, destino);
    } catch (TransformerConfigurationException e) {
      System.out.println("error");
    } catch (TransformerException e) {
      System.out.println("error al transfromar");
    }
  }
}
