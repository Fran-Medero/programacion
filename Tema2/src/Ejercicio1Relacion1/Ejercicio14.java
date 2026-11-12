//package Ejercicio1Relacion1;
//
//// Crea un programa que implemente una estructura de cola de números enteros. Una
////estructura de cola es aquella que permite almacenar elementos de la manera
////“primero en entrar, primero en salir (FIFO - First in first out)”. Crea un metodo main,
////donde hagas llamadas a un metodo encolar para añadir elementos y otro metodo
////desencolar para eliminarlos. Muestra el array tras cada una de las operaciones. La
////cola tendrá como máximo 10 números enteros. Ejemplo de utilización:
//
//// Hay que hacerlo primer elemento + numero del elemento % tamaño del array, como quiere el MAESTRO.
//import java.util.Arrays;
//
//public class Ejercicio14 {
//    static int contador = 0;
//
//    static void main(String[] args) {
//        int[] array = new int[10];
//        int preguntaUsuario;
//
//        do {
//            preguntaUsuario = MiEntradaSalida.leerEntero("1. Para poner algún número en cola, 2. Desenolar el número, 0. Salir.");
//            switch (preguntaUsuario) {
//                case 1:
//                    preguntaUsuario = MiEntradaSalida.leerEntero("¿Qué número quieres añadir a la cola?");
//                    cola(array, preguntaUsuario);
//                    System.out.println(Arrays.toString(array));
//                    break;
//                case 2:
//                    desencolar(array, preguntaUsuario);
//                    System.out.println(Arrays.toString(array, contador));
//            }
//        }
//
//    }
//
//    static public void cola(int[] arrays, int numero) {
//       if (contador == arrays.length) {
//           System.out.println("El Array está lleno");
//       } else {
//           contador++;
//           arrays[contador] = numero;
//       }
//    }
//
//    static public void desencolar(int[] arrays, int numero) {
//
//    }
//}
