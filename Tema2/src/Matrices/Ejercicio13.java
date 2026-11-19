package Matrices;

//Crea un metodo que transforme una matriz CUADRADA (tienes que realizar dicha
//        comprobación) que recibe por parámetro, en otra, que debe ser su reflejo en diagonal (de
//abajo a la derecha a arriba a la izquierda):
//        1 2 3 4 5 4 7 5 0 5
//        6 7 8 9 0 5 6 4 9 4
//        3 2 1 4 5 --> 8 8 1 8 3
//        9 5 8 6 7 9 5 2 7 2
//        0 9 8 5 4 0 9 3 6 1

public class Ejercicio13 {
    static int[][] resultadoMatriz = {{0,0,0,0,0}, {0,0,0,0,0}, {0,0,0,0,0}, {0,0,0,0,0}, {0,0,0,0,0}};

    public static void main(String[] args) {
        int[][] matriz = {{1,2,3,4,5}, {6,7,8,9,0}, {3,2,1,4,5}, {9,5,8,6,7}, {0,9,8,5,4}};
        if (!Ejercicio12.siLaMatrizEsCuadrada(matriz)) {
            System.out.println("No es cuadrada, no se puede comprobar");
        } else {
            resultadoMatrizEnDiagonal(matriz);
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.print(resultadoMatriz[i][j] + " ");
                }
                System.out.println();
            }
        }
    }


    /**
     * Este metodo conseguiremos el cambio de las posiciones de la matriz.
     *
     * @param matriz elemento que utilizaremos.
     * @return  devuelve la matriz cambiada.
     */
    static public int[][] resultadoMatrizEnDiagonal(int[][] matriz) {

//        Crear una matriz igual que la otra
//        resultadoMatriz = new int[matriz.length][];
//        for (int i = 0; i < matriz.length; i++) {
//            resultadoMatriz[i] = new int[matriz[i].length];
//        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                resultadoMatriz[i][j] = matriz[matriz[i].length -1 -j][matriz.length -1 -i];
            }
        }
        return resultadoMatriz;
    }
}
