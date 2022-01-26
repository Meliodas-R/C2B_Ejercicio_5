package com.eon.Entities;

public class Carta {

    private int rango;
    private String[] palos = {"Oros", "Bastos", "Copas", "Espadas"};
    private int palo = 0;

    public Carta() {
        // Numero entre 1 y 12
        rango = (int) ((Math.random() * 12) + 1);
        palo = (int) (Math.random() * 4);
    }

    public int getRango() {
        return rango;
    }

    public String[] getPalos() {
        return palos;
    }

    public int getPalo(){
        return palo;
    }

    public String ToString(int posicion){
        return palos[posicion];
    }
}
