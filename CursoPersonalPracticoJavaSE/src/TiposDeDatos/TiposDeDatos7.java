package TiposDeDatos;

import java.util.*;
import java.math.*;
import javax.swing.*;

public class TiposDeDatos7 {

    public static void main(String[] args) {

        int ventera;
        double vdecimal;
        String cadena;
        char caracter;

        ventera = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Un Entero"));
        vdecimal = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Un Decimal"));
        cadena = JOptionPane.showInputDialog("Ingrese Una Cadena");
        caracter = JOptionPane.showInputDialog("Ingrese Un Caracter").charAt(0);
        
        JOptionPane.showMessageDialog(null, "Valor Entero"+ventera);
        JOptionPane.showMessageDialog(null,"Valor Decimal"+ ventera);
        JOptionPane.showMessageDialog(null,"Valor Cadena"+cadena);
        JOptionPane.showMessageDialog(null, "Valor Caracter"+caracter);
        
        System.out.print("\n\t*****DATOS INGRESADOS*****");
        System.out.print("\n\tValor Entero\t\t"+ventera+".");
        System.out.print("\n\tValor Decimal\t\t"+vdecimal+".");
        System.out.print("\n\tValor Cadena\t\t"+cadena+".");
        System.out.print("\n\tValor Caracter\t\t"+caracter+".");
        System.out.print("\n\t");
        
    }
}
