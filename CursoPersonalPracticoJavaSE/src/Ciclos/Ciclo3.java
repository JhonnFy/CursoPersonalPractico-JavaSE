/*Imprimir los números 1-10, usando los ciclos (Do-For-While) ASC*/
package Ciclos;

import java.util.*;
import java.math.*;

public class Ciclo3 {

    public static void main(String[] args) {

        Scanner Cic3 = new Scanner(System.in);

        int dUno = 1;

        System.out.print("\n\tDO");
        do {
            System.out.print("\n\t# " + dUno + ".");
            dUno = (dUno + 1);
        } while (dUno <= 10);

        dUno = (dUno * 0);
        dUno = 1;
        System.out.print("\n\n\tFOR");
        for (int a = 1; a <= 10; a++) {
            System.out.print("\n\t# " + dUno + ".");
            dUno = (dUno + 1);
        }

        dUno = (dUno * 0);
        dUno = 1;
        System.out.print("\n\n\tWHILE");
        while (dUno <= 10) {
            System.out.print("\n\t# " + dUno + ".");
            dUno = (dUno + 1);
        }

        System.out.print("\n\t");
    }
}
