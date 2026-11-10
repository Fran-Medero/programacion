package Ejercicio1Relacion1;

//Crea un metodo que acepte un array de enteros y devuelva el mismo array ordenado
//de menor a mayor. Utiliza para ello el metodo de ordenación de la burbuja.

import java.util.Arrays;

public class Ejercicio12 {
    static void main(String[] args) {
     int[] primerArray = {5,1,3,2,4,6};
        int[] resultado = burbujaDeNumeros(primerArray);
        // Con este sout te muestra como si vieras el array, por dentro.
        System.out.println(Arrays.toString(resultado));

//        for (int i = 0; i < resultado.length; i++) {
//            System.out.println(resultado[i]);
//        }
    }
    // Usamos dos for porque el metodo burbuja necesita repetir el recorrido del array varias veces.
    public static int[] burbujaDeNumeros(int[] arrays) {
        int t = 0; // Esta variable nos ayuda para ir guardando los numeros.
        // Este for nos ayuda a recorrer el arrays hasta que todos los numeros esten ordenados.
        for (int i = 0; i < arrays.length ; i++) {
            // Este for compara el primer numero del array y compara con los siguientes hasta que haya uno mayor.
          for (int j = 0; j < arrays.length -1 -i; j++) {
               if (arrays[j] > arrays[j+1]) {
                   t = arrays[j];
                    arrays[j] = arrays[j+1];
                   arrays[j+1] = t;
                }
            }
        }
      return arrays;
    }
}
