import java.util.Scanner;

//Ejercicio 6. Realizar un programa que solicite un número entero positivo y muestre cuántas
// cifras tiene. Ejemplo: 4521 tiene 4 cifras. Si el dato es incorrecto, debe volver a solicitarse.
//
//Pista: ¿qué pasa si divides un número entero entre 10 una y otra vez? Piensa en cuántas veces
// puedes hacerlo hasta llegar a 0.

public class Practica6 {
    static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int num;
        int copia;
        int cuenta = 0;

        do {
            System.out.println("Introduce un numero");
            num = tec.nextInt();
        }while (num <= 0);

        copia = num;

        while ( copia > 0){
            copia = copia / 10;
            cuenta = cuenta + 1;
        }

        System.out.println(num + " tiene " + cuenta + " cifras");

    }
}
