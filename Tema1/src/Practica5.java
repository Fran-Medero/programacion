import java.util.Scanner;
//Ejercicio 5. Realizar un programa que solicite un número entero positivo e informe
// de si es primo. Un número es primo cuando solo es divisible entre 1 y entre sí mismo.
// Ejemplos: 7 es primo; 9 no lo es porque 9 = 3·3. Si el dato es incorrecto, debe volver a
// solicitarse.
//
//Pista: te sirve el % del ejercicio del número perfecto. Piensa qué tendrías que contar o qué boolean podrías usar.
public class Practica5 {

    static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int num;
        int divisor = 0;

        do {
            System.out.println("Introduce un numero entero positivo");
            num = tec.nextInt();
        }while (num <= 0);

        // Suponemos que es primo (salvo el 1, que no lo es)
        boolean esPrimo = num > 1;

        // Probamos de 2 a num-1. Si alguno divide exacto, ya no es primo
        for (int i = 2; i < num; i++){
            if (num % i == 0){
               esPrimo = false;
            }
        }
        if (esPrimo){
            System.out.println("El numero " + num + " es primo");
        } else {
            System.out.println("El numero " + num + " no es primo");
        }
    }
}
