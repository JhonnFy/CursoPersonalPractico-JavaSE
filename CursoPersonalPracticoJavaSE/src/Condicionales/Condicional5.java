/*En MegaPlaza se hace un 20% de descuento a los clientes cuya compra supere los $300000.
¿Cuál será la cantidad que pagara una persona por su compra?*/
package Condicionales;

import java.util.*;
import java.math.*;

public class Condicional5 {

    public static void main(String[] args) {

        double vInicial = 0;

        Scanner Cond5 = new Scanner(System.in);

        System.out.print("\n\t*****DESCUENTOS POR COMPRA*****");
        System.out.print("\n\t¿Valor De La Compra?\t\t$");
        vInicial = Cond5.nextDouble();

        if (vInicial > 300000) {
            double descuento = 0, vFinal = 0;
            Math.round(descuento = (vInicial * 0.20));
            Math.round(vFinal = (vInicial - descuento));
            System.out.print("\n\t*****COMPRA CON DESCUENTO*****");
            System.out.print("\n\t1-Valor Inicial De Compra\t$" + Math.round(vInicial) + ".");
            System.out.print("\n\t2-Descuento Del 20%\t\t$" + Math.round(descuento) + ".");
            System.out.print("\n\t1-Valor Neto De Compra\t\t$" + Math.round(vFinal) + ".");
        } else {
            System.out.print("\n\t*****COMPRA SIN DESCUENTO*****");
            System.out.print("\n\t1-Valor Neto De Compra\t\t" + Math.round(vInicial) + ".");
        }
        System.out.print("\n\t");
    }
}
