/*Pedir un número entre 0 y 99 999  y decir cuantas cifras tiene*/
package Condicionales;

import java.util.*;
import java.math.*;

public class Condicional9 {

    public static void main(String[] args) {

        Scanner Con9 = new Scanner(System.in);
        int nUno = 0;
        System.out.print("\n\t*****Datos Númericos*****");
        System.out.print("\n\tIngresar Un Dato Entero\t\t");
        nUno = Con9.nextInt();

        if (nUno < 10) {
            System.out.print("\n\t1 Cifra");
        } else if (nUno >= 10 && nUno < 100) {
            System.out.print("\n\t2 Cifas");
        } else if (nUno >= 100 && nUno < 1000) {
            System.out.print("\n\t3 Cifras");
        } else if (nUno >= 1000 && nUno < 10000) {
            System.out.print("\n\t4 Cifras");
        } else if (nUno >= 10000 && nUno < 100000) {
            System.out.print("\n\t5 Cifras");
        }
        System.out.print("\n\t");

    }
}
