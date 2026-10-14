import java.util.Scanner;

public class Eje6Enteros {
    static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.println("Introduce un número A");
        int num = tec.nextInt();
        System.out.println("Introduce un número B");
        int num2= tec.nextInt();

        int resultado = 0;

        for (int i = 0; i < num2; i++){
            resultado = resultado + num;
        }
        System.out.println("La multiplicación de " + num + " es " + resultado);
    }
}
