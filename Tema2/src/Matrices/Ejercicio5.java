package Matrices;

// Crea un metodo que reciba una matriz e imprima, en una sola línea, los elementos de la
//misma, pero leídos por columnas:

public class Ejercicio5 {
    static void main(String[] args) {
        int[][] matriz = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
        leerColumnas(matriz);
    }

    static public void leerColumnas(int[][] matriz) {
        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i < matriz.length; i++) {
                System.out.print(matriz[i][j] + " ");
            }
        }
    }
}
