package Ejercicio1Relacion1;
// Modifica el metodo anterior y acepta un parámetro “reverse”, que indique si el array
//debe devolverse ordenado de menor a mayor o al revés.
import java.util.Arrays;

public class Ejercicio9 {
    static void main(String[] args) {
        int[] primerArray = {5, 1, 3, 2, 4, 6};
        boolean reverse = false;
        char sn = MiEntradaSalida.leerSiNo("Quieres ordenarlo del reves?");
        if (sn == 'S') {
            reverse = true;
        }
        int[] resultado = burbujaDeNumerosReverse(primerArray, reverse);
        // Con este sout te muestra como si vieras el array, por dentro.
        System.out.println(Arrays.toString(resultado));
    }


    public static int[] burbujaDeNumerosReverse(int[] arrays, boolean reverse) {
        int t = 0; // Esta variable nos ayuda para ir guardando los numeros.

        // Este for nos ayuda a recorrer el arrays hasta que todos los numeros esten ordenados.
        for (int i = 0; i < arrays.length; i++) {
            // Este for compara el primer número del array y compara con los siguientes hasta que haya uno mayor.
            for (int j = 0; j < arrays.length - 1 - i; j++) {
                if (!reverse) {
                    if (arrays[j] < arrays[j + 1]) {
                        t = arrays[j];
                        arrays[j] = arrays[j + 1];
                        arrays[j + 1] = t;
                    }
                } else {
                    if (arrays[j] > arrays[j + 1]) {
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


