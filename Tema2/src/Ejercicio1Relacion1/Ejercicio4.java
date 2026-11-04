package Ejercicio1Relacion1;
// Soluciona el siguiente problema del anterior boletín utilizando arrays. Crea un
//programa que cree 6000 números aleatorios de 0 a 100 (usa una constante para fijar
//este número).
//Muestra:
//● La media de los números leídos.
//● El dígito en el que más números terminan.
//● En qué dígitos no ha terminado ningún número.
//● Cuántos números terminan en cada uno de los dígitos (0 .. 9).
//● Calcula a qué % del total de números creados equivale cada elemento del
//punto anterior.
//● Calcula también la suma total de todos los porcentajes calculados y la media
//de porcentajes para los valores contados (es decir, la suma de todos los
//porcentajes entre 6 (los valores 0, 1, 2, 3, 4 y 5))

import java.util.Random;

public class Ejercicio4 {

    // Creamos la constante.
    static final int TOTAL_NUMEROS = 6000;

    static void main(String[] args) {
        // Creamos el Arrays donde crearemos los contadores.
        int[] terminaciones = new int[10];
        // Creamos el número aleatorio.
        Random r = new Random();
        // Creamos la variable suma antes del for.
        int suma = 0;

        for (int i = 0; i < TOTAL_NUMEROS; i++) {
            int numerosAleatorios = r.nextInt(0, 100);
            suma += numerosAleatorios;

            // Guardamos las terminaciones en nuestra Arrays que creamos para dicha acción.
            terminaciones[numerosAleatorios % 10]++;
        }
    }
}
