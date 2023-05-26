/*Pedir tres números y mostrarlos ordenados de mayor a menor*/
package Condicionales;

import java.util.*;
import java.math.*;

public class Condicional8 {

    public static void main(String[] args) {

        Scanner Cond8 = new Scanner(System.in);

        int nUno = 0, nDos = 0, nTres = 0;

        System.out.print("\n\tNúmero Uno\t\t");
        nUno = Cond8.nextInt();
        System.out.print("\tNúmero Dos\t\t");
        nDos = Cond8.nextInt();
        System.out.print("\tNúmero Tres\t\t");
        nTres = Cond8.nextInt();

        //10,1,8 4,5,0 1,2,20
        if (nUno > nDos && nUno > nTres) {
            System.out.print("\n\tSea El Mayor \t\t#1==" + nUno + ".");
            if(nDos>nTres){
                System.out.print("\n\tSea El Intermedio \t#2==" + nDos + ".");
                System.out.print("\n\tSea El Menor \t\t#3==" + nTres + ".");
            }else if(nTres>nDos){
                System.out.print("\n\tSea El Intermedio \t#3==" + nTres + ".");
                System.out.print("\n\tSea El Menor \t\t#2==" + nDos + ".");
            }
        } else if (nDos > nUno && nDos > nTres) {
            System.out.print("\n\tSea El Mayor \t\t#2==" + nDos + ".");
            if(nUno>nTres){
                System.out.print("\n\tSea El Intermedio \t#1=="+nUno+".");
                System.out.print("\n\tSea El Menor \t\t#3=="+nTres+".");
            }else if(nTres>nUno){
                System.out.print("\n\tSea El Intermedio\t#3=="+nTres+".");
                System.out.print("\n\tSea El Menor\t\t#2=="+nUno+".");
            }
        } else if(nTres>nDos && nTres>nDos){
            System.out.print("\n\tSea El Mayor \t\t#3==" + nTres + ".");
            if(nUno>nDos){
                System.out.print("\n\tSea El Intermedio \t#1==" + nUno + ".");
                System.out.print("\n\tSea El Menor \t\t#2=="+nDos+".");
            }else if(nDos>nUno){
                System.out.print("\n\tSea El Intermedio \t#2==" + nDos + ".");
                System.out.print("\n\tSea El Menor \t\t#1=="+nUno+".");
            }
        }
        System.out.println("\n\t");
    }
}
