//Realizar un programa que solicite edades hasta que se introduzca un 0.
// Al terminar, debe informar de cuál es la edad mayor y de cuántas personas son
// mayores de edad (18 años o más). El 0 no cuenta como edad.

import java.util.Scanner;

public class edades {
    static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int edad;
        int edadMayor = 0;
        int contador = 0;

        do {
            System.out.println("Dime una edad");
            edad = tec.nextInt();
            if (edad > edadMayor){
                edadMayor = 0;
                edadMayor += edad;
            }
            if (edad >= 18){
                contador = contador + 1;
            }
        }while (edad != 0);
        System.out.println("La edad mayor es " + edadMayor);
        System.out.println("Hay " + contador + " personas mayores de edad");
    }
}
