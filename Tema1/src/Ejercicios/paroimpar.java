import java.util.Scanner;

public class paroimpar {
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
