/*Construir un programa que simule el funcionamiento de una calculadora 
que puede realizar las cuatro operaciones aritméticas básicas:
(Suma, Resta, Producto,División)con valores numéricos enteros.
El usuario debe especificar la operación con el primer carácter
del primer paramero de la línea de comandos: 
So s para la suma.
R o r para la resta.
P,p, M o m para el producto.
D o d para la división*/
package Condicionales;

import java.util.*;
import java.math.*;

public class Condicional12 {

    public static void main(String[] args) {

        Scanner Con12 = new Scanner(System.in);
        double nUno = 0, nDos = 0, rst = 0;
        char crc;
        int opc = 0;

        System.out.print("\n\t*****CALCULADORA*****");
        System.out.print("\n\t\t-S o s  SUMA");
        System.out.print("\n\t\t-R o r  RESTA");
        System.out.print("\n\t\t-P o p, M o m PRODUCTO");
        System.out.print("\n\t\t-D o d, DIVISION");

        System.out.print("\n\n\t\tSeleccione Una Opción:\t\t");
        crc = Con12.nextLine().charAt(0);
        System.out.print("\t\t¿Valor Entero Número Uno?\t");
        nUno = Con12.nextDouble();
        System.out.print("\t\t¿Valor Entero Número Dos?\t");
        nDos = Con12.nextDouble();

        if (crc == 'S' || crc == 's') {
            opc = (opc * 0);
            opc = 1;
        } else if (crc == 'R' || crc == 'r') {
            opc = 2;
        } else if (crc == 'P' || crc == 'p' || crc == 'M' || crc == 'm') {
            opc = (opc * 0);
            opc = 3;
        } else if (crc == 'D' || crc == 'd') {
            opc = (opc * 0);
            opc = 4;
        }

        switch (opc) {
            case 1:
                if (crc == 'S' || crc == 's') {
                    rst = (rst * 0);
                    rst = (nUno + nDos);
                    System.out.print("\n\t*****CALCULADORA SUMA*****");
                    System.out.print("\n\tValor Suma:\t$" + Math.round(rst) + ".");
                }
                break;
            case 2:
                if (crc == 'R' || crc == 'r') {
                    rst = (rst * 0);
                    if (nUno > nDos) {
                        rst = (nUno - nDos);
                    } else if (nDos > nUno) {
                        rst = (nDos - nUno);
                    }
                    System.out.print("\n\t*****CALCULADORA RESTA*****");
                    System.out.print("\n\tValor Resta:\t$" + Math.round(rst) + ".");
                }
                break;
            case 3:
                if (crc == 'P' || crc == 'p' || crc == 'M' || crc == 'm') {
                    rst = (rst * 0);
                    rst = (nUno*nDos);
                    System.out.print("\n\t*****CALCULADORA PRODUCTO*****");
                    System.out.print("\n\tValor Producto:\t$" + Math.round(rst) + ".");
                }
                break;
            case 4:
                if (crc == 'D' || crc == 'd') {
                    rst = (rst * 0);
                    if (nUno > nDos) {
                        rst = (nUno / nDos);
                    } else if (nDos > nUno) {
                        rst = (nDos / nUno);
                    }
                    System.out.print("\n\t*****CALCULADORA DIVISION*****");
                    System.out.print("\n\tValor Resta:\t$" + Math.round(rst) + ".");
                }
                break;
            default:
                System.out.print("\n\tAtributo Errado\t\t" + opc);
        }
        System.out.print("\n\t");
    }
}
