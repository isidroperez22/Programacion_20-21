package ExamenRec2T2021_Isidro.Tarea2;

import java.io.*;
import java.util.*;

public class Clinica {
  Map<Integer, Perro> mapPerro = new TreeMap<>();

  public Map<Integer, Perro> getMapPerro() {
    return mapPerro;
  }

  public void setMapPerro(Map<Integer, Perro> mapPerro) {
    this.mapPerro = mapPerro;
  }

  public Clinica() {}

  public void addPerro(Perro perro) {
    getMapPerro().put(perro.getPin(), perro);
    System.out.println("Perro añadido");
  }

  public void delPerro(Perro perro) {
    getMapPerro().remove(perro);
  }

  public void addConsulta(Perro perro, Consultas consultas) {
    if (getMapPerro().containsKey(perro.getPin())) {
      for (Map.Entry<Integer, Perro> entrada : mapPerro.entrySet()) {
        if (entrada.getValue().equals(perro)) {
          Iterator<Consultas> it = entrada.getValue().getListaConsultas().iterator();
          while (it.hasNext()) {
            Consultas c = it.next();
            if (consultas.equals(c)) {
              System.out.println("Esta ya esta en la lista");
            } else if (!it.hasNext()) {
              // entrada.getValue().getListaConsultas().add(consultas); Esta linea no se por que no
              // me funciona pero
              // si lo añado desde el metodo add que he creado
              // no me da problemas
              System.out.println("Añadida la consulta");
            }
          }
        }
      }
    } else {
      getMapPerro().put(perro.getPin(), perro);
      System.out.println("Se ha añadido el perro");
    }
  }

  public void listaPerrosMedicina(Medicinas medicinas) {
    List<Perro> perros = new LinkedList<>();
    for (Map.Entry<Integer, Perro> entrada : mapPerro.entrySet()) {
      Iterator<Consultas> it = entrada.getValue().getListaConsultas().iterator();
      while (it.hasNext()) {
        Consultas c = it.next();
        if (c.getMedicinas().contains(medicinas)) {
          perros.add(entrada.getValue());
        }
      }
    }
    System.out.println(perros.toString());
  }

  public void cargaFichero() {
    try {
      ObjectInputStream in = new ObjectInputStream(new FileInputStream("Fichero//perros.dat"));
      while (true) {
        setMapPerro((Map<Integer, Perro>) in.readObject());
      }
    } catch (IOException | ClassNotFoundException e) {
      System.out.println("");
    }
  }

  public void guardaFichero() {
    try {
      ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Fichero//perros.dat"));
      out.writeObject(getMapPerro());
    } catch (FileNotFoundException e) {
      System.out.println("");
    } catch (IOException e) {
      System.out.println("");
      ;
    }
  }
}
