//Realizar un programa que solicite un número entero positivo y muestre
// todos sus divisores y cuántos tiene. Si el dato es incorrecto, debe volver a solicitarse.

import java.util.Scanner;

public class todosLosDivisores {
    static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int num;
        int contador = 0;

        do {
            System.out.println("Introduce un numero entero positivo");
            num = tec.nextInt();
        }while (num <= 0);

        for (int i = 1; i <= num; i++){
            if (num % i == 0){
                System.out.println(i + " ");
                contador = contador + 1;
            }
        }
        System.out.println();
        System.out.println(" El numero " + num + " tiene " + contador + " divisores");
    }
}