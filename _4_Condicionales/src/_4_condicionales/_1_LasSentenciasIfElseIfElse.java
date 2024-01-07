/*
 */
package _4_condicionales;

import java.util.Scanner;

public class _1_LasSentenciasIfElseIfElse {

    public static void main(String[] args) {
        
        /*NOTA: un '=' es para asignar, '==' es para comparar*/
        
        Scanner entrada = new Scanner(System.in);
        char camino;
        
        System.out.print("Digite el camino que desea: ");
        camino = entrada.next().charAt(0);
        
        System.out.println(camino);
        
        // Condicionales
        if (camino == 'A') { // if + tab = if (true) {}
            System.out.println("Usted ha elegido el camino A");
        }else if (camino == 'B') {
            System.out.println("Usted ha elegido el camino B");
        }else if (camino == 'C') {
            System.out.println("Usted ha elegido el camino C");
        }else{
            System.out.println("No se ha elegido ningun camino");
        }
        
    }
    
}
