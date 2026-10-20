import java.util.Scanner;

public class Ejercicio2 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dame un número");
        double n1 = Double.parseDouble(teclado.nextLine());

        System.out.println("Dame otro númeor");
        double n2 = Double.parseDouble(teclado.nextLine());

        double suma = n1 + n2;
        double resta = n1 - n2;
        double multi = n1 * n2;
        double div = n1 / n2;

        System.out.println("La suma es " + suma );
        System.out.println("La resta es " + resta );
        System.out.println("La multi es " + multi );
        System.out.println("La div es " + div );

    }
}
