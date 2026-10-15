import java.util.Scanner;
/*Realizar un programa que muestre por pantalla todos los números
comprendidos entre 1 y 100 que son múltiplos de 7 o de 13. Debe mostrar
un mensaje indicando si el número es múltiplo de 7 o de 13. Si el número
es múltiplo de 7 y de 13 a la vez, deben aparecer dos mensajes.*/

public class EjeMultiplos {
    static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        for (int num = 1; num <= 100; num++) {
            if (num % 7 == 0){
                System.out.println("El número " + num + " es múltiplo de 7");
            }
            if (num % 13 == 0){
                System.out.println("El número " + num + " es múltiplo de 13");
            }
        }
    }
}
