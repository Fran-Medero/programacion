package Ejercicio1Relacion1;

//Crea un programa que implemente una estructura de pila de números enteros. Una
//estructura de pila es aquella que permite almacenar elementos de la manera “último
//en entrar, primero en salir (LIFO - Last in first out)”. Crea un metodo main, donde
//hagas llamadas a un metodo apilar para añadir elementos y otro metodo desapilar
//para eliminarlos. Muestra el array tras cada una de las operaciones. La pila tendrá
//como máximo 10 números enteros.

import java.util.Arrays;

public class Ejercicio13 {
    static int contador = 0; // cuántos números hay guardados en la pila

    public static void main(String[] args) {
        int[] numerosEnPila = new int[10];
        int preguntaUsuario;

        do {
            preguntaUsuario = MiEntradaSalida.leerEntero("¿Quieres 1.Apilar, 2.Desapilar, 0.Salir?");
            switch (preguntaUsuario) {
                case 1:
                    int numero = MiEntradaSalida.leerEntero("¿Qué número quieres añadir?");
                    apilarNumerosAtras(numerosEnPila, numero);
                    System.out.println(Arrays.toString(Arrays.copyOf(numerosEnPila, contador)));
                    break;
                case 2:
                    desapilarNumeros(numerosEnPila);
                    System.out.println(Arrays.toString(Arrays.copyOf(numerosEnPila, contador)));
                    break;
                case 0:
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (preguntaUsuario != 0);
    }

    static public void apilarNumerosAtras(int[] array, int a) {
        if (contador == array.length) {
            System.out.println("La pila está llena");
        } else {
            array[contador] = a; // 'a' es el número que mete el usuario
            contador++;
        }
    }

    static public void desapilarNumeros(int[] arrays) {
        if (contador == 0) {
            System.out.println("La pila está vacía");
        } else {
            contador--;
            System.out.println("Se ha sacado el " + arrays[contador]);
        }
    }
}