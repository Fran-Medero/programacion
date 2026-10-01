import java.util.Scanner;

public class Problema2 {
    static void main(String[] args) {
        Scanner tec =  new Scanner(System.in);

        System.out.println("Dame un número");
        int num1 = tec.nextInt();

        System.out.println("Dame otro número");
        int num2 = tec.nextInt();

        if (num1 >  num2) {
            System.out.println("El número " + num1 + " es mayor que " + num2);
        }
        else if ( num1 < num2) {
            System.out.println("El número " + num1 + " es menor que " + num2);
        }
        else {
            System.out.println("Los números " + num1 + " y " + num2 + " son iguales");
        }
    }
}
