/*Guillermo tiene N dólares.
Luis tiene la mitad de lo que posee Guillermo.
Juan tiene la mitad de lo que poseen Luis y Guillermo Juntos.
Hacer un programa que calcule e imprima la cantidad de dinero que tienen los tres*/
package Algoritmos;

import java.util.*;
import java.math.*;

public class Algoritmo3 {

    public static void main(String[] args) { //NoRetornaNada

        Scanner Alg3 = new Scanner(System.in);

        int dolaresG = 0;
        int dolaresL = 0;
        int dolaresJ = 0;

        System.out.print("\n\t*****CONTADOR DE DOLARES*****");
        System.out.print("\n\t¿Cuantidad En Dolares Que Posee Guillermo?\n\t\t$");
        dolaresG = Alg3.nextInt();

        System.out.print("\n\n\n\t*****SALIDA DE DOLARES*****");
        System.out.print("\n\tCantidad De Dolares Que Tiene Guillermo:\t$" + dolaresG + ",Dolares.");
        dolaresL = (dolaresG / 2);
        System.out.print("\n\tCantidad De Dolares Que Tiene Luis:\t\t$" + dolaresL + ",Dolares.");

        dolaresJ = (dolaresG + dolaresL) / 2;

        System.out.print("\n\tCantidad De Dolares Que Tiene Juan:\t\t$" + dolaresJ + ",Dolares.");
        System.out.print("\n\n");

    }
}
