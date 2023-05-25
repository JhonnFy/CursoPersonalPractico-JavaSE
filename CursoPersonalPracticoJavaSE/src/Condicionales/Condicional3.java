/*Solicitar un número entero e imprimir si es múltiplo, de 10*/
package Condicionales;

import java.util.*;
import java.math.*;

public class Condicional3 {

    public static void main(String[] args) {

        Scanner Cond3 = new Scanner(System.in);

        final int num = 10;
        int nusu = 0;

        System.out.print("\n\t*****MULTIPLOS DE 10*****");
        System.out.print("\n\tIngresar Un Valor Númerico\t\t");
        nusu = Cond3.nextInt();

        if (nusu % num == 0) {
            System.out.print("\n\tEl Número" + nusu + ",SI Es Multiplo De 10.");
        } else {
            System.out.print("\n\tEl Número" + nusu + ",NO Es Multiplo De 10.");
        }

        System.out.print("\n\t");   
    }
}
