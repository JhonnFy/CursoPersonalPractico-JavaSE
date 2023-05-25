/*Construir un programa que, dado un número total de horas, 
devuelve el número de:
Semanas, 
Días,
Horas Equivalentes.
Por ejemplo, dado un total de 1000 horas, debe mostrar 5 semanas, 6 días, 16 horas.*/

package Algoritmos;
import java.util.*;
import java.math.*;

public class Algoritmo7 {
    public static void main(String[] args) {
        
        Scanner Alg7 = new Scanner(System.in);
        
        int nth = 0;
        int sms = 0;
        int dias = 0;
        int hrs = 0;
        
        System.out.print("\n\t*****HORAS PARA SEMANAS*****");
        System.out.print("\n\t¿Cantidad De Horas?\t\t");
        nth = Alg7.nextInt();
     
        //24 Horas Día * 7 1 Semana
        sms = (nth / 168);
        dias = (nth%168)/24;
        hrs = nth%24;
        
        System.out.print("\n\t*****SALIDA DE DATOS*****");
        System.out.print("\n\tSemanas\t\t\t"+sms+".");
        System.out.print("\n\tDías\t\t\t"+dias+".");
        System.out.print("\n\tHoras Equivalentes\t"+hrs+".");
        System.out.print("\n\t");
    }
}