package Examen_Final_Isidro.Ejercicio2;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class STAX {
  public void recorridoSTAX() {
    try {
      XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
      XMLEventReader xmlEventReader =
          xmlInputFactory.createXMLEventReader(new FileInputStream("Fichero\\libros.xml"));

      while (xmlEventReader.hasNext()) {
        XMLEvent xmlEvent = xmlEventReader.nextEvent();

        if (xmlEvent.isStartElement()) {
          StartElement startElement = xmlEvent.asStartElement();
        }
      }
    } catch (XMLStreamException e) {
      e.printStackTrace();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }
}
