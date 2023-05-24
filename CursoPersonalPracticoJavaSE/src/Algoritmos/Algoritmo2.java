package Algoritmos;
import java.util.*;
import java.math.*;

/*Hacer un programa que calcule e imprima el salario mensual de un empleado a partir de sus horas semanales trabajadas,
y de su salario por hora*/

public class Algoritmo2 {
    public static void main(String[] args) {
        
        Scanner Alg2 = new Scanner(System.in);
        float hts = 0f, vht=0f, salario=0f;
        
        System.out.print("\n\t*****CONTADOR DE NOMINA*****");
        System.out.print("\n\t1-¿Cantidad De Horas Laboradas?\t\t");
        hts = Alg2.nextFloat();
        System.out.print("\t2-¿Valor De La Hora Laborada?\t\t$");
        vht = Alg2.nextFloat();
        
        salario = (hts*vht);
        
        System.out.print("\n\n\t*****ESTADO DE NOMINA*****");
        System.out.print("\n\tSalario Neto\t\t$"+Math.round(salario)+".");
        System.out.print("\n\t");
    }
}
