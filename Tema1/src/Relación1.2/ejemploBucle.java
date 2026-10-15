import java.util.Scanner;

public class ejemploBucle {
    static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.println("Dame un número");
        int num1 = tec.nextInt();
        if (num1 <= 1) {
            System.out.println("Introduce un número mayor que 1");
        } else {
            int num2 = 2;
            while (num1 % num2 != 0) {
                num2++;
            }
            System.out.println("El primer divisor de " + num1 + " es " + num2);
        }
    }
}