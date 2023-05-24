package TiposDeDatos;

import java.util.*;
import java.math.*;

public class TiposDeDatos6 {

    public static void main(String[] args) {

        Scanner Alg6 = new Scanner(System.in);

        int nEntero;
        float nDecimal;
        double nDecimalF;
        String cadena;
        String cadena2;
        char caracter;

        System.out.print("\n\n\t*****ENTRADA DE DATOS*****");
        System.out.print("\n\tIngrese Una CadenaDeTexto :\t");
        cadena = Alg6.next();
        System.out.print("\tIngrese Una CadenaDeTexto :\t");
        cadena2 = Alg6.nextLine();
        cadena2 = Alg6.nextLine();
        System.out.print("\tIngrese Un Caracter :\t\t");
        caracter = Alg6.next().charAt(0);
        System.out.print("\tIngrese Un Número Entero:\t");
        nEntero = Alg6.nextInt();
        System.out.print("\tIngrese Un Número Decimal:\t");
        nDecimal = Alg6.nextFloat();
        System.out.print("\tIngrese Un Número Decimal:\t");
        nDecimalF = Alg6.nextDouble();

        System.out.print("\n\tSea el valor (CADENA),ingresado:\t" + cadena + ".");
        System.out.print("\n\tSea el valor (CADENA),ingresado:\t" + cadena2 + ".");
        System.out.print("\n\tSea el valor (CADENA),ingresado:\t" + caracter + ".");
        System.out.print("\n\tSea el valor (INT),ingresado:\t\t" + nEntero + ".");
        System.out.print("\n\tSea el valor (FLOAT),ingresado:\t\t" + nDecimal + ".");
        System.out.print("\n\tSea el valor (DOUBLE),ingresado:\t" + nDecimalF + ".");
        System.out.print("\n\t");
    }
}
