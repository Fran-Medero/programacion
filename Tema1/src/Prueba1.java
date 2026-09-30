import java.util.Scanner;

public class Prueba1 {
    static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        tec.useLocale(java.util.Locale.US);

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

        System.out.println("Introduce un numero con decimales");
        double num3 = tec.nextDouble();

        System.out.println("Otro igual que el anterior");
        double num4 = tec.nextDouble();

        double suma = num3 + num4;
        System.out.println("La suma de los decimales es " + suma);
    }
}
