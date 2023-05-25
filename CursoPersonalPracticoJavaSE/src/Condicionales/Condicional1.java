/*Solicitar 2 datos, valorar el mayor*/
package Condicionales;

import java.util.*;
import java.math.*;

public class Condicional1 {

    public static void main(String[] args) {

        Scanner Cond1 = new Scanner(System.in);

        int nUno = 0, nDos = 0;

        System.out.print("\n\t*****CONDICIONALES*****");
        System.out.print("\n\tIngresar El Primer Número\t\t");
        nUno = Cond1.nextInt();
        System.out.print("\tIngresar El Segundo Número\t\t");
        nDos = Cond1.nextInt();

        System.out.print("\n\t*****MAYOR/MENOR*****");
        if (nUno > nDos) {
            System.out.print("\n\tEl Número Uno Es Mayor\t\t\t" + nUno + ".");
        } else if (nUno == nDos) {
            System.out.print("\n\tLos Dos Números Son Iguales\t\t" + nUno + "-" + nDos + ".");
        } else if (nDos > nUno) {
            System.out.print("\n\tEl Número Dos Es Mayor\t\t\t" + nDos + ".");
        }

        System.out.print("\n\t");
    }
}
