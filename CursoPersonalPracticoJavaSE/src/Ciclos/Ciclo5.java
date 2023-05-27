/*Solicitar un número, imprimir hasta el informado por el usuario. Todos los ciclos*/
package Ciclos;

import java.util.*;
import java.math.*;

public class Ciclo5 {

    public static void main(String[] args) {

        Scanner Cic5 = new Scanner(System.in);
        int nUno = 0, nDos = 1;

        System.out.print("\n\t*****CICLO PERSONALIZADO*****");
        System.out.print("\n\t¿Número?\t\t");
        nUno = Cic5.nextInt();

        nDos = (nDos * 0);
        nDos = 1;
        System.out.print("\n\tFOR");
        for (int a = 1; nUno >= a; a++) {
            System.out.print("\n\t#" + nDos + ".");
            nDos = (nDos + 1);
        }

        nDos = (nDos * 0);
        nDos = 1;
        System.out.print("\n\tWHILE");
        while (nUno >= nDos) {
            System.out.print("\n\t" + nDos + ".");
            nDos = (nDos + 1);
        }

        nDos = (nDos * 0);
        nDos = 1;
        System.out.print("\n\tDO");
        do {
            System.out.print("\n\t" + nDos + ".");
            nDos = (nDos + 1);
        } while (nUno >= nDos);

        System.out.print("\n\t");
    }
}
