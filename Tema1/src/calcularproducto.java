import java.util.Scanner;

public class calcularproducto {
    static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int numA;
        int numB;
        int mul = 0;

        System.out.println("Introduce un numero entero");
        numA = tec.nextInt();
        System.out.println("Introduce otro numero entero");
        numB = tec.nextInt();

        for (int i = 0; i < numB; i++){
           mul += numA;
        }
        System.out.println("La multiplicacion sin usar el operador * es " + mul);
    }
}
