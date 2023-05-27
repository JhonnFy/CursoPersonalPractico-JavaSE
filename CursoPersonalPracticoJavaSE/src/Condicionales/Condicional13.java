/*Hacer un programa que simule un cajero automático con un saldo inicial de 1000 dólares, 
con el siguiente menú de opciones:
1-Ingresar dinero
2-Retirar dinero
3-Salir*/
package Condicionales;

import java.util.*;
import java.math.*;

public class Condicional13 {

    public static void main(String[] args) {
        Scanner Con13 = new Scanner(System.in);

        final double dinero = 1000;
        double mActual = 0;
        int opc = 0;

        System.out.print("\n\t*****CAJERO*****");
        System.out.print("\n\t1-Ingresar Dinero.");
        System.out.print("\n\t2-Retirar Dinero.");
        System.out.print("\n\t3-Salir.");
        System.out.print("\n\t\tSeleccione Una Opción\t\t");
        opc = Con13.nextInt();

        switch (opc) {
            case 1:
                if (opc == 1) {
                    mActual = (mActual * 0);
                    double dAdicional = 0;
                    System.out.print("\n\t*****CAJERO*****");
                    System.out.print("\n\tIngresar dinero\t\t");
                    System.out.print("\n\t¿Monto A Ingresar?\t$");
                    dAdicional = Con13.nextDouble();
                    mActual = Math.round(dinero + dAdicional);
                    System.out.print("\n\tMonto Actual:\t\t$" + Math.round(mActual) + ".");
                }
                break;
            case 2:
                if (opc == 2) {
                    mActual = (mActual * 0);
                    double mRetiro = 0;
                    System.out.print("\n\t*****CAJERO*****");
                    System.out.print("\n\tRetirar Dinero");
                    System.out.print("\n\t¿Monto A Retirar?\t$");
                    mRetiro = Con13.nextDouble();

                    if (mRetiro > dinero) {
                        System.out.print("\n\tIdiota No Puede Retirar Más De Lo Que Tiene.");
                    } else {
                        mActual = Math.round(dinero - mRetiro);
                        System.out.print("\n\t*****CAJERO*****");
                        System.out.print("\n\tMonto Actual:\t\t$" + Math.round(mActual) + ".");
                    }

                }
                break;
            case 3:
                System.out.print("\n\tFuera De Línea\n\t");
                System.exit(0);
                break;
            default:
                System.out.print("\n\t104\n\t\tGeneralmente significa que es necesario actualizar la información almacenada en el dispositivo.\n\t\tHay un problema de conectividad de red.");
        }
        System.out.print("\n\t");
    }
}
