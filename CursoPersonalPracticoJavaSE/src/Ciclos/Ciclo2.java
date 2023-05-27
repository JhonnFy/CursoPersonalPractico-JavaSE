
package Ciclos;
import java.util.*;
import java.math.*;


public class Ciclo2 {
    public static void main(String[] args) {
     
        for(int a =1; a<=10; a++){
            System.out.print("\n\tASC "+a+".");
            for(int b =11; b<=11; b++){
                System.out.print("\n\tDSC "+(b-a)+".");
            }
        }
        System.out.print("\n\t");    
    }
}
