/*Menu
Solicitar dos numeros al usuario y preguntar si quiere operar con enteros, o con decimales*/
package Condicionales;

import java.util.*;
import java.math.*;

public class Condicional2 {

    public static void main(String[] args) {

        Scanner Con2 = new Scanner(System.in);

        double dUno = 0, dDos = 0, dSuma = 0;
        int iUno = 0, iDos = 0, iSuma = 0;
        int opc = 0;

        System.out.print("\n\t*****MENU OPCIONES*****");
        System.out.print("\n\tOpción Uno Operar Con Enteros\t\t");
        System.out.print("\n\tOpción Dos Operar Con Decimales\t\t");
        System.out.print("\n\t*****SELECCIONE UNA OPCION*****\n\t\t|");
        opc = Con2.nextInt();

        switch (opc) {
            case 1:
                if (opc == 1) {
                    System.out.print("\n\t*****SUMA CON ENTEROS*****");
                    System.out.print("\n\t¿Número Uno?\t\t");
                    iUno = Con2.nextInt();
                    System.out.print("\t¿Número Dos?\t\t");
                    iDos = Con2.nextInt();

                    iSuma = (iUno + iDos);
                    System.out.print("\n\t*****SALIDA ENTEROS*****");
                    System.out.print("\n\tValor De La Suma:\t" + iSuma + ".");
                    System.out.println("\n\t");
                }
                break;

            case 2:
                if (opc == 2) {
                    System.out.print("\n\t*****SUMA CON DECIMALES*****");
                    System.out.print("\n\t¿Número Uno?\t\t");
                    dUno = Con2.nextDouble();
                    System.out.print("\t¿Número Dos?\t\t");
                    dDos = Con2.nextDouble();

                    dSuma = (dUno + dDos);
                    System.out.print("\n\t*****SALIDA ENTEROS*****");
                    System.out.print("\n\tValor De La Suma\t" +Math.round(dSuma) + ".");
                    System.out.println("\n\t");
                }
                break;
        }

    }
}
