//Programa que calcule e imprima la suma de tres calificaciones
package Algoritmos;
import java.util.*;
import java.math.*;


public class Algoritmo1 {
    public static void main(String[] args) {
        
        Scanner Alg1 = new Scanner(System.in);
        
        float nUno =0f, nDos =0f, nTres=0f, cal=0f;
        
        System.out.print("\n\t*****BIENVENIDO*****");
        System.out.print("\n\t¿Calificación Número Uno?\t");
        nUno = Alg1.nextFloat();
        System.out.print("\t¿Calificación Número Dos?\t");
        nDos = Alg1.nextFloat();
        System.out.print("\t¿Calificación Número Tres?\t");
        nTres = Alg1.nextFloat();
        
        cal = (nUno+nDos+nTres);
        
        System.out.print("\n\n\tEstado De Calificaciones\t"+cal+".");
        System.out.print("\n\t");
        
    }
}
