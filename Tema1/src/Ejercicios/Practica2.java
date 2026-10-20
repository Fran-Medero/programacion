import java.util.Scanner;
//Ejercicio 2. Realizar un programa que solicite un número entero positivo y calcule la
// suma de todos los números desde 1 hasta ese número.
// Ejemplo: para 4, la suma es 1+2+3+4=10. Si el dato es incorrecto, debe volver a solicitarse.

public class Practica2 {
    static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int num;
        int acumulador = 0;

        do {
            System.out.println("introduce un numero entero");
            num = tec.nextInt();
        }while (num <= 0);

        for (int i = 1; i <= num; i++){
            acumulador = acumulador + i;
        }

        System.out.println("la suma desde 1 hasta " + num + " es " + acumulador);
    }
}
