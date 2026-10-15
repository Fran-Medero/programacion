import java.util.Scanner;

public class Problema4 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime tu edad");
        int edad = teclado.nextInt();

        if (edad > 100) {
            System.out.println("Error");
        } else if (edad <= 12) {
            System.out.println("Eres un niño");
        } else if (edad <= 17) {
            System.out.println("Eres un adolescente");
        } else if (edad <= 29) {
            System.out.println("Eres un joven ");
        } else {
            System.out.println("Eres un adulto");
        }

    }
}
