/*La calificación final de un estudiante de informática se calcula con base a las calificaciones de cuatro aspectos de su rendimiento académico:
Participación (10%).
Primer examen parcial (25%).
Segundo examen parcial (25%).
Examen final (40%).
Sabiendo que las calificaciones anteriores, entran a la calificación final con ponderaciones del 10%,25%,25%, y 40%.

Hacer un programa que calcule e imprima la calificación final obtenida por un estudiante.*/
package Algoritmos;

import java.util.*;
import java.math.*;

public class Algoritmo5 {

    public static void main(String[] args) {

        Scanner Alg5 = new Scanner(System.in);

        float clf1 = 0f;
        float clf2 = 0f;
        float clf3 = 0f;
        float clf4 = 0f;
        float nfinal = 0;

        System.out.print("\n\t*****NOTAS DEL ESTUDIANTE*****");
        System.out.print("\n\t¿Nota1 Participación?\t\t$");
        clf1 = Alg5.nextFloat();
        System.out.print("\t¿Nota2 Primer Examen Parcial?\t$");
        clf2 = Alg5.nextFloat();
        System.out.print("\t¿Nota3 Segundo Examen Parcial?\t$");
        clf3 = Alg5.nextFloat();
        System.out.print("\t¿Nota4 Examen Parcial?\t\t$");
        clf4 = Alg5.nextFloat();

        clf1 = (clf1 * 10) / 100;
        clf2 = (clf2 * 25) / 100;
        clf3 = (clf3 * 25) / 100;
        clf4 = (clf4 * 40) / 100;

        System.out.print("\n\t*****NOTAS DEL ESTUDIANTE*****");
        System.out.print("\n\tCalificación Uno\t\t$" + clf1 + ".");
        System.out.print("\n\tCalificación Dos\t\t$" + clf2 + ".");
        System.out.print("\n\tCalificación Tres\t\t$" + clf3 + ".");
        System.out.print("\n\tCalificación Cuatro\t\t$" + clf4 + ".");
        nfinal = (clf1 + clf2 + clf3 + clf4);
        System.out.print("\n\tNota Final\t\t\t$" + nfinal + ".");
        System.out.print("\n\t");
    }
}
