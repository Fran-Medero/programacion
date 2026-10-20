import java.util.Locale;
import java.util.Scanner;
//Ejercicio 4. Realizar un programa que solicite un conjunto de números.
// Después de introducir cada número se realizará la pregunta:
// “¿Desea introducir más números (S/N)?”. Si la respuesta es ‘S’ se solicitará otro número.
// Cuando no desee introducir más, debe informar de cuál es el mayor de los números introducidos
// y de cuántos números se han introducido. Debe comprobarse que la respuesta es ‘S’ o ’N’ y,
// si no lo es, volver a pedirla.

public class Practica4 {
    static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int num;
        int mayor = 0;
        String s;
        int contador = 0;
        boolean esValido = true;

        do {
            System.out.println("Dame un numero");
            num = tec.nextInt();
            contador = contador + 1;

            if (esValido || num > mayor){
                mayor = num;
                //Ya hay un número guardado, así que a partir de ahora solo se entrará al if
                // si el número nuevo es realmente mayor.
                esValido = false;
            }


            do {
                System.out.println("¿Desea introducir más números (S/N)?");
                s = tec.next().toUpperCase();
            }while (!s.equals("S") && (!s.equals("N")));

        }while (s.equals("S"));

        System.out.println("El numero mayor es " + mayor);

    }
}
