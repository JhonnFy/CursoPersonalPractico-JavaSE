/*Una compañia de venta de carros usados.
Paga a su personal de ventas un salario de $1000000 mensuales, 
más una comisión de $150000, por cada carro vendido, 
más el 5% del valor de la venta por carro.
Cada mes el capturista de la empresa ingresa en la computadora los datos pertinentes.
Hacer un programa que calcule e imprima el salario mensual de un vendedor dado.*/
package Algoritmos;

import java.util.*;
import java.math.*;

public class Algoritmo4 {

    public static void main(String[] args) {

        Scanner Alg4 = new Scanner(System.in);

        
        final int salario = 1000000;
        final int comision = 150000;
        int vcarro = 0;
        int vprc = 0;
        int ntosalario = 0;
        
        
        System.out.print("\n\t*****DATOS DEL CAPTURISTA*****");
        System.out.print("\n\t¿Valor Del Vehiculo?\t\t$");
        vcarro = Alg4.nextInt();
        
        vprc = (vcarro*5)/100;
        ntosalario = (salario+comision+vprc);
        
        System.out.print("\n\t*****ESTADO DEL VENDEDOR*****");
        System.out.print("\n\tSalario Inicial\t\t\t$"+salario+".");
        System.out.print("\n\tComisión Mensual\t\t$"+comision+".");
        System.out.print("\n\tPorcentaje Del 5%\t\t$"+vprc+".");
        System.out.print("\n\tSario Neto Mensual\t\t$"+ntosalario+".");
        System.out.print("\n\t");
    }
}
