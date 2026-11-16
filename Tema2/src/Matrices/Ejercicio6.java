package Matrices;

//Crea un metodo que reciba una matriz e imprima, en una sola línea, los elementos de la
//misma, pero leídos por columna, empezando por los últimos índices:

public class Ejercicio6 {
    static void main(String[] args) {
        int[][] matriz = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        leerColumnasReves(matriz);
    }

    static public void leerColumnasReves(int[][] matriz) {
        for (int j = matriz[0].length - 1; j >= 0; j--) {
            for (int i = matriz.length - 1; i >= 0; i--) {
                System.out.print(matriz[i][j] + " ");
            }
        }
    }
}
