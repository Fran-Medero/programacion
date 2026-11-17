package Matrices;

//Crea un metodo que reciba dos matrices, y compruebe si son exactamente iguales

import java.util.IllegalFormatCodePointException;

public class Ejercicio7 {
    static void main(String[] args) {
        int[][] matriz1 = {{1,2,3}, {4,5,6}};
        int[][] matriz2 = {{1,2,3}, {4,5,6}};
        comparartamañoMatrices(matriz1, matriz2);

        if (comprobarValoresMatrices(matriz1, matriz2)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }

    }

    /**
     *  Recibe dos matrices, y comprueba si son exactamente iguales
     *
     * @param matriz  es la primera matriz
     * @param matriz2   es la seguna matriz que se comprobaran
     * @return true si las 2 matrices son iguales en tamaño y contenido
     */
    static public boolean comparartamañoMatrices(int[][] matriz, int[][] matriz2) {

        if (matriz.length != matriz2.length) {
            return false;
        }

        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i].length != matriz2[i].length) {
                return false;
            }
        }


        return true;
    }

    /**
     * Comprobamos valor por valor, las matrices para comprobar si son exactamente iguales.
     *
     * @param matriz    es la primera matriz
     * @param matriz2   es la seguna matriz que se comprobaran
     * @return  true si las 2 matrices son iguales en tamaño y contenido
     */
    static public boolean comprobarValoresMatrices(int[][] matriz, int[][] matriz2){

        // LLamamos al metodo anterior para comprobar que las dos matrices tengan el mismo tamaño
        if (!comparartamañoMatrices(matriz, matriz2)) {
            return false;
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] != matriz2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
