/*
 */
package _4_condicionales;

import java.util.Scanner;

public class _2_LaSentenciaSwitch {

    public static void main(String[] args) {
        
        /*Switch: un switch propone casos.*/
        /*
        Sintaxis:
        switch(variable a evaluar){
        
        }
        */
        
        Scanner entrada = new Scanner(System.in);
        char camino;
        
        System.out.print("Digite el camino que desea: ");
        camino = entrada.next().charAt(0);
        
        switch(camino){
            
            case 'A':
                System.out.println("Usted esta en el camino A");
                break; // Lo que hace break es cerrar una condicion y salir
            case 'B':
                System.out.println("Usted esta en el camino B");
                break;
            case 'C':
                System.out.println("Usted esta en el camino C");
                break;
            default: // Opcion por defecto
                System.out.println("No esta en ningun camino");
                break;
            
        }
                
        
    }
    
}
