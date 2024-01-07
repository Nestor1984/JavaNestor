package _2_entradadedatos;

import java.util.Scanner; // Libreria Scanner

public class _2_EntradaDeDatos {

    public static void main(String[] args) {
        
        // Objeto de tipo Scanner para leer datos
        Scanner teclado = new Scanner(System.in);
        
        // Declarando variables
        int edad;
        String nombre;
        float altura;
        
        System.out.print("Digite su edad: ");
        edad = teclado.nextInt();
        
        System.out.print("Digite su nombre: ");
        nombre = teclado.next();
        
        System.out.print("Digite su altura: ");
        altura = teclado.nextFloat();
        
        System.out.println("");
        
        System.out.println("La edad es: " + edad);
        System.out.println("El nombre es: " + nombre);
        System.out.println("La altura es: " + altura);
        
        // NOTA: En el codigo pueden crear variables con el '.' y al momento de ingresar datos se debe usar la ','
        
    }
    
}
