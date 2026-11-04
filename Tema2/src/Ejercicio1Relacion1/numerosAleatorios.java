package Ejercicio1Relacion1;

import java.util.Random;

public class numerosAleatorios {
    static void main(String[] args) {

        int llamarMetodos = 0;
        numerosAleatorios.numeroRamdom2(llamarMetodos);
    }
    public static void numeroRamdom1(int random) {
        // Forma 1: Clase Ramdom
        Random r = new Random();
        for (int i = 0; i < 11; i++) {
            System.out.println(r.nextInt(-10, 10));
        }
    }
    public static void numeroRamdom2(int random){

        // Forma 2: Clase Math
        for (int i = 0; i < 8; i++) {
            System.out.println((Math.random() * 20) - 10);
        }
    }
}
