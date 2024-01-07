/*
 */
package _6_arreglos;

public class _1_CreacionDeUnArreglo {

    public static void main(String[] args) {
        
        // NOTA: Un arreglo empieza desde 0
        
        // 1ra forma
        System.out.println("1ra forma:");
        int numeros[] = {1, 2, 3, 4, 5};
        
        // Imprimimos
        for (int i = 0; i < numeros.length; i++) { // lenght: este metodo te devuelve la longitud del arreglo
            System.out.println(numeros[i]);
        }
        
        // 2da forma
        System.out.println("\n2da forma:"); // \n: da un salto de linea
        System.out.println("\nArreglo con enteros");
        int arreglo[] = new int[4];
        
        // Rellenamos el arreglo
        arreglo[0] = 1;
        arreglo[1] = 2;
        arreglo[2] = 3;
        arreglo[3] = 4;
        
        // Imprimimos
        for (int i = 0; i < arreglo.length; i++) { // lenght: este metodo te devuelve la longitud del arreglo
            System.out.println(arreglo[i]);
        }
        
        System.out.println("\nArreglo con cadenas");
        String[] arreglo2 = new String[4]; // String[]: esta es otra forma de declarar los arreglos
        
        // Rellenamos el arreglo
        arreglo2[0] = "Nestor";
        arreglo2[1] = "Pepe";
        arreglo2[2] = "Mario";
        arreglo2[3] = "Judas";
        
        // Imprimimos
        for (int i = 0; i < arreglo2.length; i++) { // lenght: este metodo te devuelve la longitud del arreglo
            System.out.println(arreglo2[i]);
        }
    }
    
}
