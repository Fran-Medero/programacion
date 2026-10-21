import java.util.Scanner;

public class NumeroSecreto {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        // Número secreto aleatorio entre 1 y 100
        int secreto = (int) (Math.random() * 100 + 1);

        int num;
        int intentos = 0;

        do {
            System.out.println("Introduce un número (intento " + (intentos + 1) + " de 5)");
            num = tec.nextInt();
            intentos = intentos + 1; // cuenta como intento aunque esté fuera de rango

            if (num < 1 || num > 100) {
                System.out.println("El numero debe estar entre 1 y 100");
            } else if (num > secreto) {
                System.out.println("El número introducido es mayor que el secreto");
            } else if (num < secreto) {
                System.out.println("El número introducido es menor que el secreto");
            }
            // Si num == secreto no se muestra nada aquí: el bucle termina y se felicita abajo

        } while (num != secreto && intentos < 5);

        if (num == secreto) {
            System.out.println("¡Has ganado! El número secreto era " + secreto);
        } else {
            System.out.println("Has perdido. El número secreto era " + secreto);
        }
    }
}
