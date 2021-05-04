package Tema8JSON;

import java.util.ArrayList;

public class Futbolista {
    private String nombre;
    private int dorsal;
    private ArrayList<Posicion> posicion = new ArrayList<>();
    private String equipo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public ArrayList<Posicion> getPosicion() {
        return posicion;
    }

    public void setPosicion(ArrayList<Posicion> posicion) {
        this.posicion = posicion;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public Futbolista(String nombre, int dorsal, String equipo) {
        setNombre(nombre);
        setDorsal(dorsal);
        setEquipo(equipo);
    }
    public void posicion(Posicion posiciones){
        int pos = 0;
        posicion.add(pos, posiciones);
        pos++;
    }

  /*  public void copiarArray (){
        ArrayList<Posicion> posicions = new ArrayList<>(Futbolista.class);
        System.out.println(posicions);
    }*/


}
