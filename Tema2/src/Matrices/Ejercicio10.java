package Matrices;

//Crea un metodo que compruebe si una matriz pasada por parámetro es simétrica en
//función del eje Y. Es decir, la matriz
//1 3 0 3 1
//        4 2 7 2 4
//        6 1 9 1 6
//        0 8 8 8 0
//es simétrica en función de su eje Y, porque si invirtiésemos el orden en el que leemos las
//columnas, la matriz se vería igual.
//Pero la matriz
//1 4 6
//        2 1 3
//no es simétrica, pues no cumple dicha propiedad.


public class Ejercicio10 {
    public static void main(String[] args) {
        int[][] tamanoMatriz = {{1,3,0,3,1}, {4,2,7,2,4}, {6,1,9,1,6}, {0,8,8,8,0}};

        if (comprobarSimetriaEjeX(tamanoMatriz)){
            System.out.println("Es simetrica");
        } else {
            System.out.println("No es simetrica");
        }
    }

    /**
     * Crea un metodo que compruebe si una matriz pasada por parámetro es simétrica en
     * función del eje Y.
     *
     * @param matriz es la que vamos a comprobar su simetria.
     */
    static public boolean comprobarSimetriaEjeX(int[][] matriz) {

        // Comprueba que todas las filas tengan exactamente el mismo tamaño.
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i].length != matriz[0].length) {
                return false;
            }
        }

        // Comprueba que los numeros de las columnas(Y) de la izquierda y de la derecha sean iguales
        for (int j = 0; j < matriz[0].length / 2; j++) {
            for (int i = 0; i < matriz.length; i++) {
                if (matriz[i][j] != matriz[i][matriz[i].length -1 -j] ) {
                    return false;
                }
            }
        }
        return true;
    }
}
