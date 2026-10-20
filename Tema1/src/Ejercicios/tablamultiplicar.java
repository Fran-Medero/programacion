import java.util.Scanner;

public class tablamultiplicar {
    static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int multi = 0;

        System.out.println("Introduce un numero para su tabla de multiplicar");
        int num = tec.nextInt();

        for (int i = 0; i <= 10; i++){
            multi = num * i;
            System.out.println(num + " * " + i + " = " + multi);
        }
    }
}
