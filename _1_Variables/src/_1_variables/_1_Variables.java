/*
1.- Variables en JAVA
 */
package _1_variables;
public class _1_Variables {

    public static void main(String[] args) { // El metodo main es el metodo principal y sirve´para ejecutar programas en java
        
        // Variables: una variable es un espacio en memoria.
        /*
        int: son los numeros enteros: 1, 2, 3, 4, -1, -2, -3
        float: hace referencia a valores flotantes: 1.2, 4.5
        double: son los decimales: 1,2 , 4,5 ....
        String: te guarda texto o cadenas: Hola mi nombre es Nstor
        char: te guarda letras: a, b, c, d, e
        boolean: te guarda valores booleanos: true, false
        */
        
        // int
        int numero;
        numero = 100;
        System.out.println(numero); // sout + tab: System.out.println("");
        
        // float
        float numero_flotante;
        numero_flotante = 2.5f; // NOTA: A los valores flotantes siempre se les pone una f cuando se le asigna un valor de inicio
        System.out.println(numero_flotante);
        
        // double
        double numero_double;
        numero_double = 2.5; // NOTA: A los valores flotantes siempre se les pone una f cuando se le asigna un valor de inicio
        System.out.println(numero_double);
        
        // String
        String texto = "Hola me llamo Nestor";
        texto += ", soy de Bolivia"; // Concatenamos texto
        System.out.println(texto);
        
        // char
        char caracter = 'N'; // NOTA: char siempre va entre comillas simples ''
        System.out.println(caracter);
        
        // boolean
        boolean variable_booleana = true;
        System.out.println(variable_booleana);
    }
    
}
