package Ejercicio1Relacion1;

public class Ejercicio9 {
    static void main(String[] args) {
        int[] primerArray = {5, 1, 3, 2, 4};
        boolean reverse = false;
        char sn = MiEntradaSalida.leerSiNo("Quieres ordenarlo al reves de Menor a Mayor?");
        if (sn == 'S') {
           reverse = true;
        }
        int[] resultado = burbujaDeNumeros(primerArray, reverse);
        for (int i = 0; i < resultado.length; i++) {
            System.out.println(resultado[i]);
        }
    }

    public static int[] burbujaDeNumeros(int[] arrays, boolean reverse) {
        int t = 0;
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays.length -1; j++) {
                if (!reverse) {
                    if (arrays[j] < arrays[j+1]) {
                        t = arrays[j];
                        arrays[j] = arrays[j+1];
                        arrays[j + 1] = t;
                    }

                } else {
                    if (arrays[j] > arrays[j+1]) {
                        t = arrays[j];
                        arrays[j] = arrays[j + 1];
                        arrays[j + 1] = t;
                    }
                }
            }
        }
        return arrays;
    }
}

