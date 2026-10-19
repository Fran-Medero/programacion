import java.util.Scanner;

public class Eje10Solicitar {
    static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int num;
        int factorial = 1;

        //Pedir el número y validarlo
        do {
            System.out.println("Introduce un numero para calcular su factorial");
            num = tec.nextInt();
        }while (num < 0);

        if (num == 0){
            System.out.println("El factorial de 0 es 1" );
        }

        //Calcular el factorial
        //En cada vuelta: “coge lo que había en factorial, multiplícalo por i y guárdalo otra vez en factorial
        for (int i = 1; i <= num; i++){
            factorial *= i;
        }

        System.out.println("El factorial de " + num + " es " + factorial);
    }
}
