/*Hacer un programa que pase de Kg a otra unidad de medida de masa.
mostrar en pantalla un menú con las opciones posibles
Kilogramo 1*1000 Gramo.
Kilogramo 1*2.20462 Libra.
Kilogramo 1*35.274 Masa.*/
package Condicionales;

import java.util.*;
import java.math.*;

public class Condicional14 {

    public static void main(String[] args) {

        Scanner Con14 = new Scanner(System.in);
        int opc = 0;

        System.out.print("\n\t****UNIDADES DE MASA");
        System.out.print("\n\t1-CONSULTAS MULTIPLES");
        System.out.print("\n\t2-SALIR DEL SISTEMA");
        System.out.print("\n\tSeleccione Una Opción:\t\t");
        opc = Con14.nextInt();

        switch (opc) {
            case 1:
                if (opc == 1) {
                    final double klg = 1;
                    final double gramo = 1000;
                    final double libra = 2.20462;
                    final double masa = 35.274;
                    double vMasa = 0;

                    System.out.print("\n\t****UNIDADES DE MASA");
                    vMasa = (vMasa*0);
                    vMasa = (klg * gramo);
                    System.out.print("\n\t1 Kilogramo A Gramo:\t\t"+vMasa+".");
                    vMasa = (vMasa*0);
                    vMasa = (klg*libra);
                    System.out.print("\n\t1 Kilogramo A Libra:\t\t"+vMasa+".");
                    vMasa = (vMasa*0);
                    vMasa = (klg*masa);
                    System.out.print("\n\t1 Kilogramo A Masa:\t\t"+vMasa+".");
                }
                break;
            case 2:
                System.out.print("\n\tFuera De Línea");
                System.exit(0);
                break;
        }
        System.out.print("\n\t");
    }
}
