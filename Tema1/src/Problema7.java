
//Realizar un programa que lea el estado civil de una persona (S-Soltero, CCasado, V-Viudo y
//D-Divorciado) y su edad. Después debe mostrar por
//pantalla el porcentaje de retención que debe aplicársele de acuerdo con las
//siguientes reglas:
// A los solteros o divorciados menores de 35 años, un 12%
// Todas las personas mayores de 50 años, un 8.5%
// A los viudos o casados menores de 35 años, un 11.3%
// Al resto de casos se le aplica un 10.5%

import java.util.Locale;
import java.util.Scanner;

public class Problema7 {
    static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        String vocal;

        System.out.println("Dime tu estado civil S-Soltero, C-Casado, V-Viudo y D-Divorciado");
        vocal = tec.next().toUpperCase();
        System.out.println("Dime tu edad");
        int edad = tec.nextInt();

        if (vocal.equals("S") && edad < 35){
            System.out.println("Tienes un retencion del 12%");
        } else if (vocal.equals("D") && edad < 35) {
            System.out.println("Tienes un retencion de un 12%");
        }else if (edad > 50) {
            System.out.println("Tienes un retencion de un 8.5%");
        }else if (vocal.equals("V") && edad < 35) {
            System.out.println("Tienes un retencion de un 11.3%");
        }else if (vocal.equals("C") && edad < 35) {
            System.out.println("Tienes un retencion de un 11.3%");
        } else {
            System.out.println("Tienes un retencion de un 10%");
        }
    }
}
