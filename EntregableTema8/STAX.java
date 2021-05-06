package U8.EntregableTema8;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

// Utilizando el parserStax crear una clase llamada RecorridoStax que:
//
// Muestre por pantalla el número de platos que componen el menú
// Que muestre por pantalla el número de calorías que tomariamos si pidiéramos un plato de todas las
// entradas del menú.
public class STAX {
  public static void main(String[] args) {
    String tagActual = "";
    try {
      XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
      XMLEventReader xmlEventReader =
          xmlInputFactory.createXMLEventReader(new FileInputStream("Fichero\\breakfast.xml"));

      while (xmlEventReader.hasNext()) {
        XMLEvent xmlEvent = xmlEventReader.nextEvent();

        if (xmlEvent.isStartElement()) {
          StartElement startElement = xmlEvent.asStartElement();

          System.out.print("<" + startElement.getName().getLocalPart());
          String tagname = startElement.getName().getLocalPart();
          switch (tagname) {
            case "food":
              tagActual = "food";
              break;
            case "name":
              // Establezco cuál es la etiqueta que estoy tratando
              tagActual = "name";
              break;

            case "price":
              // Establezco cuál es la etiqueta que estoy tratando
              tagActual = "price";
              break;

            case "description":
              // Establezco cuál es la etiqueta que estoy tratando
              tagActual = "description";
              break;

            case "calories":
              // Establezco cuál es la etiqueta que estoy tratando
              tagActual = "calories";
              break;
          }
          System.out.print(">");
        } else if (xmlEvent.isEndElement()) {
          EndElement endTag = xmlEvent.asEndElement();
          System.out.println("<\\" + endTag.getName().getLocalPart() + ">");
          tagActual = "";
        } else if (xmlEvent.isCharacters()) {
          Characters texto = xmlEvent.asCharacters();
          if (!texto.getData().contains("\n")) {
            System.out.print(texto.getData());
          }
        }
      }
    } catch (FileNotFoundException e) {
      System.out.println("error 1");
    } catch (XMLStreamException e) {
      System.out.println("error 2");
    }
  }
}
