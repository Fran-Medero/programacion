package Matrices;

// Crea un metodo que compruebe si una matriz pasada por parámetro es simétrica en
//función del eje X. Es decir, la matriz
//1 3 5 6
//4 2 0 8
//4 2 0 8
//1 3 5 6
//es simétrica en función de su eje X, porque si invirtiésemos el orden en el que leemos las
//filas, la matriz se vería igual.
//Pero la matriz
//1 4 6
//2 1 3
//no es simétrica, pues no cumple dicha propiedad

public class Ejercicio9 {
    public static void main(String[] args) {
        int[][] tamanoMatriz = {{1,3,5,6}, {4,2,0,8}, {4,2,0,8}, {1,3,5,6}};

        if (comprobarSimetriaEjeX(tamanoMatriz)){
            System.out.println("Es simetrica");
        } else {
            System.out.println("No es simetrica");
        }
    }

    /**
     * Crea un metodo que compruebe si una matriz pasada por parámetro es simétrica en
     * función del eje X. 
     *
     * @param matriz es la que vamos a comprobar su simetria.
     */
    static public boolean comprobarSimetriaEjeX(int[][] matriz) {

        // Comprobamos solo la mitad superior de las filas y las comparamos con su fila inferior
        for (int i = 0; i < matriz.length / 2; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] != matriz[matriz.length -1 -i][j] ) {
                    return false;
                }
            }
        }
        return true;
    }
}
