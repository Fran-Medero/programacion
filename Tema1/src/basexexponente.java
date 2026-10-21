import java.util.Scanner;

public class basexexponente {
    static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int num1;
        int num2;
        int calculo = 1;

        do {
            System.out.println("Introduce un numero para la base, positivo y entero");
            num1 = tec.nextInt();
            System.out.println("Introduce un numero para el exponente, positivo y entero");
            num2 = tec.nextInt();
        }while (num1 <= 0 || num2 <= 0);

        for (int i = 0; i < num2; i++){
            calculo *= num1;
        }

        System.out.println(" La base " + num1 + " elevado a " + num2 + " es = " + calculo);
    }
}
