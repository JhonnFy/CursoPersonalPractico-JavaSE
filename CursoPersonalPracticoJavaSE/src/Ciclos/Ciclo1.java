/*Imprimir los números del 1-10*/
package Ciclos;

import java.util.*;
import java.math.*;

public class Ciclo1 {

    public static void main(String[] args) {

        int nUno = 1, nDos = 10;

        for (int a = 1; a <= 10; a++) {
            System.out.print("\n\tA " + nUno + ".");
            nUno = (nUno + 1);
            for (int b = 1; b <= 1; b++) {
                System.out.print("\n\tB " + nDos + ".");
                nDos = (nDos - 1);
            }
        }

        System.out.print("\n\t");

    }
}
