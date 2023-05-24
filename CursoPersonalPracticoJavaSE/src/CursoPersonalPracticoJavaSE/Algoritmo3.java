package CursoPersonalPracticoJavaSE;
//Librerias

import java.util.*;
import java.math.*;

public class Algoritmo3 {

    public static void main(String[] args) {

        Scanner Alg3 = new Scanner(System.in);

        //Tipos Enteros
        int vInt = 10;
        short vShort = 20;
        long vLong = 30;
        byte vByte = 40;

        //Tipos Decimales
        float vFloat = 1.5f;
        double vDouble = 2.0;

        //Tipos Boolean
        boolean vTBoolean = true;
        boolean vFBoolean = false;

        //Tipos String
        String cadena = "Cadena de texto";

        //Tipos Caracter
        char cUno = 'a';

        System.out.print("\n\t*****Tipos De Datos ENTEROS*****");
        System.out.print("\n\t1-Valor Int:\t\t" + vInt + ".");
        System.out.print("\n\t2-Valor Short\t\t" + vShort + ".");
        System.out.print("\n\t3-Valor Long\t\t" + vLong + ".");
        System.out.print("\n\t3-Valor Byte\t\t" + vByte + ".");

        System.out.print("\n\n\t*****Tipos De Datos DECIMAL*****");
        System.out.print("\n\t1-Valor Float\t\t" + vFloat + ".");
        System.out.print("\n\t2-valor Double\t\t" + vDouble + ".");

        System.out.print("\n\n\t*****Tipos De Datos BOOLEAN*****");
        System.out.print("\n\t1-Valor Verdadero\t" + vTBoolean + ".");
        System.out.print("\n\t2-Valor Negativo\t" + vFBoolean + ".");

        System.out.print("\n\n\t*****Tipos De Datos CADENA DE TEXTO*****");
        System.out.print("\n\tValor CadenaDeTexto\t" + cadena + ".");

        System.out.print("\n\n\t*****Tipos De Datos CARACTER*****");
        System.out.print("\n\tValor Char\t\t" + cUno + ".");
        System.out.print("\n\t");
    }
}
