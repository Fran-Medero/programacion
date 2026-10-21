package Ejercicios;

import java.util.Scanner;

public class NumeroInversa {
    static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.println("Introduce un numero para dartelo a la inversa");
        int num = tec.nextInt();
        int inversa = 0;
        int ud = 0;

        while (num > 0){
            ud = num % 10;
            inversa = inversa * 10 + ud;
            num = num / 10;
        }
        System.out.println("El numero de a la inversa es " + inversa);
    }
}
