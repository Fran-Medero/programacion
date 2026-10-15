import java.util.Scanner;
/* Ejercicio 1. Realizar un programa que solicite un número entero positivo y muestre su
 tabla de
multiplicar del 1 al 10. Diseñar el programa de forma que si el dato es incorrecto vuelva
 a solicitarse.*/

public class practicas1 {
    static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int num;

        do {
            System.out.println("Introduce un numero");
            num = tec.nextInt();
        } while (num < 0);

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
