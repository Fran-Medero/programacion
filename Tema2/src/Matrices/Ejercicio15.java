package Matrices;

import Ejercicio1Relacion1.MiEntradaSalida;

public class Ejercicio15 {
    static int resultado = 0;
    static void main(String[] args) {
        int[][] matriz = {{1,2,3,4,5,6}, {7,8,9,10,11,12}, {13,14,15,16,17,18}, {19,20,21,22,23,24}, {25,26,27,28,29,30}, {31,32,33,34,35,36}};
        int fila;
        int columna;

        do {
            fila = MiEntradaSalida.leerEntero("Dame el número de la fila");
        } while (fila < 0 || fila > 6);

        do {
            columna = MiEntradaSalida.leerEntero("Dame el número de la columna");
        } while (columna < 0 || columna > 6);

        resultado = fila * matriz.length + columna +1;

        System.out.println(resultado);


    }
}
