import java.util.Scanner;

public class numerodecifras {
    static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int num1;
        int recuento = 0;

        System.out.println("Introduce un numero entero");
        num1 = tec.nextInt();
        int copia = num1;

        do {
            copia = copia / 10;
            recuento = recuento + 1;
        }while (copia != 0);

        System.out.println("El numero " + num1 + " tiene " + recuento + " cifras");
    }
}
