package Ejercicio1Relacion1;
// Crea un programa que compruebe si un array contiene un determinado valor. Para
//ello, puedes pedir por parámetros el tamaño del array, los elementos y luego el
//elemento a buscar, o puedes generar el array aleatorio y pedir únicamente el
//elemento a buscar.
public class Ejercicio6 {
    static void main(String[] args) {
        // Creamos el Arrays y le pedimos el tamaño.
        int tamano = MiEntradaSalida.leerEntero("Dime el tamaño del arrays");
        int[] miArray = new int[tamano];
        // Guardamos los números que no dará el usuario en las posiciones del Arrays.
        for (int i = 0; i < tamano; i++) {
            miArray[i] = MiEntradaSalida.leerEntero("dime números para llenar el array");
        }
        // Guardamos el número que queremos buscar
        int numeroBuscar = MiEntradaSalida.leerEntero("¿Que buscas?");
        // Llamamos al metodo.
        numeroBuscado(miArray, numeroBuscar);
        // Mostramos el número que nos dio.
        if (numeroBuscado(miArray, numeroBuscar) == -1) {
            System.out.println("no esta");
        } else {
            System.out.println("Tú número está en la posición " + numeroBuscado(miArray, numeroBuscar));
        }
    }
    public static int numeroBuscado(int[] array, int numeroBuscar) {
        // En el for, buscamos el número hasta encontrarlo en su posición, y se lo mostramos.
        for (int i = 0; i < array.length ; i++) {
            if (numeroBuscar == array[i]){
                return i;
            }
        }
        return -1;
    }
}
