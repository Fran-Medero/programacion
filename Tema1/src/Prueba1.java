import java.util.Scanner;

public class Prueba1 {
    static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.println("Introduce un número");
        int num1 = tec.nextInt();

        System.out.println("Introduce otro número");
        int num2 = tec.nextInt();

        int sum = num1 + num2;
        System.out.println("El resultado de la suma es " + sum);

        int res = num1 - num2;
        System.out.println("El resultado de la resta es " + res);

        int mult = num1 * num2;
        System.out.println("El resultado de la multiplicación es " + mult);

        int div = num1 / num2;
        System.out.println("El resultado de la división es " + div);
    }
}
