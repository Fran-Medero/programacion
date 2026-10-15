import java.util.Scanner;

/*Realizar un programa que solicite una cantidad de números que van a
introducirse por teclado. Después, para cada uno de ellos que indique si el
número es par o impar. Si la cantidad de números introducida es 0 o
negativa volverá a solicitarse el dato.
*/
public class Eje3ParImpar {
    static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        boolean esValido = false;
        int num;

        do {
            System.out.println("Dime cuantos números vas a introducir");
            num = tec.nextInt();
            if (num > 0) {
                esValido = true;
            } else System.out.println("Has introducido un número negativo");
        } while (!esValido);

        for (int i = 0; i < num; i++) {
            System.out.println("Introduce el numero");
            int numero1 = tec.nextInt();
            if (numero1 % 2 == 0) {
                System.out.printf("%d es un numero par\n", numero1);
            } else System.out.printf("%d no es par\n", numero1);
        }
    }
}