import java.util.Scanner;

public class sumas {
    static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int num;
        int suma = 0;

        do {
            System.out.println("Introduce un numero entero y positivo");
            num = tec.nextInt();
        }while (num <= 0);

        for (int i = 1; i <= num; i++){
            suma += i;
        }
        System.out.println("La suma de " + num + " es " + suma);
    }
}
