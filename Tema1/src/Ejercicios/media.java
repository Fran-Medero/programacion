package Ejercicios;

import java.util.Scanner;

public class media {
    static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int cantidad;
        double suma = 0;

        do {
            System.out.println("Cuantos numeros vas a introducir");
            cantidad = tec.nextInt();
        }while ( cantidad < 0);


        for (int i = 1; i <= cantidad; i++){
            System.out.println("Introduce el numero " + i);
            suma = suma + tec.nextDouble();
        }

        double media = suma / cantidad;
        System.out.println("la media es " + media);

    }
}
