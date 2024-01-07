/*
 */
package _4_condicionales;

import javax.swing.JOptionPane; // Importamos la libreria

public class _3_EntradaDeDatosConJOptionPane {

    public static void main(String[] args) {
        
        // Creamos las variable
        int numero_entero;
        double numero_decimal;
        float numero_flotante;
        String cadena;
        char caracter;
        
        // Aplicamos las ventanas emergentes
        // Leemos los datos
        numero_entero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        numero_decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite un numero decimal: "));
        numero_flotante = Float.parseFloat(JOptionPane.showInputDialog("Digite un numero flotante: "));
        cadena = JOptionPane.showInputDialog("Digite una cadena: ");
        caracter = JOptionPane.showInputDialog("Digite un caracter: ").charAt(0);
        
        // Imprimimos los datos
        JOptionPane.showMessageDialog(null, "El numero entero es: " + numero_entero);
        JOptionPane.showMessageDialog(null, "El numero decimal es: " + numero_decimal);
        JOptionPane.showMessageDialog(null, "El numero flotante es: " + numero_flotante);
        JOptionPane.showMessageDialog(null, "La cadena es: " + cadena);
        JOptionPane.showMessageDialog(null, "El caracter es: " + caracter);
        
    }   
    
}
