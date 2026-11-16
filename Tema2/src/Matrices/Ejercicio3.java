package Matrices;

//Crea un metodo que reciba una matriz e imprima, en una sola línea, los elementos de la
//misma, leídos por filas:

import java.util.Arrays;

public class Ejercicio3 {

    static void main(String[] args) {
        int[][] matriz = {{1,2,3}, {4,5,6}};
        imprimirSolaLinea(matriz);
    }

    static public void imprimirSolaLinea( int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }
    }
}
