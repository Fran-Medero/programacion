import java.util.Scanner;

public class Problema3 {
    static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.println("Dame un número");
        int num1 = tec.nextInt();

        if (num1 % 2 == 0) {
            System.out.println("El número " + num1 + " es múltiplo de 2");
        }
        if (num1 % 3 == 0) {
            System.out.println("El número " + num1 + " es múltiplo de 3");
        }
        else {
            System.out.println("No es múltiplo de NADA");
        }
    }
}
