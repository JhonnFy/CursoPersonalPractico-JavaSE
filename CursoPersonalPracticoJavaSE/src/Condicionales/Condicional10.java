package Condicionales;

import java.util.*;
import java.math.*;

public class Condicional10 {

    public static void main(String[] args) {

        Scanner Con10 = new Scanner(System.in);

        final int ddf = 30;
        final int mmf = 12;
        int dd = 0, mm = 0, yyyy = 0;

        System.out.print("\n\t*****FECHA*****");
        System.out.print("\n\t¿DD?\t\t");
        dd = Con10.nextInt();
        System.out.print("\t¿MM?\t\t");
        mm = Con10.nextInt();
        System.out.print("\t¿YYYY?\t\t");
        yyyy = Con10.nextInt();

        if (yyyy == 0) {
            System.out.print("\n\tFecha Incorrecta");
        } else if (dd <= ddf && mm <= mmf) {
            System.out.print("\n\tFecha Correcta");
        } else {
            System.out.print("\n\tFecha Incorrecta");
        }

        System.out.print("\n\t");
    }
}
