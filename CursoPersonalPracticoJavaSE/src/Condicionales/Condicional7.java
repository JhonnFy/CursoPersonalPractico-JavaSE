/*Hacer un programa que tome dos números y diga si ambos son pares o impares.*/
package Condicionales;

import java.util.*;
import java.math.*;

public class Condicional7 {

    public static void main(String[] args) {

        Scanner Con7 = new Scanner(System.in);

        int nUno = 0, nDos = 0;

        System.out.print("\n\t*****PARES/IN-PARES");
        System.out.print("\n\tIngrese El Valor Número Uno:\t\t");
        nUno = Con7.nextInt();
        System.out.print("\tIngrese El Valor Número Dos:\t\t");
        nDos = Con7.nextInt();

        if (nUno % 2 == 0 && nDos % 2 == 0) {
            System.out.print("\n\tSean Los Dos Números PARES");
        } else {
            System.out.print("\n\tSean Los Dos Números Impares");
        }
        System.out.print("\n\t");
    }
}
//    if(numero1%2==0 && (numero2%2==0)
