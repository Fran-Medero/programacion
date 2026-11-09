package Ejercicio1Relacion1;

//Crea un metodo que acepte 2 arrays, y devuelva un nuevo array con los elementos
//que ambos arrays tienen en común.

public class Ejercicio11 {
    static public int[] devolverElementos(int[] elementos, int[] elementos2) {
        int[] arraysFinal = new int[elementos.length];
        int[] arraysTerminar;
        boolean siEsVerdadero = false;
        int posicion = 0;

        for (int i = 0; i < elementos.length; i++) {
            for (int j = 0; j < elementos2.length; j++) {
                if (elementos[i] == elementos2[j]) {
                    siEsVerdadero = false;
                    for (int l = 0; l < posicion; l++) {
                        if (arraysFinal[l] == elementos[i]) {
                            siEsVerdadero = true;
                        }
                    }
                    if (!siEsVerdadero) {
                        arraysFinal[posicion++] = elementos[i];
                    }
                }
            }
        }
        arraysTerminar = new int[posicion];
        for (int i = 0; i < posicion; i++) {
            arraysTerminar[i] = arraysFinal[i];
        }
        return arraysTerminar;
    }


    static void main(String[] args) {
        int[] elementos = {1,2,3,4,5};
        int[] elementos2 = {1,6,7,3,2};
        int[] array = devolverElementos(elementos, elementos2);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
