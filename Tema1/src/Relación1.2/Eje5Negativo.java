/*. Realizar un programa que solicite números hasta que se introduzca un número
negativo. Cuando termine informará de cuantos números positivos se han
introducido. En este programa el número 0 se considera positivo.*/


import java.util.Scanner;

public class Eje5Negativo {
    static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int num = 0;
        boolean salir = false;
        while (!salir){
            System.out.println("Introduce un número");
            int num1 = tec.nextInt();

            if (num1<0){
                salir = true;
            } else {
                num++;
            }
        }
        System.out.println("Has metido " + num + " números");
    }
}