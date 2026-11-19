package Matrices;

// Crea un metodo que transforme una matriz CUADRADA (tienes que realizar dicha
//comprobación) que recibe por parámetro, en otra, que debe ser su reflejo en diagonal (de
//arriba a la izquierda a abajo a la derecha):
//1 2 3 4 5 1 6 3 9 0
//6 7 8 9 0 2 7 2 5 9
//3 2 1 4 5 --> 3 8 1 8 8
//9 5 8 6 7 4 9 4 6 5
//0 9 8 5 4 5 0 5 7 4

public class Ejercicio12 {
    static int[][] resultadoMatriz = {{0,0,0,0,0}, {0,0,0,0,0}, {0,0,0,0,0}, {0,0,0,0,0}, {0,0,0,0,0}};
    public static void main(String[] args) {

        int[][] matriz = {{1,2,3,4,5}, {6,7,8,9,0}, {3,2,1,4,5}, {9,5,8,6,7}, {0,9,8,5,4}};

        siLaMatrizEsCuadrada(matriz);

        if (!siLaMatrizEsCuadrada(matriz)) {
            System.out.println("No se puede reemplazar no es una matriz cuadrada");
        } else {
            matrizReflejoDiagonal(matriz);
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.print(resultadoMatriz[i][j] + " ");
                }
                System.out.println();
            }
        }

    }

    /**
     * Para comprobar si la matriz es cuadrada.
     *
     * @param matriz elemento que comprobaremos.
     * @return devuelve true si es cuadrada o false si no lo es.
     */
    static public boolean siLaMatrizEsCuadrada(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            if (matriz.length != matriz[i].length) {
                return false;
            }
        }
        return true;
    }

    /**
     * Este metodo conseguiremos el cambio de las posiciones de la matriz.
     *
     * @param matriz elemento que utilizaremos.
     * @return  devuelve la matriz cambiada.
     */
    static public int[][] matrizReflejoDiagonal(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                resultadoMatriz[i][j] = matriz[j][i];
            }
        }
        return resultadoMatriz;
    }
}
