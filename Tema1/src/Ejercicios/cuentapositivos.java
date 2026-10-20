import java.util.Scanner;

public class cuentapositivos {
    static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int num = 0;
        boolean esValido = false;

        while (!esValido) {
            System.out.println("Introduce un numero");
            int num1 = tec.nextInt();

            if (num1 < 0) {
                esValido = true;
            } else {
                num++;
            }
        }
        System.out.println("Hay " + num + " numeros positivos");
    }
}
