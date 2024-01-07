/*
 */
package _3_operadores;

import java.util.Scanner;

public class _2_Concatenacion {

    public static void main(String[] args) {
        
        // Enteros
        int numero = 10;
        numero = numero + 20;
        System.out.println(numero);
        
        // Cadenas
        String cadena = "Hola me llamo Nestor";
        cadena += ", Soy de Bolivia";
        System.out.println(cadena);
        
        // Con entrada de datos
        Scanner entrada = new Scanner(System.in);
        String nombre;
        
        System.out.print("Digite su nombre: ");
        nombre = entrada.next();
        
        System.out.println("El nombre es: " + nombre);
        
        nombre += " Mamani";
        System.out.println("El nombre es: " + nombre);
        
        
    }
    
}
