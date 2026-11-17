package Matrices;

//Crea un metodo que reciba dos matrices, que deben ser de igual tamaño, y sume el
//contenido de las posiciones en una tercera matriz, que será la que devuelva:

import java.util.Arrays;

public class Ejercicio8 {
    static int[][] sumaMatrices = {{0,0,0}, {0,0,0}};
    static void main(String[] args) {
        int[][] matriz = {{1,2,3}, {4,5,6}};
        int[][] matriz2 = {{1,2,3}, {4,5,6}};

        sumaContenidoMatriz(matriz, matriz2);
        System.out.println("La suma de las dos matrices es:");

        for (int i = 0; i < sumaMatrices.length; i++) {
            for (int j = 0; j < sumaMatrices[i].length; j++) {
                System.out.print(sumaMatrices[i][j] + " ");
            }
            System.out.println();
        }

        // Otra forma de mosntrar el array
        //System.out.println("La suma de las dos matrices es: " + Arrays.deepToString(sumaMatrices));
    }

    /**
     * Con este metodo sumaremos los contenidos de las posiciones de las matrices.
     *
     * @param matriz es la primera matriz que sumaremos
     * @param matriz2 es la segunda matriz que sumaremos
     * @return  el resultado de la suma de las dos matrices
     */
    static public int[][] sumaContenidoMatriz(int[][] matriz, int[][] matriz2) {
        if (!Ejercicio7.comparartamañoMatrices(matriz, matriz2)) {
            System.out.println("No son el mismo tamaño, no se pueden sumar");
        } else {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    sumaMatrices[i][j] = matriz[i][j] + matriz2[i][j];
                }
            }
        }
        return sumaMatrices;
    }
}
