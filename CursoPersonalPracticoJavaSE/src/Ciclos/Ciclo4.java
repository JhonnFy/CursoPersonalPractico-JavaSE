/*/*Imprimir los números 1-10, usando los ciclos (Do-For-While) DSC*/
package Ciclos;

import java.util.*;
import java.math.*;

public class Ciclo4 {

    public static void main(String[] args) {

        int nUno = 10;

        System.out.print("\n\tDO");
        do {
            System.out.print("\n\t# " + nUno + ".");
            nUno = (nUno - 1);
        } while (nUno > 0);

        nUno = (nUno * 0);
        nUno = 10;
        System.out.print("\n\tFOR");
        for (int a = 10; a > 0; a--) {
            System.out.print("\n\t# " + nUno + ".");
            nUno = (nUno - 1);
        }

        nUno = (nUno * 0);
        nUno = 10;
        System.out.print("\n\tWHILE");
        while (nUno > 0) {
            System.out.print("\n\t# " + nUno + ".");
            nUno = (nUno - 1);
        }

        System.out.print("\n\t");

    }
}
