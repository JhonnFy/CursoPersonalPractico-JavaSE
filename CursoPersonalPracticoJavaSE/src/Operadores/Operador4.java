//Clase Match
package Operadores;

import java.math.*;
import java.util.*;

public class Operador4 {

    public static void main(String[] args) {

        //Raiz Cuadrada
        double raiz = Math.sqrt(36.67);
        //Elevar a una potencia
        double base = 5;
        double exponente = 2;
        double resultado = Math.pow(base, exponente);
        //Round
        double nUno = 48.56787978;
        double nDos = Math.round(nUno);
        //Random
        double nTres = Math.random();

        System.out.print("\n\tRaiz cuadrada\t" + raiz + ".");
        System.out.print("\n\tValor Elevado\t"+resultado+".");
        System.out.print("\n\tRedondeado\t"+nDos+".");
        System.out.print("\n\tRandom\t\t"+nTres+".");
        System.out.print("\n\n");
    }
}
