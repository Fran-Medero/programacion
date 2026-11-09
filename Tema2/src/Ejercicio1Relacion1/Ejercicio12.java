package Ejercicio1Relacion1;

//Crea un metodo que acepte un array de enteros y devuelva el mismo array ordenado
//de menor a mayor. Utiliza para ello el metodo de ordenación de la burbuja.

public class Ejercicio12 {
    static void main(String[] args) {
        int[] primerArray = {5,1,3,2,4};
        int[] resultado = burbujaDeNumeros(primerArray);
        System.out.print(resultado);
    }
    public static int[] burbujaDeNumeros(int[] arrays) {
        int t = 0;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] > i+1) {
                t = arrays[i];
                arrays[i] = arrays[i+1];
                arrays[i+1] = t;
            }
        }
      return arrays;
    }
}
