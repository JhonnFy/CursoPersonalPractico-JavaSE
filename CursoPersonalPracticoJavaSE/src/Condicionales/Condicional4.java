/*Hacer un programa que lea un carácter por teclado y compruebe si es una letra mayúscula*/
package Condicionales;

import java.util.*;
import java.math.*;

public class Condicional4 {

    public static void main(String[] args) {

        Scanner Cond4 = new Scanner(System.in);
        char caracter;

        System.out.print("\n\t*****ENTRADA DE CARACTERES*****");
        System.out.print("\n\tIngresar Un Caracter\t\t");
        caracter = Cond4.nextLine().charAt(0);

        if (Character.isUpperCase(caracter)) {
            System.out.print("\n\t*****MAYUSCULA*****");
        } else {
            System.out.print("\n\t*****MINUSCULA*****");
        }
        System.out.print("\n\t");
    }

}
