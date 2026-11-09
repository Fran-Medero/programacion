package Ejercicio1Relacion1;

// Crea un array que devuelva un nuevo array donde se hayan eliminado los elementos
// duplicados del primero.

public class Ejercicio10 {
    static void main(String[] args) {
        int[] primerArrays = {1,1,5,5,3,3,4,4};
        int[] segundoArrays = new int[primerArrays.length];
        int contador = 0;
        boolean repetido = false;

        for (int i = 0; i < primerArrays.length; i++) {
            repetido = false;
            for (int j = 0; j < primerArrays.length; j++) {
                if (primerArrays[i] == segundoArrays[j]) {
                    repetido = true;
                }
            }
            if (!repetido) {
                segundoArrays[contador] = primerArrays[i];
                contador++;
            }
        }
        for (int i = 0; i < contador; i++) {
           // System.out.println(primerArrays[i]);
            System.out.println(segundoArrays[i]);
        }


    }
}
