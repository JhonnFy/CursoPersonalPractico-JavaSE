/*Hacer un programa que calcule el cuadrado de una suma
(a+b)2 = a2 + b2 + 2ab*/
package Algoritmos;

import java.util.*;
import java.math.*;

public class Algoritmo6 {

    public static void main(String[] args) {

        Scanner Alg6 = new Scanner(System.in);
        
        double nUno = 0;
        double nDos = 0;
        double rst = 0;
          
        System.out.print("\n\t*****DATOS DE LA SUMA*****");
        System.out.print("\n\t¿Número Uno?\t\t$");
        nUno = Alg6.nextDouble();
        System.out.print("\t¿Número Dos?\t\t$");
        nDos = Alg6.nextFloat();
        
        rst = (nUno+nDos);
        
        double la = 0;
        la = Math.pow(rst, 2);
        
        System.out.print("\n\tElvado\t\t\t"+Math.round(la));
        System.out.print("\n\t");
    }
}
