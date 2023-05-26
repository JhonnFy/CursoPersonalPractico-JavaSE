/*Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera:
-Si trabaja 40 horas o menos, se le paga $50.000 por hora.
-Si trabaja más de 40 horas, se le pagará $60.000 por cada hora hasta completar las 50, 
a partir de la hora 51, el valor de la hora será de $100.000*/
package Condicionales;

import java.util.*;
import java.math.*;

public class Condicional6 {

    public static void main(String[] args) {

        Scanner Cond6 = new Scanner(System.in);
        int cHoras = 0;

        System.out.print("\n\t*****NOMINA*****");
        System.out.print("\n\t¿Cantidad De Horas Laboradas?\t");
        cHoras = Cond6.nextInt();

        if (cHoras <= 40) {
            double vHora = 0;
            double vNeto = 0;
            vHora = 50000;
            vNeto = (cHoras * vHora);
            System.out.print("\tIntensidad Horaria \tEntre 1-40 Horas.");
            System.out.print("\n\tSalario Semanal\t\t$" + Math.round(vNeto) + ".");
        } else if (cHoras > 40) {

            final int pHoras = 50;
            int sHoras = (cHoras - pHoras);
            double vpCuarenta = 60000, vsCuarenta = 100000, vUno = 0, vDos = 0, sNeto = 0;

            vUno = Math.round((pHoras * vpCuarenta));
            vDos = Math.round((sHoras * vsCuarenta));
            sNeto = Math.round((vUno + vDos));

            System.out.print("\n\t+Primeras 50 Horas:\t\t" + pHoras + "\n\t\tValor\t$" + Math.round(vUno) + ".");
            System.out.print("\n\t+Horas Restantes Horas:\t\t" + sHoras + "\n\t\tValor\t$" + Math.round(vDos) + ".");
            System.out.print("\n\n\tSalrio Neto:\t$" + Math.round(sNeto) + ".");
        }
        System.out.print("\n\t");
    }
}
