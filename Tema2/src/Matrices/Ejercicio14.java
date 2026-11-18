package Matrices;

// Crea un metodo que transforme una matriz cualquiera, convirtiendo sus filas en
//columnas y viceversa.

public class Ejercicio14 {

    public static void main(String[] args) {
        int[][] matriz = {{1,2}, {3,4,5,6}, {7,8,9}};

        int[][] resultadoFinal = conversionMatriz(matriz);

        for (int i = 0; i < resultadoFinal.length; i++) {
            for (int j = 0; j < resultadoFinal[i].length; j++) {
                System.out.print(resultadoFinal[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Para hacer la conversion de la matriz convirtiendo sus filas en columnas
     * @param matriz
     * @return
     */
    static public int[][] conversionMatriz(int[][] matriz) {

        // Buscamos la fila más larga: ese será el número de filas de la matriz resultado.
        int maxColumna = 0;
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i].length > maxColumna) {
                maxColumna = matriz[i].length;
            }
        }

        int[][] resultado = new int[maxColumna][matriz.length];

        // Invertimos la Matriz convirtiendo sus filas en columnas y viceversa.
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                resultado[j][i] = matriz[i][j];
            }
        }
        return resultado;
    }
}
