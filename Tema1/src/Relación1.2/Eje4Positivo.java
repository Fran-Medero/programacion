import java.util.Scanner;
/*Realizar un programa que lea un número estrictamente positivo N y
muestre la suma de los N primeros números. Diseña el programa de forma
que si N es incorrecto vuelva a solicitarse.
*/
public class Eje4Positivo {
    static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Dime un número positivo");
        int num = 0;
        do {
            System.out.println("Introduce un número");
            num = tec.nextInt();

            if (num <= 0){
                System.out.println("Debe ser mayor que positivo o mayor que 0");
            }

        } while (num <= 0);

        for (int n1 = 1; n1 <= num; n1++){
            int sum = num + n1;
            System.out.println("La suma de " + num +" ");
        }
    }
}
