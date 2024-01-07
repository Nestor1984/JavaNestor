package _7_matrices;

import java.util.Scanner;

public class _1_CreacionDeUnaMatriz {

    public static void main(String[] args) {
        
        /*
        matriz: una matriz es un arreglo bidimensional
        */
        
        Scanner teclado = new Scanner(System.in);
        
        // 1ra forma
        int matriz[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        // Imprimimos
        for (int i = 0; i < 3; i++) { // Primer for para las filas
            for (int j = 0; j < 3; j++) { // Segundo for para las columnas
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        
        //2da forma
        float[][] matriz2 = new float[4][3]; // new float[tamanioDeFilas][tamanioDeColumnas]
        
        // Leemos 
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite un elemento en la posicion [" + i + "][" + j + "]: ");
                matriz2[i][j] = teclado.nextFloat();
            }
        }
        
        // Imprimimos
        System.out.println("\nLa matriz es: ");
        for (int i = 0; i < 4; i++) { // Primer for para las filas
            for (int j = 0; j < 3; j++) { // Segundo for para las columnas
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
}
