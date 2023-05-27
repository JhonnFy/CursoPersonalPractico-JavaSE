/*Pedir el día, mes y año de una fecha e indicar si la fecha es correcta.
Con meses de 28-30-31 días. Sin años bisiestos*/
package Condicionales;

import java.util.*;
import java.math.*;

public class Condicionales11 {

    public static void main(String[] args) {

        Scanner Con11 = new Scanner(System.in);

        int dd = 0, mm = 0, yyyy = 0;

        System.out.print("\n\t*****IDENTIFICAR FECHA*****");
        System.out.print("\n\t¿DD?\t\t");
        dd = Con11.nextInt();
        System.out.print("\t¿MM?\t\t");
        mm = Con11.nextInt();
        System.out.print("\t¿YYYY?\t\t");
        yyyy = Con11.nextInt();

        if (yyyy == 0) {
            System.out.print("\n\tFecha Incorrecta");
        } else if (dd <= 30 && mm <= 31) {
            System.out.print("\n\tFecha Correcta");
        } else {
            System.out.print("\n\tFecha Incorrecta");
        }

        System.out.print("\n\t");

    }
}
