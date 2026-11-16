package Matrices;

//Crea un metodo que compruebe si en una matriz hay algún valor negativo, y devuelva un
//valor booleano.

public class Ejercicio1 {
    // static int contador = 0;
    static boolean numerosNegativos = false;
    static void main(String[] args) {
        int[][] matrizNumeroNegativo = {{1,2,3}, {-1,-2,4}, {7,8,9}};
        comprobarMatriz(matrizNumeroNegativo);
    }

    static public void comprobarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 0) {
                    numerosNegativos = true;
                }
            }
        }
        System.out.print("Hay numeros negatvios?" + "= " + numerosNegativos );
    }
}
