import java.util.Scanner;

public class Conversion {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número");
        String c = teclado.nextLine();
        double num = Double.parseDouble(c);
        double num2 = Double.parseDouble(teclado.nextLine());

        int numero = Integer.parseInt(teclado.nextLine());
    }
}
