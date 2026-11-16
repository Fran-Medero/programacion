package Matrices;

//  Crea un metodo que sume todas las posiciones de una matriz y
//  devuelva dicho número

public class Ejercicio2 {
    static int suma = 0;
    static void main(String[] args) {
        int[][] numeros = {{1,2,3}, {4,5,6}, {7,8,9}};
        sumaMatriz(numeros);
        System.out.println(suma);
    }

    static public int sumaMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }
        return suma;
    }
}
