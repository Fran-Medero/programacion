package Ejercicio1Relacion1;

//Crea un programa que implemente una estructura de pila de números enteros. Una
//estructura de pila es aquella que permite almacenar elementos de la manera “último
//en entrar, primero en salir (LIFO - Last in first out)”. Crea un metodo main, donde
//hagas llamadas a un metodo apilar para añadir elementos y otro metodo desapilar
//para eliminarlos. Muestra el array tras cada una de las operaciones. La pila tendrá
//como máximo 10 números enteros.

public class Ejercicio13 {
    static void main(String[] args) {
        int[] numerosEnPila = new int[10];
        int preguntaUsuario = MiEntradaSalida.leerEntero("¿Quieres 1.Apilar, 2.Desapilar?");
        switch (preguntaUsuario) {
            case 1:
                int numero = MiEntradaSalida.leerEntero("¿Qué número quieres añadir?");
                numerosEnPila = apilarNumerosAtras(numerosEnPila, preguntaUsuario);
                break;
            case 2:
                numerosEnPila = desapilarNumeros(numerosEnPila, preguntaUsuario);
                break;
            default:

        }

        System.out.println(preguntaUsuario);

    }

    static public int apilarNumerosAtras(int[] array, int a) {
        int contador = 0;
        a = array[contador++];
        return contador;
    }

    static public int[] desapilarNumeros(int[] arrays, int b) {
        in
    }
}
