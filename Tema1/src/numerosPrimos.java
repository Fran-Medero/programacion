import java.util.Scanner;

public class numerosPrimos {
    static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int num;
        int num2 = 2;
        int calculo;
        int resto = 0;

        System.out.println("Introduce un numero, para ver si es primo o no");
        num = tec.nextInt();

        do {
            calculo = num % num2;
            num2 =  num2 + 1;
        }while (num2 < num && calculo != 0);

        if (num == num2){
            System.out.println("El numero " + num + " es primo");
        }else {
            System.out.println("El numero " + num + " no es primo");
        }
    }
}
