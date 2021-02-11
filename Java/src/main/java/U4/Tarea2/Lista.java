package U4.Tarea2;

import java.util.Arrays;

public class Lista {
  int num;
  int[] lista;

  public Lista() {
    int num = 0;
    lista = new int[10];
  }

  public Lista(int tamanio) {
    int num = 0;
    lista = new int[tamanio];
  }

  public int getNum() {
    return num;
  }

  public void insertar(int num) {
    this.lista[this.num] = num;
    this.num++;
  }

  public void eliminar(int pos) {
    Integer posNull = null;
    this.lista[pos] = posNull;
  }

  public void numPrincio(int numero) {
    if (lista.length == 10) {
      lista = Arrays.copyOf(lista, lista.length + 10);
    }
    for (int i = this.num; i > 1; i--) {
      lista[i] = lista[i - 1];
    }
    lista[0] = numero;
    this.num++;
  }

  public void numFinal(int numero) {
    if (lista.length == 10) {
      lista = Arrays.copyOf(lista, lista.length + 10);
    }
    lista[lista.length - 1] = numero;
    this.num++;
  }

  public void numIndicado(int num, int pos) {
    if (lista.length == 10) {
      lista = Arrays.copyOf(lista, lista.length + 10);
    }
    lista[pos] = num;
  }

  public void copiarLista(int[] lista) {
    while (this.num + lista.length > lista.length) {
      lista = Arrays.copyOf(lista, lista.length + 10);
    }
    for (int i = num, j = 0; i < lista.length; i++, j++) {
      this.lista[i] = lista[j];
      this.num++;
    }
  }

  public void mostrarNum(int pos) {
    System.out.println((lista[pos]));
  }
}
