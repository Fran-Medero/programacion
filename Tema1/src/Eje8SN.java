import java.util.Locale;
import java.util.Scanner;

public class Eje8SN {

    static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int cantidad;
        int menor = 0;
        boolean esValido = true;
        String s;

        //1. Pedir los numeros que va a introducir
        do {
            System.out.println("Introduce un numero");
            cantidad = tec.nextInt();
            //si es el primer número o es menor que el menor que tengo, me lo quedo
            //Ver cual es el numero menor de los que ha introducido
            if (esValido || cantidad < menor){
                //Me quedo con este número como el nuevo menor
                menor = cantidad;
                esValido = false;
            }

            do {
                System.out.println("Deseas introducir mas numeros (S/N)");
                //tuUpperCase nos ayuda para las minusculas y las mayusculas, le da igual una que otra
                s = tec.next().toUpperCase();
            } while (!s.equals("S") && !s.equals("N"));

        } while (s.equals("S"));

        System.out.println("El numero menor es " + menor);
    }
}
