package Ejercicio1Relacion1;

import java.util.Scanner;
/*Crea un programa que detecte cuántos números negativos hay en un array de
enteros */

    public class Ejercicio2 {
        Scanner tec = new Scanner(System.in);
        static void main(String[] args) {
            int[] arraysNumerosNegativos = {-1,2,-4,-6,5};
            int resultado = cuentaNumerosNegativos(arraysNumerosNegativos);
            System.out.println("Hay " + resultado + " números negativos");
        }

        public static int cuentaNumerosNegativos(int[] array){
            int suma = 0;
            for (int i = 0; i < array.length; i++){
                if (array[i] < 0){
                    suma += 1;
                }
            }
            return suma;
        }
    }
