import java.util.Scanner;

/*Realizar un programa que lea un número entero positivo y averigüe si es
perfecto. Un número es perfecto cuando es igual a la suma de sus divisores
excepto él mismo. Diseñar el programa de forma que si algún dato es
incorrecto vuelva a solicitarse.
Ejemplos:
El número 6 es perfecto porque es igual que 1+2+3=6
El número 8 no es perfecto porque 1+2+4=7
*/
public class Eje9perfecto {
    static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int num;
        int contador = 0;

        //Pedimos el numero y validamos
        do {
            System.out.println("Introduce un número");
            num = tec.nextInt();
        }while (num <= 0);

        //Buscar los divisores y sumarlos
        //Este for prueba todos los números desde el 1 hasta el num - 1
        for (int i = 1; i < num; i++){
            //El % da el resto de la división. Si el resto es 0, no sobra nada, así que i es divisor.
            if (num % i == 0){
                contador += i;
            }
        }

        if (contador == num) {
            System.out.printf("El numero " + num + " es perfecto");
        } else {
            System.out.printf("El numero " + num + " no es perfecto");
        }
    }
}
