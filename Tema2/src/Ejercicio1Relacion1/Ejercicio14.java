package Ejercicio1Relacion1;

// Crea un programa que implemente una estructura de cola de números enteros. Una
//estructura de cola es aquella que permite almacenar elementos de la manera
//“primero en entrar, primero en salir (FIFO - First in first out)”. Crea un metodo main,
//donde hagas llamadas a un metodo encolar para añadir elementos y otro metodo
//desencolar para eliminarlos. Muestra el array tras cada una de las operaciones. La
//cola tendrá como máximo 10 números enteros. Ejemplo de utilización:

import java.util.Arrays;

public class Ejercicio14 {
    static int primero = 0;  // índice donde está el primer elemento de la cola
    static int contador = 0;

    static void main(String[] args) {
        int[] array = new int[10];
        int preguntaUsuario;

       do {
            preguntaUsuario = MiEntradaSalida.leerEntero("1. Para poner algún número en cola, 2. Desencolar el número, 0. Salir");
            switch (preguntaUsuario) {
                case 1:
                    preguntaUsuario = MiEntradaSalida.leerEntero("¿Qué número quieres añadir a la cola?");
                    cola(array, preguntaUsuario);
                    System.out.println(Arrays.toString(array));
                    break;
                case 2:
                    desencolar(array);
                    System.out.println(Arrays.toString(array));
                    break;
                case 0:
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("No valido");
            }
        }while (preguntaUsuario != 0);

    }
// Hay que hacerlo primer elemento + numero del elemento % tamaño del array, como quiere el MAESTRO.

    static public void cola(int[] arrays, int numero) {
        // array[0] + numero % array.length
       if (contador == arrays.length) {
           System.out.println("El Array está lleno");
       } else {
           int posicion = (primero + contador) % arrays.length;
           arrays[posicion] = numero;
           contador++;

       }
    }

    static public void desencolar(int[] arrays) {
        if (contador == 0) {
            System.out.println("El arrays esta vacio");
        } else {
            System.out.println("Se ha quitado " + arrays[primero]);
            arrays[primero] = 0;
            primero = ( primero + 1) % arrays.length;
            contador--;

        }
    }
}
