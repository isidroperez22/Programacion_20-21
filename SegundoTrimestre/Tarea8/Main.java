package SegundoTrimestre.Tarea8;

public class Main {
  public static void main(String[] args) {
    Domicilio d1 = new Domicilio("Calla habichuela", 2, "", 41960);
    Persona vendedor1 = new Persona("12345678A", "Isidro");
    Persona comprador1 = new Persona("91823746Z", "Romario");
    Persona comprador2 = new Persona("22222222B", "Maria");
    Persona comprador3 = new Persona("33333333C", "Luis");
    Vivienda v1 =
        new Vivienda("1234567 12A34B67 0010  WX", 1999, d1, vendedor1, Tipo_vivienda.Casa);
    Vivienda v2 =
        new Vivienda("9874563 96AB76AC 0290  SE", 2005, d1, vendedor1, Tipo_vivienda.Piso);
    Oferta oferta1 = new Oferta(comprador1, 152067.70);
    Oferta oferta2 = new Oferta(comprador1, 122027.71);
    Oferta oferta3 = new Oferta(comprador1, 300621.02);

    Inmobiliaria in1 = new Inmobiliaria();

    // in1.AltaVivienda(v1);
    // in1.AltaVivienda(v2);
    // in1.bajaVivienda(v2);
    // in1.AltaOferta(v1, oferta1);

    v1.addOferta(oferta1);
    v1.addOferta(oferta1);
    v2.addOferta(oferta3);
    // v1.ordenaOfertas(false);
    in1.AltaOferta(v1, oferta1);
  }
}
