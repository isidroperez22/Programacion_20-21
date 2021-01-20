package U4.Tarea1.EJ9;

import U4.Tarea1.EJ9.Empleado.maquinistas;

class vagon {
  int capacidad;
  int capActual;
  String mercancia;

  public vagon(int capacidad, int capActual, String mercancia) {
    this.capacidad = capacidad;
    this.capActual = capActual;
    this.mercancia = mercancia;
  }
}

class locomotora {
  String matricula;
  int potencia;
  int anio_fabricacion;

  public locomotora(String matricula, int potencia, int anio_fabricacion) {
    this.matricula = matricula;
    this.potencia = potencia;
    this.anio_fabricacion = anio_fabricacion;
  }
}

class tren {
  locomotora locomotoras;
  vagon[] vagones;
  maquinistas maquinistas;
  int num_vagones;

  public tren(locomotora locomotoras, maquinistas maquinistas) {
    this.locomotoras = locomotoras;
    this.maquinistas = maquinistas;
    this.vagones = new vagon[5];
    num_vagones = 0;
  }

  public void add_vagon(int capacidad, int capacidad_act, String mercancia) {
    if (num_vagones < 5) {
      System.out.println("no se pueden poner mas vagones");
    } else {
      vagon v = new vagon(5, 2, "pasajeros");
      vagones[num_vagones++] = v;
    }
  }
}
