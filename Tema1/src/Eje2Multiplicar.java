import java.util.Scanner;
/*Realizar un programa que lea un número entero entre 0 y 10 y visualice su
tabla de multiplicar.
Por ejemplo si el numero es 7 debe aparecer
Tabla del 7
7*0=0
7*1=7
…..
7*10=70*/
public class Eje2Multiplicar {
    static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.println("Dame un número del 1 al 10");
        int num = tec.nextInt();
        for (int num2 = 0; num2 <= 10; num2++){
            int mul = num2*num;
            System.out.println(num2 + "*" + num + "=" + mul);
        }
    }
}
