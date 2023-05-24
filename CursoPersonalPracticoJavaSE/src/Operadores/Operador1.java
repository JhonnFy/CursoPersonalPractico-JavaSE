package Operadores;

import java.util.*;
import java.math.*;

public class Operador1 {

    public static void main(String[] args) {

        Scanner Op1 = new Scanner(System.in);

        float suma = 0, resta = 0, mult = 0, div = 0, resto = 0, nUno = 0, nDos = 0;

        System.out.print("\n\t******Tipos De Datos******");
        System.out.print("\n\t¿Valor Número Uno?\t");
        nUno = Op1.nextFloat();
        System.out.print("\t¿Valor Número Dos?\t");
        nDos = Op1.nextFloat();

        //Operaciones
        suma = (nUno + nDos);
        resta = (nUno - nDos);
        mult = (nUno * nDos);
        div = (nUno / nDos);
        resto = (nUno % nDos);

        System.out.print("\n\t******Salida De Datos******");
        System.out.print("\n\tSuma\t\t\t" + suma + ".");
        System.out.print("\n\tResta\t\t\t" + resta + ".");
        System.out.print("\n\tMultiplicación\t\t" + mult + ".");
        System.out.print("\n\tDivisión\t\t" + div + ".");
        System.out.print("\n\tResto\t\t\t" + resto + ".");
        System.out.print("\n\n");
    }
}
