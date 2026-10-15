import java.util.Scanner;

//Ejercicio 3. Realizar un programa que solicite números enteros hasta que el usuario
// introduzca un 0. Al terminar, debe informar de cuántos números positivos y cuántos
// negativos se han introducido (el 0 no cuenta).

public class Practica3 {
    static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int num;
        int contador = 0;
        int contador2 = 0;

        do {
            System.out.println("Vas a introducir numeros hasta que pongas 0");
            num = tec.nextInt();

            if (num > 0){
                contador = contador + 1;
            } else if (num < 0) {
                contador2 = contador2 + 1;
            }
            // Si es 0 no se cuenta y el bucle termina
        }while (!(num == 0));

        System.out.println("Has puesto: " + contador + " positivos");
        System.out.println("Has puesto: " + contador2 + " negativos");


    }
}
