import java.util.Scanner;

public class Problema5 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dame un número");
        int num1 = teclado.nextInt();
        System.out.println("Dame otro número");
        int num2 = teclado.nextInt();
        System.out.println("Dame otro número");
        int num3 = teclado.nextInt();
        System.out.println("Dame otro número");
        int num4 = teclado.nextInt();

        double media = (num1 + num2 + num3 + num4)/4.;
        System.out.println("La media es " + media);
        if (num1 > media) {
            System.out.println("El " + num1 + " es mayor que la media");
        }
        if (num2 > media) {
            System.out.println("El " + num2 + " es mayor que la media");
        }
        if (num3 > media) {
            System.out.println("El " + num3 + " es mayor que la media");
        }
        if (num4 > media) {
            System.out.println("El " + num4 + " es mayor que la media");
        }
    }
}
