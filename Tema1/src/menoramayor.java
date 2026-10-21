//Realizar un programa que solicite 3 números cualesquiera y los muestre por
//pantalla ordenados de menor a mayor.


import java.util.Scanner;

public class menoramayor {
    static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

         double nummenor;

        System.out.println("Introduce un numero");
        double num1 = tec.nextDouble();
        System.out.println("Introduce otro numero");
        double num2 = tec.nextDouble();
        System.out.println("Introduce otro numero");
        double num3 = tec.nextDouble();

        if (num1 > num2){
            nummenor = num1;
            num1 = num2;
            num2 = nummenor;
        }
        if (num1 > num3){
            nummenor = num1;
            num1 = num3;
            num3 = nummenor;
        }
        if (num2 > num3){
            nummenor = num2;
            num2 = num3;
            num3 = nummenor;
        }

        System.out.println("los números ordenados de menor a mayor son: " + num1 + " " + num2 + " " + num3);
    }
}
