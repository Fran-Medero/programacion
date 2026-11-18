package Matrices;

// Crea un metodo que reciba dos matrices, y compruebe si son matrices inversas, es decir,
//si tienen los mismos valores en los índices inversos:

public class Ejercicio11 {
    public static void main(String[] args) {
        int[][] matriz = {{1,2,3}, {4,5,6}};
        int[][] matriz2 = {{6,5,4}, {3,2,1}};

        if (!comprobarMatricesInversa(matriz, matriz2)) {
            System.out.println("No son los mismos valores a la inversa");
        } else {
            System.out.println("Son los mismos valores a la inversa");
        }
    }

    /**
     * Este metodo vamos a comparar si las matrices son iguales a la inversa.
     *
     * @param matriz es la primera matriz.
     * @param matriz2 es la segunda matriz que comprobaremos.
     * @return devolver si es verdadero o falso.
     */
    static public boolean comprobarMatricesInversa(int[][] matriz, int[][] matriz2) {
        if (!Ejercicio7.comparartamañoMatrices(matriz, matriz2)) {
            System.out.println("No son iguales, no se puede comparar");
        } else {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    if (matriz[i][j] != matriz2[matriz2.length -1 -i][matriz2[i].length -1 -j]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
