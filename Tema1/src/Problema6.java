import java.util.Locale;
import java.util.Scanner;

public class Problema6 {
    static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Dame una letra");
        char letra = tec.nextLine().toLowerCase(Locale.ROOT).charAt(0);
        if (letra == 'a') {
            System.out.println("Tu letra es la primera vocal " + letra);
        }else if (letra == 'e') {
            System.out.println("Tu letra es la segunda vocal " + letra);
        }else if (letra == 'i') {
            System.out.println("Tu letra es la tercera vocal " + letra);
        }else if (letra == 'o') {
            System.out.println("Tu letra es la cuarta vocal " + letra);
        }else if (letra == 'u') {
            System.out.println("Tu letra es la quinta vocal " + letra);
        } else {
            System.out.println("La letra no es una vocal, inténtalo de nuevo");
        }
    }
}
