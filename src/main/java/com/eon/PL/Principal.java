
package com.eon.PL;

import com.eon.Entities.Carta;

public class Principal {

    public static void main(String[] args) {

        Carta carta1 = new Carta();
        Carta carta2 = new Carta();

        System.out.println("Numero: " + carta1.getRango());
        System.out.println("Palo: " + carta1.getPalo());
        
        System.out.println("Numero: " + carta2.getRango());
        System.out.println("Palo: " + carta2.getPalo());
        
        jugar(carta1, carta2);
        
    }
    
    public static void jugar(Carta carta1, Carta carta2){
        
        if(carta1.getRango() > carta2.getRango()){
            System.out.println("El ganador es el jugador 1");
        } else if (carta1.getRango() < carta2.getRango()){
            System.out.println("El ganador es el jugador 2");
        }
    }

}
