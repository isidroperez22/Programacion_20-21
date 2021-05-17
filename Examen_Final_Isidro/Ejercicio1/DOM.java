package Examen_Final_Isidro.Ejercicio1;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.Text;
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
  static org.w3c.dom.Document doc;

  public static org.w3c.dom.Document getDoc() {
    return doc;
  }

  public static void setDoc(org.w3c.dom.Document doc) {
    DOM.doc = doc;
  }

  public DOM(String ruta) throws ParserConfigurationException, IOException, SAXException {
    DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
    DocumentBuilder db = dbf.newDocumentBuilder();
    setDoc(db.parse(ruta));
  }

  public void addLibros(String titulos, String autor1, String editorial1, Integer paginas1) {
    try {
      DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
      Node root = doc.getDocumentElement();
      Text SaltoLinea = doc.createTextNode("\n");
      Element libros = doc.createElement("libro");
      Element titulo = doc.createElement("titulo");
      titulo.setTextContent(titulos);
      Element autor = doc.createElement("autor");
      autor.setTextContent(autor1);
      Element editorial = doc.createElement("editorial");
      editorial.setTextContent(editorial1);
      Element paisEditorial = doc.createElement("Pais");
      paisEditorial.setTextContent("Espania");
      Element paginas = doc.createElement("paginas");
      paginas.setTextContent(String.valueOf(paginas1));

      libros.appendChild(titulo);
      libros.appendChild(SaltoLinea);
      libros.appendChild(autor);
      libros.appendChild(SaltoLinea);
      libros.appendChild(editorial);
      editorial.appendChild(SaltoLinea);
      editorial.appendChild(paisEditorial);
      libros.appendChild(paginas);
      root.appendChild(libros);

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void EscribirFichero() {
    try {
      TransformerFactory tf = TransformerFactory.newInstance();
      Transformer transformer = tf.newTransformer();
      transformer.setOutputProperty(OutputKeys.INDENT, "yes");
      transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
      transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
      transformer.setOutputProperty(OutputKeys.METHOD, "xml");
      transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

      Node root = doc.getDocumentElement();
      DOMSource documento = new DOMSource(root);

      File NuevoDoc = new File("Fichero\\ejercicio2.xml");
      StreamResult destino = new StreamResult(NuevoDoc);

      transformer.transform(documento, destino);
    } catch (TransformerConfigurationException e) {
      System.out.println("error");
    } catch (TransformerException e) {
      System.out.println("error en el volcado");
    }
  }
}
