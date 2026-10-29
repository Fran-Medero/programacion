package Relacion1_1;

//1. Crea un programa que sume todas las posiciones pares de un array de enteros.

import java.util.Scanner;

public class Ejercicio1 {

    Scanner tec = new Scanner(System.in);
    static void main(String[] args) {
        int[] arrayEnteros = {1,2,3,4,5,6};
        int resultado= sumaPosicionesPares(arrayEnteros);
        System.out.println("La suma es " + resultado);

    }

    public static int sumaPosicionesPares(int[] arrayEnteros){
        int suma = 0;
        for (int i = 0; i < arrayEnteros.length; i++) {
            if (i % 2 == 0){
                suma = suma + arrayEnteros[i];
            }
        }
        return suma;
    }
}
